package Config;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    public static WebDriver driver;

    @BeforeAll
    public static void initializeWebDriver() throws IOException {
        System.setProperty("webdriver.edge.driver", "C:\\webdriver\\msedgedriver.exe");
        driver = new EdgeDriver();

        // To maximize browser
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // To open Online BPN site
        driver.get("https://online.bpn.com.ar/");

    }
    @AfterAll
    public static void quitDriver() {
        driver.quit();
    }
}
