package pages;

import base.BaseMethods;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DecimalFormat;

public class AccountPage extends BaseMethods {

    public static By myAccountTxt = By.xpath("//div[.='My account']");
    public static By accountNameTxt = By.xpath("//div[.='Account name']");
    public static By accountTypeTxt = By.xpath("//div[.='Account type']");
    public static By creationTimeTxt = By.xpath("//div[.='Creation time']");
    public static By amountTxt = By.xpath("//div[@class='css-146c3p1 r-1ozpqpt r-g6644c r-1b43r93 r-vw2c0b r-1j6l8hp' and contains(text(),'Amount')]");
    public static By transactionsTxt = By.xpath("//div[.='Transactions']");
    public static By transactionField = By.cssSelector(".r-150rngu");
    public static By transferMoneyBtn = By.xpath("(//div[@class='css-146c3p1 r-jwli3a r-1b43r93'])[2]");
    public static By addMoneyBtn = By.xpath("(//div[@class='css-146c3p1 r-jwli3a r-1b43r93'])[3]");
    public static By addMoneyTxt = By.xpath("(//div[@dir='auto' and contains (text(),'Add money')])[1]");
    public static By cardNumberTxt = By.xpath("//div[@dir='auto' and contains (text(),'Card number')]");
    public static By cardNumberField = By.xpath("//div/div[2]/input");
    public static By cardHolderField = By.xpath("//div/div[4]/input");
    public static By expiryDateField = By.xpath("(//div/div[1]/input) [1]  ");
    public static By CVVField = By.xpath("(//div/div[1]/input) [2]  ");
    public static By addAmountField = By.xpath("//div/div[8]/input");
    public static By cardSend = By.xpath("(//div/div[10])[2]");
    public static By cardHolderTxt = By.xpath("//div[@dir='auto' and contains (text(),'Card holder')]");
    public static By expiryDateTxt = By.xpath("//div[@dir='auto' and contains (text(),'Expiry date')]");
    public static By CVVTxt = By.xpath("//div[@dir='auto' and contains (text(),'CVV')]");
    public static By amountTxtAdd = By.xpath("//div[@class='css-146c3p1 r-1ozpqpt r-g6644c r-1b43r93 r-15zivkp' and contains (text(),'Amount')]");
    public static By editAccountBtn = By.xpath("(//div[@class='css-146c3p1 r-jwli3a r-1b43r93'])[4]");
    public static By senderAccount = By.xpath("//div[.='Sender account']");
    public static By senderAccountField = By.xpath("//div[@class='css-175oi2r r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-agouwx r-1pi2tsx r-13qz1uu']//div[3]/select[1]");
    public static By receiverAccount = By.xpath("//div[.='Receiver account']");
    public static By receiverAccountField = By.xpath("//div[@class='css-175oi2r r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-agouwx r-1pi2tsx r-13qz1uu']");
    public static By amountTransferMoney = By.xpath("//div[9]");
    public static By amountField = By.cssSelector("[placeholder]");
    public static By sendBtn = By.xpath("//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13qz1uu']");
    public static By sendBtnPsf = By.cssSelector(".r-q0mhf2");
    public static By transferMoneyTxt = By.xpath("//div[@class='css-146c3p1 r-ubezar r-vw2c0b']");
    public static By transactionAmount = By.xpath("(//div[@class='css-146c3p1 r-1ozpqpt r-yv33h5 r-1b43r93'])[5]");
    public static By editAccountTxt = By.xpath("//div[@class='css-146c3p1 r-ubezar r-vw2c0b']");
    public static By accountNameField = By.cssSelector("[placeholder]");
    public static By updateBTN = By.xpath("//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13qz1uu']");
    public static By accountNameInMA = By.xpath("(//div[@class='css-146c3p1 r-1ozpqpt r-yv33h5 r-1b43r93'])[1]");
    private Logger logger = LoggerFactory.getLogger(getClass());

    private int enteredAmount;
    private int enteredAddAmount;
    private String accountName;

    public boolean isAccountElementDisplayed(By by) {
        return isDisplayedBy(by);
    }

    public boolean isAccountElementCheck(By by) {
        try {
            if (!isAccountElementDisplayed(by)) {
                logger.info("Hata: Element görünür değil.");
            }
            if (!checkText(by, getText(by))) {
                logger.info("Hata: Element belirtilen metni içermiyor.)");
            }
            logger.info("Element hem görünür hem de belirtilen metni içeriyor.");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void clickAccountElement(By by) {
        scrollToElement(by);
        clickElement(by);
    }

    public void checkTextSenderAccount() {
        checkText(senderAccount, "Sender account");
    }


    public void checkReceiverAccount() {
        checkText(receiverAccount, "Receiver account");
    }

    public void enterAndSaveAmount(String amount) {
        sendKey(amountField, amount);
        enteredAmount = Integer.parseInt(amount);
        System.out.println("Girilen tutar:" + enteredAmount);
    }

    public void saveAndCheckTransAmountTM() {
        int totalAmountWithCommission = enteredAmount + 100;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String totalAmountWithCommissionStr = decimalFormat.format(totalAmountWithCommission);
        String transactionText = getText(transactionAmount);
        totalAmountWithCommissionStr = totalAmountWithCommissionStr.replace(',', '.');
        Assertions.assertEquals(totalAmountWithCommissionStr, transactionText);
        System.out.println("Transaction alanindaki deger:" + transactionText + ", Komisyon eklenmiş deger:" + totalAmountWithCommissionStr);
    }

    public void checkEditAccountTxt() {
        checkText(editAccountTxt, "Edit account");
    }

    public void checkAccountNameUp() {
        checkText(editAccountTxt, "Edit account");
    }

    public void editAccountNameAndSave(String account) {
        clear(accountNameField);
        sendKey(accountNameField, account);
        accountName = account;
        System.out.println("Account name:" + accountName);
    }

    public void checkAccountName() {
        String verifiedAccountName = getText(accountNameInMA);
        Assertions.assertEquals(accountName, verifiedAccountName);
    }
    public void enterCardNumber(String text) {
        sendKey(cardNumberField,text);
//        scrollToElement(cardNumberField);
//        findElement(cardNumberField).click();
//        findElement(cardNumberField).clear();
//        findElement(cardNumberField).sendKeys(text);
    }
    public void enterCardHolder(String text) {
        sendKey(cardHolderField,text);
    }
    public void enterExpiryDate(String date) {
        sendKey(expiryDateField,date);
    }
    public void enterCVV(String text) {
        sendKey(CVVField,text);
    }
    public void enterAddAmount(String text) {
        sendKey(addAmountField,text);
    }

    public boolean checkButtonPassive(By by) {
        try {
            WebElement element = findElement(by); // Elementi bul
            String tabindexValue = element.getAttribute("tabindex"); // tabindex değerini al
            logger.info("Buton pasif");
            return "-1".equals(tabindexValue); // "-1" ise true döndür

        } catch (NoSuchElementException e) {
            // Eğer element bulunamazsa false döndür
            logger.info("butonu aktif");
            return false;
        }
    }

    public void enterAndSaveAddAmount(String amount) {
        sendKey(addAmountField, amount);
        enteredAddAmount = Integer.parseInt(amount);
        System.out.println("Girilen tutar:" + enteredAddAmount);
    }

    public void saveAndCheckTransAddAmountTM() {
        int totalAmount1 = enteredAddAmount;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String totalAmount = decimalFormat.format(totalAmount1);
        String transactionText = getText(transactionAmount);
        totalAmount = totalAmount.replace(',', '.');
        Assertions.assertEquals(totalAmount, transactionText);
        System.out.println("Transaction alanindaki tutar:" + transactionText + ", Gosterilen tutar:" + totalAmount);
    }
}


