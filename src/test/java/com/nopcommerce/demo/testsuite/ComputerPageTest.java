package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {
    ComputerPage computer;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        computer = new ComputerPage();
    }

    //*********************************  computer  *********************************//

    @Test(groups = {"sanity" , "regression"})
    public void verifyProductArrangeInAlphaBaticalOrder(){
        computer.clickOnComputer();
        computer.clickOnDesktop();
        computer.sortProductZToA();
    }
    @AfterMethod(alwaysRun = true)
    public void inIt1(){
        computer = new ComputerPage();
    }
}
