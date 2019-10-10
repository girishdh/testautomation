package Oak;

import Oak.ObjectRepository.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import java.io.File;


public class TestLogin {


   private static WebDriver driver = BrowserLaunch.browserChromeLaunch();
    //static WebDriver driver = BrowserLaunch.browserFirefoxLaunch();

    @Test(priority = 0)
    // @Parameters("Oak")  //String Oak
    public static void verifyLogin() {
        LoginPageClass lpc = new LoginPageClass();
        try {
            lpc.loginDetails(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String strExpectedTitle = "Oak Analytics";
        String strActualTitle = driver.getTitle();
        Assert.assertEquals(strExpectedTitle, strActualTitle);
        System.out.println(strActualTitle + "  and  " + strExpectedTitle);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 1)
    public static void verifyLogout()
    {
        LoginPageClass lplogout = new LoginPageClass();
        try {
            lplogout.logOutDetails(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
