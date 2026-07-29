package SeleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Demo {
    @Test
    public void m1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
        List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th"));
        System.out.println(rows.size()); //7
        System.out.println(columns.size()); //4

        int index = 0;
        for (int i = 0; i < columns.size(); i++) {
           if(columns.get(i).getText().equals("Price")){
                index = i+1;
                break;
            }
        }
        ////table[@name='BookTable']//tr[2]//td[1]

        for(int i = 2; i< rows.size(); i++){
            String elementLearnSelenium = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
        if(elementLearnSelenium.contains("Learn Selenium")){
            String elementprice =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+index+"]")).getText();
            Assert.assertEquals(elementprice,"300");
        }


        }


    }
}
