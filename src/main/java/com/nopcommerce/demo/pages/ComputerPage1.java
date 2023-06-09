package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage1 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='title']//a")
    WebElement desktopMenu;
    @CacheLookup
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement selectByValue;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyBuildYourOwn;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;
    @CacheLookup
    @FindBy(xpath = "//label[text()='400 GB [+$100.00]']")
    WebElement selectHDD;
    @CacheLookup
    @FindBy(xpath = "//label[text()='Vista Premium [+$60.00]']")
    WebElement selectOS;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommander;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyTotal;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyCartMsg;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeMsg;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]\");////a[@class='ico-cart']")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 cart-button']")
    WebElement clickOnGoToCart;
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement sendTextToQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement verifyTotal1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcome;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement clickOnCheckoutAsGuest;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement sendTextToFirstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement sendTextToLastName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement sendTextToEmail;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Company")
    WebElement sendTextToCompany;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement sendTextToCity;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement sendTextToAddress1;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address2")
    WebElement sendTextToAddress2;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement sendTextToPostalCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement sendTextToPhoneNumber;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement clickOnNextDayAir;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement clickOnContinueTab;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement clickOnCreditCard;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement clickOnMasterCard;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement verifyText1;
    public String getVerifyText1() {
        return getTextFromElement(verifyText1);
    }
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[2]")
    WebElement verifyText2;
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement verifyText3;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement conform;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement verifyText4;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyText5;
    @CacheLookup
    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button")
    By continueButton3;

    //****************************************************************************************************//
    public String getVerifyText2() {
        Reporter.log("getVerifyText2" + verifyText2.toString());
        CustomListeners.test.log(Status.PASS,"getVerifyText2");
        return getTextFromElement(verifyText2);
    }
    public void clickOnComputer() {
        Reporter.log("clickOnComputer" + computerMenu.toString());
        CustomListeners.test.log(Status.PASS,"clickOnComputer");
        clickOnElement(computerMenu);
    }

    public void clickOnDesktop() {
        Reporter.log("clickOnDesktop" + desktopMenu.toString());
        CustomListeners.test.log(Status.PASS," clickOnDesktop");
        clickOnElement(desktopMenu);
    }
    public void getSelectByValue(String value) {
        Reporter.log("getSelectByValue" + selectByValue.toString());
        CustomListeners.test.log(Status.PASS,"getSelectByValue");
        selectByValueFromDropDown(selectByValue, value);
    }

    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }

    public String getVerifyBuildYourOwn() {
        Reporter.log("getVerifyBuildYourOwn" + verifyBuildYourOwn.toString());
        CustomListeners.test.log(Status.PASS,"getVerifyBuildYourOwn");
        return getTextFromElement(verifyBuildYourOwn);
    }
    public void selectProcessorByValue(String value) {
        Reporter.log("selectProcessorByValue" + selectProcessor.toString());
        CustomListeners.test.log(Status.PASS,"selectProcessorByValue");
        selectByValueFromDropDown(selectProcessor, value);
    }

    public void selectRamByValue(String value) {
        Reporter.log("selectRamByValue" + selectRam.toString());
        CustomListeners.test.log(Status.PASS,"selectRamByValue");
        selectByValueFromDropDown(selectRam, value);
    }
    public void clickOnHDD400GB() {
        Reporter.log("clickOnHDD400GB" + selectHDD.toString());
        CustomListeners.test.log(Status.PASS,"clickOnHDD400GB");
        clickOnElement(selectHDD);
    }

    public void clickOnOsVistaPremium() {
        Reporter.log("clickOnOsVistaPremium" + selectOS.toString());
        CustomListeners.test.log(Status.PASS,"clickOnOsVistaPremium");
        clickOnElement(selectOS);
    }
    public void clickOnSoftwareTotalCommander() {
        Reporter.log("clickOnSoftwareTotalCommander" + totalCommander.toString());
        CustomListeners.test.log(Status.PASS,"clickOnSoftwareTotalCommander");
        clickOnElement(totalCommander);
    }
    public String verifyTotalPrice() {
        Reporter.log("verifyTotalPrice" + verifyTotal.toString());
        CustomListeners.test.log(Status.PASS,"verifyTotalPrice");
        return getTextFromElement(verifyTotal);
    }

    public void clickOnAddToCartButton() {
        Reporter.log("clickOnAddToCartButton" + addToCartButton.toString());
        CustomListeners.test.log(Status.PASS,"clickOnAddToCartButton");
        clickOnElement(addToCartButton);
    }

    public String verifyCaryMessage() {
        Reporter.log("verifyCaryMessage" +verifyCartMsg.toString());
        CustomListeners.test.log(Status.PASS,"verifyCaryMessage");
        return getTextFromElement(verifyCartMsg);
    }
    public void closeMessageBar() {
        Reporter.log("closeMessageBar" + closeMsg.toString());
        CustomListeners.test.log(Status.PASS,"closeMessageBar");
        clickOnElement(closeMsg);
    }

    public String verifyShoppingCartMessage(){
        Reporter.log("verifyShoppingCartMessage" + shoppingCartMessage.toString());
        CustomListeners.test.log(Status.PASS,"verifyShoppingCartMessage");
        return getTextFromElement(shoppingCartMessage);
    }
    public void mouseHoverOnElementShoppingCart() {
        Reporter.log("mouseHoverOnElementShoppingCart" + mouseHoverOnShoppingCart.toString());
        CustomListeners.test.log(Status.PASS," mouseHoverOnElementShoppingCart");
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    public void clickOnGoToCart() {
        Reporter.log("clickOnGoToCart" + clickOnGoToCart.toString());
        CustomListeners.test.log(Status.PASS,"clickOnGoToCart");
        clickOnElement(clickOnGoToCart);
    }

    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(By.xpath("//input[@value='1']"));
        CustomListeners.test.log(Status.PASS,"clearTextInQuantityField");
        quantity.clear();
    }

    public void sendTextToQuantityField() {
        Reporter.log("sendTextToQuantityField" + sendTextToQuantity.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToQuantityField");
        sendTextToElement(sendTextToQuantity, "2");
    }

    public void clickOnUpdateShoppingCartButton() {
        Reporter.log("clickOnUpdateShoppingCartButton" + clickOnUpdateShoppingCart.toString());
        CustomListeners.test.log(Status.PASS,"clickOnUpdateShoppingCartButton");
        clickOnElement(clickOnUpdateShoppingCart);
    }
    public String verifyTotal1(){
        Reporter.log("verifyTotal1" + verifyTotal1.toString());
        CustomListeners.test.log(Status.PASS,"verifyTotal1");
        return getTextFromElement(verifyTotal1);
    }
    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        Reporter.log("clickOnCheckBoxIAgreeWithTermsAndCondition" + clickOnCheckbox.toString());
        CustomListeners.test.log(Status.PASS,"clickOnCheckBoxIAgreeWithTermsAndCondition");
        clickOnElement(clickOnCheckbox);
    }
    public void clickOnCheckOutButton() {
        Reporter.log("clickOnCheckOutButton" + clickOnCheckout.toString());
        CustomListeners.test.log(Status.PASS,"clickOnCheckOutButton");
        clickOnElement(clickOnCheckout);
    }
    public String verifyWelcomeText(){
        Reporter.log("verifyWelcomeTex" + verifyWelcome.toString());
        CustomListeners.test.log(Status.PASS,"verifyWelcomeText");
        return getTextFromElement(verifyWelcome);
    }

    public void clickOnCheckOutAsGuest() {
        Reporter.log("clickOnCheckOutAsGuest" + clickOnCheckoutAsGuest.toString());
        CustomListeners.test.log(Status.PASS,"clickOnCheckOutAsGuest");
        clickOnElement(clickOnCheckoutAsGuest);
    }
    public void sendTextToFirstNameField(String name) {
        Reporter.log("sendTextToFirstNameField" + name + sendTextToFirstName.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToFirstNameField");
        sendTextToElement(sendTextToFirstName, name);
    }
    public void sendTextToLastNameField(String lastName) {
        Reporter.log("sendTextToLastNameField" + lastName + sendTextToLastName.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToLastNameField");
        sendTextToElement(sendTextToLastName, lastName);
    }
    public void sendTextToEmailField(String email) {
        Reporter.log("sendTextToEmailField" + email + sendTextToEmail.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToEmailField");
        sendTextToElement(sendTextToEmail, email);
    }
    public void sendTextToCompanyField(String company) {
        Reporter.log("sendTextToCompanyField" + company + sendTextToCompany.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToCompanyField");
        sendTextToElement(sendTextToCompany, company);
    }
    public void selectCountryFromDropDownList() {
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "158");
        CustomListeners.test.log(Status.PASS,"selectCountryFromDropDownList");
    }
    public void sendTextToCityField(String city) {
        Reporter.log("sendTextToCityField" + city + sendTextToCity.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToCityField");
        sendTextToElement(sendTextToCity, city);
    }
    public void sendTextToAddressLine1(String address) {
        Reporter.log("sendTextToAddressLine1" + address + sendTextToAddress1.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToAddressLine1");
        sendTextToElement(sendTextToAddress1, address);
    }
    public void sendTextToAddressLine2(String address) {
        Reporter.log("sendTextToAddressLine2" + address +sendTextToAddress2.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToAddressLine2");
        sendTextToElement(sendTextToAddress2, address);
    }
    public void sendTextToPostcode(String postcode) {
        Reporter.log("sendTextToPostcode" + postcode + sendTextToPostalCode.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToPostcode");
        sendTextToElement(sendTextToPostalCode, postcode);
    }
    public void sendTextToPhoneNumberField(String number) {
        Reporter.log("sendTextToPhoneNumberField" +number + sendTextToPhoneNumber.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToPhoneNumberField");
        sendTextToElement(sendTextToPhoneNumber, number);
    }
    public void clickOnContinueButton() {
        Reporter.log("clickOnContinueButton" + clickOnContinue.toString());
        CustomListeners.test.log(Status.PASS,"clickOnContinueButton");
        clickOnElement(clickOnContinue);
    }
    public void clickOnNextDayAirButton() {
        Reporter.log("clickOnNextDayAirButton" + clickOnNextDayAir.toString());
        CustomListeners.test.log(Status.PASS,"clickOnNextDayAirButton");
        clickOnElement(clickOnNextDayAir);
    }
    public void clickOnContinueButtonAgain() {
        Reporter.log("clickOnContinueButtonAgain" + clickOnContinueTab.toString());
        CustomListeners.test.log(Status.PASS,"clickOnContinueButtonAgain");
        clickOnElement(clickOnContinueTab);
    }
    public void clickOnCreditCardButton() {
        Reporter.log("clickOnCreditCardButton" + clickOnCreditCard.toString());
        CustomListeners.test.log(Status.PASS,"clickOnCreditCardButton");
        clickOnElement(clickOnCreditCard);
    }
    public void selectClickOnContinue1() {
        Reporter.log("selectClickOnContinue1" + continueButton.toString());
        CustomListeners.test.log(Status.PASS,"selectClickOnContinue1");
        clickOnElement(continueButton);
    }
    public void selectMasterCardFromCreditCardDropdown(String value) {
        Reporter.log("selectMasterCardFromCreditCardDropdown" + clickOnMasterCard.toString());
        CustomListeners.test.log(Status.PASS," selectMasterCardFromCreditCardDropdown");
        selectByValueFromDropDown(clickOnMasterCard,value);
    }
    public void sendTextTOCardHolderName(String name) {
        Reporter.log("sendTextTOCardHolderName" + cardHolderName.toString());
        CustomListeners.test.log(Status.PASS,"sendTextTOCardHolderName");
        sendTextToElement(cardHolderName, name);
    }
    public void sendTextTOCardNumber(String num) {
        Reporter.log("sendTextTOCardNumber" + cardNumber.toString());
        CustomListeners.test.log(Status.PASS,"sendTextTOCardNumber");
        sendTextToElement(cardNumber, num);
    }
    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "5");
        selectByValueFromDropDown(By.id("ExpireYear"), "2024");
    }

    public void sendTextToCardCode(String code) {
        Reporter.log("sendTextToCardCode" + cardCode.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToCardCode");
        sendTextToElement(cardCode, code);
    }
    public void clickOnContinueButton2() {
        Reporter.log("clickOnContinueButton2" + continueButton2.toString());
        CustomListeners.test.log(Status.PASS,"clickOnContinueButton2");
        clickOnElement(continueButton2);
    }
    public String getVerifyText3() {
        Reporter.log("getVerifyText3" + verifyText3.toString());
        CustomListeners.test.log(Status.PASS,"getVerifyText3");
        return getTextFromElement(verifyText3);
    }
    public void clickOnConformButton() {
        Reporter.log("clickOnConformButton" + conform.toString());
        CustomListeners.test.log(Status.PASS,"clickOnConformButton");
        clickOnElement(conform);
    }
    public String getVerifyText4() {
        Reporter.log("getVerifyText4" + verifyText4.toString());
        CustomListeners.test.log(Status.PASS,"getVerifyText4");
        return getTextFromElement(verifyText4);
    }
    public String getVerifyText5() {
        Reporter.log("getVerifyText5" + verifyText5.toString());
        CustomListeners.test.log(Status.PASS,"getVerifyText5");
        return getTextFromElement(verifyText5);
    }
    public void clickOnContinueButton3() {
        Reporter.log("clickOnContinueButton3" + continueButton3.toString());
        CustomListeners.test.log(Status.PASS,"clickOnContinueButton3");
        clickOnElement(continueButton3);
    }
}
