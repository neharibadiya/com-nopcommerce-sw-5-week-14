package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    public void selectMenu(String menu){
        List<WebElement> menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        try{
            for( WebElement options : menuList) {
                if ( options.getText().equals(menu)) {
                    options.click();
                }
            }
        }catch (StaleElementReferenceException e) {
            menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        }
    }
    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement verifyComputer;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/electronics']")
    WebElement verifyElectronics;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/apparel']")
    WebElement verifyApparel;

    public String getVerifyComputer() {
        Reporter.log("getVerifyComputer" + verifyComputer.toString());
        CustomListeners.test.log(Status.PASS,"getVerifyComputer");
        return getTextFromElement(verifyComputer);
    }
    public String getVerifyElectronics() {
        Reporter.log("getVerifyElectronics" + verifyElectronics.toString());
        CustomListeners.test.log(Status.PASS,"getVerifyElectronics");
        return getTextFromElement(verifyElectronics);
    }
    public String getVerifyApparel() {
        Reporter.log("getVerifyApparel" + verifyApparel.toString());
        CustomListeners.test.log(Status.PASS,"getVerifyApparel");
        return getTextFromElement(verifyApparel);
    }

}
