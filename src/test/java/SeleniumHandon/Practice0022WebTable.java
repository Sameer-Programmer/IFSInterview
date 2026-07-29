package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Practice0022WebTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
       List <WebElement> columns =  driver.findElements(By.xpath("//table[@name='BookTable']//tbody//th"));

       // Selenium = //table[@name='BookTable']//tbody//tr[2]/td[1]

        //Find Master In Java and Amod are in same row

        for(int i = 2 ; i<rows.size(); i++){
           String elementMasterInJava =  driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]/td[1]")).getText();
           if(elementMasterInJava.contains("Master In Java")){
               String elementAmod   = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]/td[2]")).getText();
               Assert.assertEquals(elementAmod,"Amodd");
               System.out.println("success");
           }
        }
    }
}
