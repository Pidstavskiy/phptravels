import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;

    public BaseClass ()
    {

    }

    public BaseClass(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void beforeMet()
    {
        System.setProperty("webdriver.chrome.driver","D:/Chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/home");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void close()
    {
        driver.quit();
    }

    public HomePage openHomePage()
    {
        beforeMet();
        driver.get("https://www.phptravels.net/home");
        return new HomePage(driver);
    }

    public LoginPage closeLoginPage()
    {
        close();
        return null;
    }

}
