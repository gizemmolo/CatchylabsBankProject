package steps;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps extends BaseTest {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private LoginPage loginPage = new LoginPage();
    //private AccountPage accountPage = new AccountPage();

    @Step("<url> adresine git")
    public void goToUrl(String url) {
        driver.get(url);
        logger.info(url + " adresine gidiliyor.");
    }

    @Step("Username alaninin gorunur oldugunu kontrol et")
    public void checkUsernameField() {
        assertTrue(loginPage.isUsernameFielDisplayed(), "Username alani gorunur degil");
    }

    @Step("Password alaninin gorunur oldugunu kontrol et")
    public void checkLoginButton() {
        assertTrue(loginPage.isPasswordFielDisplayed(), "Password alani gorunur degil");
    }

    @Step("<text> textini username alanina yaz")
    public void enterUsername(String text) {
        loginPage.sendTextUsernameField(text);
    }

    @Step("<text> textini password alanina yaz")
    public void sendTextPasswordField(String text) {
        loginPage.sendTextPasswordField(text);
    }

    @Step("<text> uyari textini kontrol et")
    public void checkAlertMessageInvalidLogin(String text) {
        loginPage.checkAlertMessage(text);
    }

    @Step("Login butonuna tikla")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Step("Open Money Transfer butonunun gorunur oldugunu kontrol et")
    public void checkOpenTransferButton() {
        assertTrue(loginPage.isMoneyTransferButtonDisplay(), "Open Money Transfer butonu aktif degil");
        logger.info("Open Money Transfer butonu goruntulendi");
    }

    @Step("Open Money Transfer butonuna tikla")
    public void clickOpenTransferButton() {
        loginPage.clickMoneyTransferButton();
        logger.info("Open Money Transfer butonuna tiklandi");
    }


    @Step("Back tusuna tikla")
    public void clickBackButton(){
        loginPage.clickBackButton();
    }
    @Step("logout tusuna tikla")
    public void clickLogoutButton(){
        loginPage.clickLogoutButton();

    }
}


