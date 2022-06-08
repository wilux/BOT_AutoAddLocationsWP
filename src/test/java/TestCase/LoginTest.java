package TestCase;

import PageObject.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LoginTest {

    @Test
    public void Login() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\webdriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://online.bpn.com.ar/");
        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(300);
        loginPage.setUserName("floresnes");
        loginPage.setPassword("Paloma2022-");
        loginPage.LoginButton();

    }

}
