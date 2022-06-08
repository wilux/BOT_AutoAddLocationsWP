package TestCase;

import Config.BaseTest;
import Config.Credenciales;
import PageObject.LoginPage;
import org.junit.jupiter.api.Test;



public class LoginTest  extends BaseTest {

    @Test
    public void Login() throws Exception {

        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(300);
        loginPage.setUserName(Credenciales.userName);
        loginPage.setPassword(Credenciales.password);
        loginPage.LoginButton();

    }

}
