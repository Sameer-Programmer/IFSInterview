package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice001_SeleniumLocatorsPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        WebElement signinElement = driver.findElement(By.xpath("//span[normalize-space()='Hello, sign in']"));
        signinElement.click();
        driver.findElement(By.id("ap_email_login")).sendKeys("sameeridea7@gmail.com");
        driver.findElement(By.className("clear-text-field-button")).click();
        driver.findElement(By.linkText("Privacy Notice")).click();
        driver.findElement(By.partialLinkText("All Help")).click();
        System.out.println("Script ran sucess ");
    }
}
