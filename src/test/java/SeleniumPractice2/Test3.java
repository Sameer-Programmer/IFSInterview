package SeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://xqa.io/practice/shadow-dom?utm_source=chatgpt.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        SearchContext sc1 =driver.findElement(By.cssSelector("#shadowHost")).getShadowRoot();
        sc1.findElement(By.cssSelector("input[id='shadowInput']")).sendKeys("sameer");




    }
}
