package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice0015_Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

     //   WebElement frame1 = driver.findElement(By.cssSelector("frame[src='frame_1.html']"));
//        driver.switchTo().frame(frame1);
//        driver.findElement(By.cssSelector("input[type='text'][name='mytext1']")).sendKeys("Sameer");
//        driver.switchTo().defaultContent();
//
     //   driver.switchTo().frame(frame1);
        WebElement frame2 = driver.findElement(By.cssSelector("frame[src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.cssSelector("input[type='text'][name='mytext2']")).sendKeys("Sameer");


    }
}
