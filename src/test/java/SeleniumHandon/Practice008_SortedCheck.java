package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice008_SortedCheck {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

       WebElement animalElement =  driver.findElement(By.cssSelector("#animals"));
        Select select = new Select(animalElement);
      List<WebElement> animals =   select.getOptions();

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        for(WebElement e1 : animals){
            list1.add(e1.getText());
        }
        for(WebElement e2 : animals){
            list2.add(e2.getText());
        }
        Collections.sort(list1);

        Assert.assertTrue(list1.equals(list2),"Both are not same");
        System.out.println("Success");



    }
}
