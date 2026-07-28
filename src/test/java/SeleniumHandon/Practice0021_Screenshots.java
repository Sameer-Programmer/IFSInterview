package SeleniumHandon;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Practice0021_Screenshots {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        String projectPath = System.getProperty("user.dir");

        TakesScreenshot ts  = (TakesScreenshot) driver;
       File src =  ts.getScreenshotAs(OutputType.FILE);
       File dest = new File("./Screenshorts//File1.png");
        FileHandler.copy(src,dest);

        WebElement e1 = driver.findElement(By.cssSelector("[name='BookTable']"));
        File f1 = e1.getScreenshotAs(OutputType.FILE);
        File dest2 = new File("./Screenshorts//File2.png");

        FileHandler.copy(f1,dest2);
        System.out.println("Dome");
    }
}
