package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Practice0023_DynamicWebTable {

    @Test
    public void m1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//th"));

        System.out.println(rows.size() + "  Rows");
        System.out.println(columns.size() + "  columns");

        int indexPrice = 0;
        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).getText().equals("Price")) {
                indexPrice = i + 1; //xpath
            }
        }
        System.out.println(indexPrice+"            IndexPrice");

        for (int i = 2; i < rows.size(); i++) {
            String elementMasterInSelenium =
                    driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[1]")).getText();
            if(elementMasterInSelenium.contains("Master In Selenium")){
                String price =
                        driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td["+indexPrice+"]")).getText();
                Assert.assertEquals(price,"3000");
            }
        }


    }
}
