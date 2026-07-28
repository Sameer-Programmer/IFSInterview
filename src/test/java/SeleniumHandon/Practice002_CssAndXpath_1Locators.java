package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice002_CssAndXpath_1Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        WebElement nameElement = driver.findElement(By.cssSelector("#name"));
        nameElement.sendKeys("Sameer");
        driver.findElement(By.cssSelector(".wikipedia-search-input")).sendKeys("Books");
        WebElement emailElement = driver.findElement(By.cssSelector("input[class='form-control'][id='email']"));
        emailElement.sendKeys("Sameeridea7@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Enter Phone']")).sendKeys("8686543168");

        //RelativeXpath
        driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Banglore");

        //Relative Xpaths combination
        driver.findElement(By.xpath("//input[@class ='form-check-input'][@id='male']")).click();

        //text()
        WebElement dataEntrytextElement = driver.findElement(By.xpath("//a[text()='Data Entry Form']"));
        System.out.println(dataEntrytextElement.isDisplayed());

        WebElement tabstextElement = driver.findElement(By.xpath("//h2[normalize-space()='Tabs']"));
        System.out.println(tabstextElement.isDisplayed());

        System.out.println("Script ran sucess ");
        Thread.sleep(10000);
        driver.close();
    }
}
