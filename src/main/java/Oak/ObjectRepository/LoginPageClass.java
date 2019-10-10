package Oak.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.function.Function;

public class LoginPageClass {

   private static By uName = By.xpath(ObjRepo.userName);
   private static By uPassword = By.xpath(ObjRepo.Password);
   private static By loginButton = By.xpath(ObjRepo.loginBtn);

    public void loginDetails(WebDriver driver) throws InterruptedException {

        File newFile = new File(ObjRepo.filePathDataProperty);
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(newFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prodDataFile = new Properties();
        try {
            prodDataFile.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.findElement(uName).sendKeys(prodDataFile.getProperty("UserName"));
        driver.findElement(uPassword).sendKeys(prodDataFile.getProperty("UPassword"));
        driver.findElement(loginButton).click();
        Thread.sleep(5000);
        /*WebElement logOutBtn = new WebDriverWait(driver, 12).until((Function<WebDriver, WebElement>) driver1 -> {
            return driver1.findElement(By.cssSelector(ObjRepo.topUserName));
        });
        logOutBtn.click();*/
    }
    public void logOutDetails (WebDriver driver) throws InterruptedException{
        driver.findElement(By.cssSelector(ObjRepo.topUserName)).click();
        driver.findElement(By.xpath(ObjRepo.logoutBtn)).click();
        Thread.sleep(5000);
    }
}

