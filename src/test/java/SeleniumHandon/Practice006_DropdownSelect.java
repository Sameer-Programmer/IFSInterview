package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Practice006_DropdownSelect {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        WebElement countryElement =
                driver.findElement(By.cssSelector("select[class='form-control'][id='country']"));
        Select select = new Select(countryElement);
        select.selectByValue("uk");
        select.selectByVisibleText("Germany");
        select.selectByIndex(0);
        //Here after Selection How to validate
        String actualTextUSA = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actualTextUSA, "United States");



        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            String names = option.getText();
            System.out.println(names);
        }
        System.out.println("Testcase Pass");

    }
}
//Write a Excel Table notes For Dropdown Select and Validation