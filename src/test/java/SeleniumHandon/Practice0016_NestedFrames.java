package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice0016_NestedFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a[href='#Multiple']")).click();

        WebElement frame1 = driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']"));
        driver.switchTo().frame(frame1);

        WebElement frame2= driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Sameer");

    }
}
