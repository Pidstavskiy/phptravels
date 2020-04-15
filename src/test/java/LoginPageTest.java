import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest {

    @Test
    public void loginTest(){
        BaseClass baseClass = new BaseClass();

        String actualResult = baseClass
                .openHomePage()
                .goToLoginPage()
                .setUserName("fordhenry2@gmail.com")
                .setPassword("12345678")
                .clickSearchButton()
                .getAccountText();

        Assert.assertEquals(actualResult,"Hi, Henry Ford");


    }
}
