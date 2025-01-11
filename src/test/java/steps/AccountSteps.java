package steps;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import dev.failsafe.internal.util.Assert;
import org.apache.commons.logging.Log;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.AccountPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pages.AccountPage.*;
import static pages.AccountPage.cardSend;

public class AccountSteps extends BaseTest {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private AccountPage accountPage = new AccountPage();
    private LoginPage loginPage = new LoginPage();

    @Step("<saniye> saniye bekle")
    public void waitSeconds(int saniye) throws InterruptedException {
        Thread.sleep(saniye * 1000);
    }

    @Step("My account alaninin gorunur oldugunu kontrol et")
    public void isMyAccountDisplayed() {
        //assertTrue(accountPage.isAccountElementDisplayed(myAccountTxt), "Account Name goruntulenemedi");
        assertTrue(accountPage.isAccountElementCheck(myAccountTxt), "Account Name goruntulenemedi");
        logger.info("My account texti goruntulendi");
    }

    @Step("Account name alaninin gorunur oldugunu kontrol et")
    public void isAccountNameDisplayed() {
        //assertTrue(accountPage.isAccountElementDisplayed(accountNameTxt), "Account Name goruntulenemedi");
        assertTrue(accountPage.isAccountElementCheck(accountNameTxt), "Account Name goruntulenemedi");

        logger.info("Account Name texti goruntulendi");
    }

    @Step("Account type alaninin gorunur oldugunu kontrol et")
    public void isAccountTypeDisplayed() {
        assertTrue(accountPage.isAccountElementCheck(accountTypeTxt), "Account Type goruntulenemedi");
        logger.info("Account Type texti goruntulendi");
    }

    @Step("Creation time alanininin gorunur oldugunu kontrol")
    public void isCreationTimeDisplayed() {
        assertTrue(accountPage.isAccountElementCheck(creationTimeTxt), "Creation Time goruntulenemedi");
        logger.info("Account Element texti goruntulendi");
    }

    @Step("Amount alaninin gorunur oldugunu kontrol et")
    public void isAmountDisplayed() {
        assertTrue(accountPage.isAccountElementCheck(amountTxt), "Amount goruntulenemedi");
        logger.info("Amount texti goruntulendi");
    }

    @Step("Transactions alaninin gorunur oldugunu kontrol et")
    public void isTransactionsDisplayed() {
        assertTrue(accountPage.isAccountElementCheck(transactionsTxt), "Transactions goruntulenemedi");
        logger.info("Account Page texti goruntulendi");
    }


    @Step("Transfer Money butonuna tikla")
    public void clickTransferMoneyBtn() {
        accountPage.clickAccountElement(transferMoneyBtn);
        logger.info("Transfer Money butonuna tiklandi");

    }

    @Step("Transfer money menusunun acildigini kontrol et")
    public void checkTransferMenu() {
        assertTrue(accountPage.isAccountElementCheck(transferMoneyTxt), "Transfer money menusu goruntulenemedi");
        logger.info("Transfer money texti goruntulendi");
    }

    @Step("Sender account textinin gorunur oldugunu kontrol et")
    public void checkTextSenderAccount() {
        accountPage.checkTextSenderAccount();
        logger.info("Sender account texti goruntulendi");
    }

    @Step("Sender account alaninin goruntulendigini kontrol et")
    public void isSenderAccountSelected() {
        assertTrue(accountPage.isAccountElementDisplayed(senderAccountField), "Sender account alani goruntulenemedi");
    }

    @Step("Receiver account textinin gorunur oldugunu kontrol et")
    public void checkReceiverAccount() {
        accountPage.checkReceiverAccount();
        logger.info("Receiver account texti goruntulendi");
    }


    @Step("Amount alanina <amount> gir ve tutari kaydet")
    public void enterAmount(String amount) {
        accountPage.enterAndSaveAmount(amount);
    }

    @Step("Send butonuna tikla")
    public void clickSendButton() {
        accountPage.clickAccountElement(sendBtn);
    }

    @Step("Transactions alanindaki Amount degerini transfer money icin kontrol et")
    public void saveAndCheckTransAmountTM() {
        accountPage.saveAndCheckTransAmountTM();
    }

    @Step("Edit Account butonuna tikla")
    public void clickEditAccountBtn() {
        accountPage.clickAccountElement(editAccountBtn);
        logger.info("Edit account butonuna tiklandi");
    }

    @Step("Edit account menusunun acildigini kontrol et")
    public void editAccount() {
        accountPage.checkEditAccountTxt();
        logger.info("Edit account texti goruntulendi");
    }

    @Step("Account name textinin gorunur oldugunu kontrol et")
    public void checkAccountNameUp() {
        accountPage.checkAccountNameUp();
        logger.info("Edit account texti goruntulendi");
    }

    @Step("Account name alanina <account> gir ve ismi kaydet")
    public void enterAccountName(String account) {
        accountPage.editAccountNameAndSave(account);
    }

    @Step("Update butonuna tikla")
    public void clickUpdateBtn() {
        accountPage.clickAccountElement(updateBTN);
        logger.info("Update butonuna tiklandi");
    }

    @Step("My account alanindaki Account name degerini kontrol et")
    public void checkAccountName() {
        accountPage.checkAccountName();
        logger.info("Account name basarili bir sekilde editlendi");
    }

    @Step("Add Money butonuna tikla")
    public void clickAddMoneyBtn() {
        accountPage.clickAccountElement(addMoneyBtn);
        logger.info("Add Money butonuna tiklandi");
    }

    @Step("Add Money menusunun acildigini kontrol et")
    public void addMoneyMenu() {
        assertTrue(accountPage.isAccountElementCheck(addMoneyTxt), "Add money menusu goruntulenemedi");
        logger.info("Transfer money texti goruntulendi");
    }

    @Step("Card number textinin gorunur oldugunu kontrol et")
    public void checkCardNumber() {
        assertTrue(accountPage.isAccountElementCheck(cardNumberTxt), "Card number goruntulenemedi");
        logger.info("Card number texti goruntulendi");
    }

    @Step("Card holder textinin gorunur oldugunu kontrol et")
    public void checkCardHolder() {
        assertTrue(accountPage.isAccountElementCheck(cardHolderTxt), "Card holder goruntulenemedi");
        logger.info("Card holder texti goruntulendi");
    }

    @Step("Expiry date textinin gorunur oldugunu kontrol et")
    public void checkexpiryDate() {
        assertTrue(accountPage.isAccountElementCheck(expiryDateTxt), "Expiry date goruntulenemedi");
        logger.info("Expiry date texti goruntulendi");
    }

    @Step("CVV textinin gorunur oldugunu kontrol et")
    public void checkCVVDate() {
        assertTrue(accountPage.isAccountElementCheck(CVVTxt), "Transactions goruntulenemedi");
        logger.info("Expiry date texti goruntulendi");
    }

    @Step("Amount textinin gorunur oldugunu kontrol et")
    public void checkAmountDate() {
        assertTrue(accountPage.isAccountElementCheck(amountTxtAdd), "Amount goruntulenemedi");
        logger.info("Amount texti goruntulendi");
    }


    @Step("Kart numarasi alanina <number> gir")
    public void enterCardNumber(String text) {
        accountPage.enterCardNumber(text);
    }

    @Step("Card holder alanina <text> gir")
    public void enterCardHolder(String text) {
        accountPage.enterCardHolder(text);
    }

    @Step("Expiry Date alanina <date> gir")
    public void enterExpiryDate(String date) {
        accountPage.enterExpiryDate(date);
    }

    @Step("CVV alanina <text> gir")
    public void enterCVV(String text) {
        accountPage.enterCVV(text);
    }


    @Step("Receiver account degerinin <text> icerdigini kontrol et")
    public void checkReceiverAccountField(String text) {
        assertTrue(accountPage.isAccountElementCheck(receiverAccountField), "Receiver account alaninda" + text + "goruntulenemedi");
    }

    @Step("Send butonunun pasif oldugunu kontrol et")
    public void checkSendButton() {
        assertTrue(accountPage.checkButtonPassive(sendBtnPsf),"Send butonu aktif");
        logger.info("Send botunu pasif");

    }
    @Step("Amount alanina <amount> gir ve kaydet")
    public void enterAddAmount(String amount) {
        accountPage.enterAndSaveAddAmount(amount);
    }

    @Step("Add butonuna tikla")
    public void clickAddBtn() {
        accountPage.clickAccountElement(cardSend);
        logger.info("Add butonuna tiklandi");
    }
    @Step("Transactions alanindaki Amount degerini add money icin kontrol et")
    public void saveAndCheckTransAddAmountTM() {
        accountPage.saveAndCheckTransAddAmountTM();
    }

}
