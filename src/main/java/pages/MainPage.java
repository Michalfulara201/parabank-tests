package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    protected WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForPageLoad(WebDriver webDriver) {
        Wait<WebDriver> wait = new WebDriverWait(webDriver, 30);
        wait.until(webDriver1 -> (JavascriptExecutor) webDriver).executeScript("return document.readyState");
    }

}