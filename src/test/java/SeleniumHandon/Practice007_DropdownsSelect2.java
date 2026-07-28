package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Practice007_DropdownsSelect2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        // MultiSelectDropdowns

        WebElement coloursdropdown =
                driver.findElement(By.xpath("//select[@id='colors']"));
        Select selectcolours = new Select(coloursdropdown);
        selectcolours.selectByValue("red");
        selectcolours.selectByValue("blue");

     List<WebElement> list =selectcolours.getAllSelectedOptions();
        Assert.assertEquals(list.get(0).getText(),"Red");
        Assert.assertEquals(list.get(1).getText(),"Blue");
        System.out.println("Script ran Success");

        Thread.sleep(3000);
        driver.quit();
    }
}
