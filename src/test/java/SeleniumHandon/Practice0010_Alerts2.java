package SeleniumHandon;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Practice0010 {
    @Test
    public void m1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        WebElement sampleAlertElement
                = driver.findElement(By.cssSelector("button[id='confirmBtn']"));
        sampleAlertElement.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        WebElement promptAlertElement2
                = driver.findElement(By.cssSelector("button[id='promptBtn']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)");
        js.executeScript("arguments[0].scrollIntoView",promptAlertElement2);
        promptAlertElement2.click();
        System.out.println("successuptohere ");
        alert.sendKeys("Sameer");
        alert.accept();

        WebElement message1 = driver.findElement(By.xpath("//p[contains(normalize-space(),'Hello Sameer!')]"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(message1));
        Assert.assertTrue(message1.isDisplayed());

        driver.close();
        driver.quit();


    }
}
