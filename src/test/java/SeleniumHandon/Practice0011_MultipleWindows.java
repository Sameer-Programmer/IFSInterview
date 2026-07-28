package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Practice0011_MultipleWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        WebElement popupElement = driver.findElement(By.xpath("//button[@id='PopUp'][normalize-space()='Popup Windows']"));
        popupElement.click();

        Set<String> set1 = driver.getWindowHandles();
        System.out.println(set1.size());
        ArrayList<String> list = new ArrayList<>(set1);


        String parentWindowHandle = list.get(0);
        String childWindowHandle1 = list.get(1);
        String childWindowHandle2 = list.get(2);

        System.out.println(parentWindowHandle);
        System.out.println(childWindowHandle1);
        System.out.println(childWindowHandle2);

        String parentWindowTitle = driver.switchTo().window(parentWindowHandle).getTitle();
        System.out.println(parentWindowTitle);
        String childWindowTitle1 = driver.switchTo().window(childWindowHandle1).getTitle();
        System.out.println(childWindowTitle1);
        String childWindowTitle2 = driver.switchTo().window(childWindowHandle2).getTitle();
        System.out.println(childWindowTitle2);


        driver.close();
        driver.quit();


    }
}
