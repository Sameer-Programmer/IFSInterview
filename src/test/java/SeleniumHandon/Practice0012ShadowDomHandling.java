package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice0012ShadowDomHandling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.automationtesting.in/shadow-dom");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        SearchContext sc1 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        // driver.findElement(By.cssSelector("#shadow-root")) -> this is ShadowHost we are calling shadowRoot right? and storing in Search contex ref right ?
        String s1 = sc1.findElement(By.cssSelector("#shadow-element")).getText();
        System.out.println(s1);
    }
}
