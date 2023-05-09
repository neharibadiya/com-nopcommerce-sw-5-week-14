package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement mouseHoverOnElectronics;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnCellPhonesAndClick;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyTextCellPhones;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement getMouseHoverOnElectronics;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnCellPhones1;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyTextCellphones;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement clickOnListViewTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement verifyTextNokiaLumia;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement verifyNokiaPrice;
    @CacheLookup
    @FindBy(xpath = "//img[@alt ='Picture of Nokia Lumia 1020']")
    WebElement clickOnProductNameNokia;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement clearQuantity;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement updateCart;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyGreenBarMessage;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement clickOnGreenBar;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnGoToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyMessageShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    WebElement verifyQuantity;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement verifyTotal;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyTextWelcomePlease;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickOnRegister;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyTextRegister;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement sendTextToFirstNameField;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement sendTextToLastNameField;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement sendTextToDay;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement sendTextToMonth;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement sendTextToYear;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement sendTextToEmailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement sendTextToPasswordField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement sendTextToConfirmPasswordField;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickOnRegister1;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyMessageYourRegistrationCompleted;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinue;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyTextShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox1;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout1;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement selectCountry;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement sendTextToCity;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement sendTextToAddress;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement sendTextToPostelCode;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement sendTextToPhoneNumber;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue1;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement clickOn2ndDayAir;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement clickOnContinue2;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement clickOnCreditCard;
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-method-buttons-container']//button[1]")
    WebElement clickOnContinue5;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Payments.Manual']")
    WebElement clickOnSelectCreditCard;
    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Visa')]")
    WebElement clickOnVisa;
    @CacheLookup
    @FindBy(name = "CardholderName")
    WebElement sendTextToCardholderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement sendTextToCardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement sendTextToExpirationMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement sendTextToExpirationYear;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement sendTextToCardCode;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement clickOnContinue3;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//span[text()[normalize-space()='2nd Day Air']]")
    WebElement verifyShoppingMethod;
    @CacheLookup
    @FindBy(xpath = "//strong[text()='$698.00'])[2]")
    WebElement verifyTotalPrice;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement clickOnConfirm;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyTextThankYou;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifySuccessfully;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement clickOnContinue4;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyWelcomeToOurStore;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement clickOnLogout;

//*********************************************************************************************************//

        public void mouseHoverOnElectronics() {
        Reporter.log("mouseHoverOnElectronics" + mouseHoverOnElectronics.toString());
        CustomListeners.test.log(Status.PASS,"mouseHoverOnElectronics");
        mouseHoverToElement(mouseHoverOnElectronics);
    }
    public void mouseHoverOnCellPhonesAndClick() {
        Reporter.log("mouseHoverOnCellPhonesAndClick" + mouseHoverOnCellPhonesAndClick.toString());
        CustomListeners.test.log(Status.PASS,"mouseHoverOnCellPhonesAndClick");
        mouseHoverToElementAndClick(mouseHoverOnCellPhonesAndClick);
    }
    public String verifyTextCellPhones() {
        Reporter.log("verifyTextCellPhones" + verifyTextCellphones.toString());
        CustomListeners.test.log(Status.PASS,"verifyTextCellPhones");
        return getTextFromElement(verifyTextCellPhones);
    }

    public void mouseHoverOnCellPhones1() {
        Reporter.log("mouseHoverOnCellPhones1" + mouseHoverOnCellPhones1.toString());
        CustomListeners.test.log(Status.PASS,"mouseHoverOnCellPhones1");
        mouseHoverToElementAndClick(mouseHoverOnCellPhones1);
    }
    public void clickOnListViewTab() {
        Reporter.log("clickOnListViewTab" + clickOnListViewTab.toString());
        CustomListeners.test.log(Status.PASS,"clickOnListViewTab");
        clickOnElement(clickOnListViewTab);
    }
    public void clickOnProductNameNokia() {
        Reporter.log("clickOnProductNameNokia" + clickOnProductNameNokia.toString());
        CustomListeners.test.log(Status.PASS,"clickOnProductNameNokia");
        clickOnElement(clickOnProductNameNokia);
    }
    public String verifyTextNokiaLumia() {
        Reporter.log("verifyTextNokiaLumia" + verifyTextNokiaLumia.toString());
        CustomListeners.test.log(Status.PASS,"verifyTextNokiaLumia");
        return getTextFromElement(verifyTextNokiaLumia);
    }
    public String verifyNokiaPrice() {
        Reporter.log("verifyNokiaPrice" + verifyNokiaPrice.toString());
        CustomListeners.test.log(Status.PASS,"verifyNokiaPrice");
        return getTextFromElement(verifyNokiaPrice);
    }
    public void clearQuantity() {
        Reporter.log("changeQuantity" + changeQuantity.toString());
        CustomListeners.test.log(Status.PASS,"clearQuantity");
        //sendTextToElement(changeQuantity,);
    }
//    public void changeQuantityTo2(String text) {
//        Reporter.log("changeQuantityTo2" + text +changeQuantity.toString());
//        sendTextToElement(changeQuantity, text);
//    }
    public void clickOnAddToCart() {
        Reporter.log("clickOnAddToCart" + updateCart.toString());
        CustomListeners.test.log(Status.PASS,"clickOnAddToCart");
        clickOnElement(updateCart);
    }
    public String verifyGreenBarMessage() {
        Reporter.log("verifyGreenBarMessage" + verifyGreenBarMessage.toString());
        CustomListeners.test.log(Status.PASS,"verifyGreenBarMessage");
        return getTextFromElement(verifyGreenBarMessage);
    }
    public void clickOnGreenBar() {
        Reporter.log("clickOnGreenBar" + clickOnGreenBar.toString());
        CustomListeners.test.log(Status.PASS,"clickOnGreenBar");
        clickOnElement(clickOnGreenBar);
    }
    public void mouseHoverOnShoppingCart() {
        Reporter.log("mouseHoverOnShoppingCart" + mouseHoverOnShoppingCart.toString());
        CustomListeners.test.log(Status.PASS,"mouseHoverOnShoppingCart");
        mouseHoverToElementAndClick(mouseHoverOnShoppingCart);
    }
    public void hoverAndClickOnGoToCart() {
        Reporter.log("hoverAndClickOnGoToCart" + clickOnGoToCart.toString());
        CustomListeners.test.log(Status.PASS,"hoverAndClickOnGoToCart");
        clickOnElement(clickOnGoToCart);
    }
    public String verifyMessageShoppingCart() {
        Reporter.log("verifyMessageShoppingCart" + verifyMessageShoppingCart.toString());
        CustomListeners.test.log(Status.PASS,"verifyMessageShoppingCart");
        return getTextFromElement(verifyMessageShoppingCart);
    }
    public String verifyQuantity() {
        Reporter.log("verifyQuantity" + verifyQuantity.toString());
        CustomListeners.test.log(Status.PASS,"verifyQuantity");
        return getTextFromElement(verifyQuantity);
    }
    public String verifyTotal() {
        Reporter.log("verifyTotal" + verifyTotal.toString());
        CustomListeners.test.log(Status.PASS,"verifyTotal");
        return getTextFromElement(verifyTotal);
    }
    public void clickOnCheckbox() {
        Reporter.log("clickOnCheckbox" + clickOnCheckbox.toString());
        CustomListeners.test.log(Status.PASS,"clickOnCheckbox");
        clickOnElement(clickOnCheckbox);
    }
    public void clickOnCheckout() {
        Reporter.log("clickOnCheckout" + clickOnCheckout.toString());
        CustomListeners.test.log(Status.PASS,"clickOnCheckout");
        clickOnElement(clickOnCheckout);
    }
    public String verifyTextWelcomePlease() {
        Reporter.log("verifyTextWelcomePlease" + verifyTextWelcomePlease.toString());
        CustomListeners.test.log(Status.PASS,"verifyTextWelcomePlease");
        return getTextFromElement(verifyTextWelcomePlease);
    }
    public void clickOnRegister() {
        Reporter.log("clickOnRegister" + clickOnRegister.toString());
        CustomListeners.test.log(Status.PASS,"clickOnRegister");
        clickOnElement(clickOnRegister);
    }
    public String verifyTextRegister() {
        Reporter.log("verifyTextRegister" + verifyTextRegister.toString());
        CustomListeners.test.log(Status.PASS,"verifyTextRegister");
        return getTextFromElement(verifyTextRegister);
    }
    public void sendTextToFirstNameField(String firstname) {
        Reporter.log("sendTextToFirstNameField" + firstname+sendTextToFirstNameField.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToFirstNameField");
        sendTextToElement(sendTextToFirstNameField, firstname);
    }
    public void sendTextToLastNameField(String lastname) {
        Reporter.log("sendTextToLastNameField" + lastname +sendTextToLastNameField.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToLastNameField");
        sendTextToElement(sendTextToLastNameField, lastname);
    }
    public void sendTextToDay(String day) {
        Reporter.log("sendTextToDay" + day +sendTextToDay.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToDay");
        sendTextToElement(sendTextToDay, day);
    }
    public void sendTextToMonth(String month) {
        Reporter.log("sendTextToMonth" + month + sendTextToMonth.toString());
        sendTextToElement(sendTextToMonth, month);
    }
    public void sendTextToYear(String year) {
        Reporter.log("sendTextToYear" + sendTextToYear.toString());
        sendTextToElement(sendTextToYear, year);
    }
    public void sendTextToEmailField(String email) {
        Reporter.log("sendTextToEmailField" + email + sendTextToEmailField.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToEmailField");
        sendTextToElement(sendTextToEmailField, email);
    }
    public void sendTextToPasswordField(String password) {
        Reporter.log("sendTextToPasswordField" + sendTextToPasswordField.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToPasswordField");
        sendTextToElement(sendTextToPasswordField, password);
    }
    public void sendTextToConfirmPasswordField(String confirmPassword) {
        Reporter.log("sendTextToConfirmPasswordField" + sendTextToConfirmPasswordField.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToConfirmPasswordField");
        sendTextToElement(sendTextToConfirmPasswordField, confirmPassword);
    }
    public void clickOnRegister1() {
        Reporter.log("clickOnRegister1" + clickOnRegister1.toString());
        CustomListeners.test.log(Status.PASS,"clickOnRegister1");
        clickOnElement(clickOnRegister1);
    }
    public String verifyMessageYourRegistrationCompleted() {
        Reporter.log("verifyMessageYourRegistrationCompleted" + verifyMessageYourRegistrationCompleted.toString());
        CustomListeners.test.log(Status.PASS,"verifyMessageYourRegistrationCompleted");
        return getTextFromElement(verifyMessageYourRegistrationCompleted);
    }
    public void clickOnContinue() {
        Reporter.log("clickOnContinue" + clickOnContinue.toString());
        CustomListeners.test.log(Status.PASS,"clickOnContinue");
        clickOnElement(clickOnContinue);
    }
    public String verifyTextShoppingCart() {
        Reporter.log("verifyTextShoppingCart" + verifyTextShoppingCart.toString());
        CustomListeners.test.log(Status.PASS,"verifyTextShoppingCart");
        return getTextFromElement(verifyTextShoppingCart);
    }
    public void clickOnCheckbox1() {
        Reporter.log("clickOnCheckbox1" + clickOnCheckbox1.toString());
        CustomListeners.test.log(Status.PASS,"clickOnCheckbox1");
        clickOnElement(clickOnCheckbox1);
    }
    public void clickOnCheckout1() {
        Reporter.log("clickOnCheckout1" + clickOnCheckout1.toString());
        CustomListeners.test.log(Status.PASS,"clickOnCheckout1");
        clickOnElement(clickOnCheckout1);
    }
    public void countryByVisibleText(String name) {
        Reporter.log("countryByVisibleText" + name +selectCountry.toString());
        CustomListeners.test.log(Status.PASS,"countryByVisibleText");
        selectByVisibleTextFromDropDown(selectCountry, name);
    }
    public void sendTextToCity(String city) {
        Reporter.log("sendTextToCity" + city +sendTextToCity.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToCity");
        sendTextToElement(sendTextToCity, city);
    }
    public void sendTextToAddress(String address) {
        Reporter.log("sendTextToAddress" + address + sendTextToAddress.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToAddress");
        sendTextToElement(sendTextToAddress, address);
    }
    public void sendTextToPostelCode(String postalCode) {
        Reporter.log("sendTextToPostelCode" + postalCode + sendTextToPostelCode.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToPostelCode");
        sendTextToElement(sendTextToPostelCode, postalCode);
    }
    public void sendTextToPhoneNumber(String phoneNumber) {
        Reporter.log("sendTextToPhoneNumber" + phoneNumber + sendTextToPhoneNumber.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToPhoneNumber");
        sendTextToElement(sendTextToPhoneNumber, phoneNumber);
    }
    public void clickOnContinue1() {
        Reporter.log("clickOnContinue1" + clickOnContinue1.toString());
        CustomListeners.test.log(Status.PASS,"clickOnContinue1");
        clickOnElement(clickOnContinue1);
    }
    public void clickOn2ndDayAir() {
        Reporter.log("clickOn2ndDayAir" + clickOn2ndDayAir.toString());
        CustomListeners.test.log(Status.PASS,"clickOn2ndDayAir");
        clickOnElement(clickOn2ndDayAir);
    }
    public void clickOnContinue2() {
        Reporter.log("clickOnContinue2" + clickOnContinue2.toString());
        CustomListeners.test.log(Status.PASS,"clickOnContinue2");
        clickOnElement(clickOnContinue2);
    }
    public void clickOnCreditCard() {
        Reporter.log("clickOnCreditCard" + clickOnCreditCard.toString());
        CustomListeners.test.log(Status.PASS,"clickOnCreditCard");
        clickOnElement(clickOnCreditCard);
    }
    public void clickOnContinueTab() {
        Reporter.log("clickOnContinueTab" + clickOnContinue5.toString());
        CustomListeners.test.log(Status.PASS,"clickOnContinueTab");
        clickOnElement(clickOnContinue5);
    }
    public void clickOnSelectCreditCard() {
        Reporter.log("clickOnSelectCreditCard" + clickOnSelectCreditCard.toString());
        CustomListeners.test.log(Status.PASS,"clickOnSelectCreditCard");
        clickOnElement(clickOnSelectCreditCard);
    }
    public void clickOnVisa() {
        Reporter.log("clickOnVisa" + clickOnVisa.toString());
        CustomListeners.test.log(Status.PASS,"clickOnVisa");
        clickOnElement(clickOnVisa);
    }
    public void sendTextToCardholderName(String cardHolderName) {
        Reporter.log("sendTextToCardholderName" + sendTextToCardholderName.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToCardholderName");
        sendTextToElement(sendTextToCardholderName, cardHolderName);
    }
    public void sendTextToCardNumber(String cardNumber) {
        Reporter.log("sendTextToCardNumber" + sendTextToCardNumber.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToCardNumber");
        sendTextToElement(sendTextToCardNumber, cardNumber);
    }
    public void sendTextToExpirationMonth(String expirationMonth) {
        Reporter.log("sendTextToExpirationMonth" + sendTextToExpirationMonth.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToExpirationMonth");
        selectByValueFromDropDown(sendTextToExpirationMonth,expirationMonth);
    }
    public void sendTextToExpirationYear(String expirationYear) {
        Reporter.log("sendTextToExpirationYear" + sendTextToExpirationYear.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToExpirationYear");
        selectByValueFromDropDown(sendTextToExpirationYear, expirationYear);
    }
    public void sendTextToCardCode(String cardCode) {
        Reporter.log("sendTextToCardCode" + sendTextToCardCode.toString());
        CustomListeners.test.log(Status.PASS,"sendTextToCardCode");
        sendTextToElement(sendTextToCardCode, cardCode);
    }
    public void clickOnContinue3() {
        Reporter.log("clickOnContinue3" + clickOnContinue3.toString());
        CustomListeners.test.log(Status.PASS,"clickOnContinue3");
        clickOnElement(clickOnContinue3);
    }
    public String verifyPaymentMethod() {
        Reporter.log("verifyPaymentMethod" + verifyPaymentMethod.toString());
        CustomListeners.test.log(Status.PASS,"verifyPaymentMethod");
        return getTextFromElement(verifyPaymentMethod);
    }
    public String verifyShoppingMethod() {
        Reporter.log("verifyShoppingMethod" + verifyShoppingMethod.toString());
        CustomListeners.test.log(Status.PASS,"verifyShoppingMethod");
        return getTextFromElement(verifyShoppingMethod);
    }
    public String verifyTotalPrice() {
        Reporter.log(" verifyTotalPrice" +  verifyTotalPrice.toString());
        CustomListeners.test.log(Status.PASS,"verifyTotalPrice");
        return getTextFromElement(verifyTotalPrice);
    }
    public void clickOnConfirm() {
        Reporter.log("clickOnConfirm" + clickOnConfirm.toString());
        CustomListeners.test.log(Status.PASS,"clickOnConfirm");
        clickOnElement(clickOnConfirm);
    }
    public String verifyTextThankYou() {
        Reporter.log("verifyTextThankYou" + verifyTextThankYou.toString());
        CustomListeners.test.log(Status.PASS,"verifyTextThankYou");
        return getTextFromElement(verifyTextThankYou);
    }
    public String verifySuccessfully() {
        Reporter.log("verifySuccessfully" + verifySuccessfully.toString());
        CustomListeners.test.log(Status.PASS,"verifySuccessfully");
        return getTextFromElement(verifySuccessfully);
    }
    public void clickOnContinue4() {
        Reporter.log("clickOnContinue4" + clickOnContinue4.toString());
        CustomListeners.test.log(Status.PASS,"clickOnContinue4");
        clickOnElement(clickOnContinue4);
    }
    public String verifyWelcomeToOurStore() {
        Reporter.log("verifyWelcomeToOurStore" + verifyWelcomeToOurStore.toString());
        CustomListeners.test.log(Status.PASS,"verifyWelcomeToOurStore");
        return getTextFromElement(verifyWelcomeToOurStore);
    }
    public void clickOnLogout() {
        Reporter.log("clickOnLogout" + clickOnLogout.toString());
        CustomListeners.test.log(Status.PASS,"clickOnLogout");
        clickOnElement(clickOnLogout);
    }
    public String verifyCurrentUrl(){
        return driver.getCurrentUrl();
    }

}
