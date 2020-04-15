import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class SignUpPageTest {


    @Test
    public void signUpTest(){
        BaseClass baseClass = new BaseClass();
        Random random = new Random();
        String email = "ford"+random.nextInt(100)+"@gmail.com";

        String actualResult = baseClass
                .openHomePage()
                .goToSignUpPage()
                .setFirstName("Henry")
                .setLastName("Ford")
                .setPhone("3414141")
                .setEmail(email)
                .setPassword("12345678")
                .setConfirmPassword("12345678")
                .clickSignUpButton()
                .getAccountName();

        Assert.assertEquals(actualResult,"Hi, Henry Ford");
    }
}
