package pages;

import base.BaseMethods;
import org.openqa.selenium.By;

public class LoginPage extends BaseMethods {
    public static By usernameField = By.xpath("//input[@placeHolder='Username']");
    public static By passwordField = By.xpath("//input[@placeHolder='Password']");
    public static By loginButton = By.xpath("//div[@tabindex='0']");
    public static By openMoneyTransferButton = By.xpath("//div[@dir='auto' and contains(text(),'Open Money Transfer')]");
    public static By alertMessage = By.cssSelector(".r-howw7u");
    public static By backButton = By.cssSelector(".r-13hce6t");
    public static By logoutButton = By.cssSelector(".r-vw2c0b");


    public boolean isUsernameFielDisplayed() {
        return isDisplayedBy(usernameField);
    }

    public boolean isPasswordFielDisplayed() {
        return isDisplayedBy(passwordField);
    }

    public void checkAlertMessage(String text) {
        checkText(alertMessage, text);
    }

    public void sendTextUsernameField(String username) {
        sendKey(usernameField, username);
    }

    public void sendTextPasswordField(String password) {
        sendKey(passwordField, password);
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }

    public boolean isMoneyTransferButtonDisplay() {
        return isDisplayedBy(openMoneyTransferButton);
    }

    public void clickMoneyTransferButton() {
        clickElement(openMoneyTransferButton);
    }

    public void clickBackButton() {
        clickElement(backButton);
    }

    public void clickLogoutButton() {
        clickElement(logoutButton);
    }

}

