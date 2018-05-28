package pages;


import org.openqa.selenium.WebDriver;

public abstract class SuccessLoggedPage extends MainPage {

    public MenuPage menu;

    public SuccessLoggedPage(WebDriver driver) {
        super(driver);
        this.menu = new MenuPage(driver);
    }
}

