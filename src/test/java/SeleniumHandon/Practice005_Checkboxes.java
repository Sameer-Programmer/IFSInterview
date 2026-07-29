package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Practice005_Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        List<WebElement> list =
                driver.findElements(By.cssSelector("input[class='form-check-input'][type='checkbox']"));
        for (WebElement checkbox : list) {
            checkbox.click();
            Assert.assertTrue(checkbox.isSelected(), "Checkbox is not selected");
        }

        for (int i = 0; i < 3; i++) {
            list.get(i).click();
            Assert.assertTrue(list.get(i).isSelected());
        }

        //Radio button click and assertions
        WebElement radioButtnElementMale = driver.findElement(By.cssSelector("input[class='form-check-input'][id='male']"));
        //   radioButtnElementMale.click();
        Assert.assertTrue(radioButtnElementMale.isSelected(), "Radio button  Not selected");
        System.out.println("Success");
    }
}
