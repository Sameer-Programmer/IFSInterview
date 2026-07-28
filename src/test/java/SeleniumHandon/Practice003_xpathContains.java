package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice003_xpathContains {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        WebElement nameElement = driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Name')]"));
        nameElement.sendKeys("sameer");

        driver.findElement(By.xpath("//a[contains(text(),'Data Entry Form')]")).isDisplayed();

        driver.findElement(By.xpath("//span[starts-with(normalize-space(),'For Selenium, Cypress & Playwright')]")).isDisplayed();
        System.out.println("Script ran successfully congrats ");



        Thread.sleep(10000);
        driver.close();
    }
}
