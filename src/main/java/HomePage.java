import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
public HomePage(){}
    public HomePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//a[text() = 'Login']")
    private WebElement loginElement;

    @FindBy(className = "dropdown-login")
    private WebElement loginDropDown;

    @FindBy(xpath = "//div[contains(@class, 'dropdown-login')]//a[contains (text(), 'Sign Up')]")
    private WebElement signUpElement;



    public LoginPage goToLoginPage() {
        this.loginDropDown.click();
        this.loginElement.click();
        return new LoginPage(driver);
    }

    public SignUpPage goToSignUpPage() {
        this.loginDropDown.click();
        this.signUpElement.click();
        return new SignUpPage(driver);
    }


}
