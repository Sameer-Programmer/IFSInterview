package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice0017BootStrapDropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
      //  driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        WebElement elementPIM = driver.findElement(By.xpath("(//span[normalize-space()='PIM'])[1]"));
        elementPIM.click();

        WebElement elementEmploymentStatus
                = driver.findElement(By.xpath("//label[contains(normalize-space(),'Employment Status')]/following::div[@class='oxd-select-text-input'][1]"));
        elementEmploymentStatus.click();
        WebElement franceElement = driver.findElement(By.xpath("//div/span[text()='Freelance']"));
        franceElement.click();

        System.out.println(elementEmploymentStatus.getText());



    }
}
