package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Practice0018_Waits {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //WebElement elementImage = driver.findElement(By.cssSelector("img[alt='client brand banner']"));
      Wait<WebDriver> wait =  new FluentWait<>(driver)
              .withTimeout(Duration.ofSeconds(5))
              .pollingEvery(Duration.ofSeconds(5))
              .ignoring(NoSuchElementException.class);
        WebElement elementImage =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[alt='client brand banner']")));
        Assert.assertTrue(elementImage.isDisplayed());


    }
}
