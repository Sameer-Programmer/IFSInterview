package SeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    @Test
    public void m1 (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();


        WebElement animalElement =  driver.findElement(By.cssSelector("#animals"));
        Select select = new Select(animalElement);
        List<WebElement> animals =   select.getOptions();

        ArrayList list1= new ArrayList();
        ArrayList list2 = new ArrayList();

        for(WebElement e:animals){
            list1.add(e.getText());
        }
        Collections.sort(list1);

        for(WebElement e:animals){
            list2.add(e.getText());
        }

        Assert.assertTrue(list1.equals(list2));




        driver.quit();
    }
}
