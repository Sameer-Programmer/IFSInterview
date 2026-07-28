package SeleniumHandon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice0014_NavigationMethods {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.automationtesting.in/shadow-dom");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        //driver.navigate().refresh();
        driver.navigate().back();
        System.out.println(driver.getTitle()); //Automation testing demo shadowDome
        driver.navigate().forward();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());// Automation testing Practice

    }
}
