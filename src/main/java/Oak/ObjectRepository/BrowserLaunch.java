package Oak.ObjectRepository;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserLaunch {

    static WebDriver driver;

    public static WebDriver browserChromeLaunch()
    {
        System.setProperty("webdriver.chrome.driver","E:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(ObjRepo.prodURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver;
    }
    public static WebDriver browserFirefoxLaunch()
    {
        System.setProperty("webdriver.chrome.driver","E:\\Software\\Selenium\\geckodriver-v0.25.0-win32\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(ObjRepo.prodURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("Hello Welcome to the Firefox Browser");
        return driver;
    }



}
