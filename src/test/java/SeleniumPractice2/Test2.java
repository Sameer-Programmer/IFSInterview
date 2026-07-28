package SeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.automationtesting.in/shadow-dom");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();


        SearchContext sc1 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        SearchContext sc2 = sc1.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        String s2 = sc2.findElement(By.cssSelector("#nested-shadow-element")).getText();
        System.out.println(s2);

    }
}
