import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//button[text() = 'Login']")
    private WebElement searchButton;

    @FindBy(className = "text-align-left")
    private WebElement accountText;


    public LoginPage setUserName(String value)
    {
        username.sendKeys(value);
        return this;
    }

    public LoginPage setPassword(String value)
    {
        password.sendKeys(value);
        return this;
    }

    public LoginPage clickSearchButton()
    {
        searchButton.click();
        return this;
    }

    public String getAccountText()
    {
        return this.accountText.getText();
    }


}
