package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends MainPage{



    public AccountPage(WebDriver driver){
        super(driver);

    }

    public boolean isUserLogin(){
        return driver.findElement(By.xpath("//a[text()='Log Out']")).isDisplayed();
    }


}
