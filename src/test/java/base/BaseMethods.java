package base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseMethods extends BaseTest {


    public static void wait(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static String checkUrl() {
        return driver.getCurrentUrl();
    }

    public static WebElement findElement(By by) {
        wait(by);
        return driver.findElement(by);
    }

    public static boolean isDisplayedBy(By by) {
        try {
            return findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void clickElement(By by) {
        wait(by);
        findElement(by).click();
    }

    public static void checkAndClickElement(By by) {
        wait(by);
        if (isDisplayedBy(by)) {
            findElement(by).click();
        }
    }

    public static void sendKey(By by, String text) {
        wait(by);
        findElement(by).sendKeys(text);
    }

    public static void clear(By by) {
        findElement(by).clear();
    }

    public static String getText(By by) {
        wait(by);
        return findElement(by).getText();
    }

    public static boolean checkText(By by, String expText) {
        wait(by);
        String text = getText(by);
        if (text.contains(expText)) {
            System.out.println("Elementin Text Degeri " + expText + " Degerini Iceriyor");
            return true;
        } else {
            System.out.println("Elementin Text degeri Beklenen " + expText + " Text Degerini Icermiyor");
            return false;
        }
    }


    public void scrollToElement(By by) {
        wait(by);
        WebElement element = driver.findElement(by);
        new Actions(driver).scrollToElement(element).perform();
    }


}


