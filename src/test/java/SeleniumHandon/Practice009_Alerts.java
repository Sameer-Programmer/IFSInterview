package SeleniumHandon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Practice009_Alerts {
    @Test
    public void m1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        WebElement sampleAlertElement =
                driver.findElement(By.cssSelector("button[id='alertBtn']"));
        sampleAlertElement.click();
        Alert alert =driver.switchTo().alert();
        alert.accept();



    }
}
