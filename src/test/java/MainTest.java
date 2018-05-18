import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.IndexPage;
import pages.RegisterPage;

public class MainTest {

    WebDriver driver;
    IndexPage indexPage;


    @BeforeMethod
    public void before() {

        driver = new ChromeDriver();
        indexPage = new IndexPage(driver);

    }

    @AfterMethod
    public void after(){
        driver.close();
    }
}


