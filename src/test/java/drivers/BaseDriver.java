package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import static utils.DataParser.loadProperties;

public class BaseDriver {

    public WebDriver driver;

    public void initializeDriver() {
        Properties prop = loadProperties("config.properties");
        boolean headless_browser = prop.getProperty("headless-browser").equals("true");
        String browser_name = prop.getProperty("browser");

        ArrayList<String> headless_option = new ArrayList<>();
        headless_option.add("--window-size=1920,1080");
        headless_option.add("--headless");

        switch (browser_name) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                if (headless_browser) {
                    ChromeOptions chrome_options = new ChromeOptions();
                    chrome_options.addArguments(headless_option);
                    driver = new ChromeDriver(chrome_options);
                } else {
                    driver = new ChromeDriver();
                }
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                if (headless_browser) {
                    FirefoxOptions firefox_options = new FirefoxOptions();
                    firefox_options.addArguments(headless_option);
                    driver = new FirefoxDriver(firefox_options);
                } else {
                    driver = new FirefoxDriver();
                }
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                if (headless_browser) {
                    EdgeOptions edge_options = new EdgeOptions();
                    edge_options.addArguments(headless_option);
                    driver = new EdgeDriver(edge_options);
                } else {
                    driver = new EdgeDriver();
                }
                break;

            default:
                throw new RuntimeException(browser_name + " Browser Not Found!");
        }

        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageDriver.getInstance().setDriver(driver);

    }

}
