package SeleniumHandon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice0019Calender {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://in.trip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
        driver.manage().window().maximize();
//September, 2026
        //(//div/span[@class='day'][text()='21'])[1]
        String expectedYear="2027";
        String expectedMonth="September";
        String expectedDate="21";

        driver.findElement(By.cssSelector("#checkInInput")).click();

        while(true){
            WebElement header = driver.findElement(By.xpath("(//header[@class='c-calendar-month__title'])[1]"));
            if(header.getText().contains(expectedYear)  && header.getText().contains(expectedMonth)){
                break;
            }
            WebElement nextButton = driver.findElement(By.cssSelector("span[aria-label='Go to next month']"));
            //nextButton.click();
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click()",nextButton);
        }
        WebElement target = driver.findElement(By.xpath("(//div/span[@class='day'][normalize-space()='"+expectedDate+"'])[1]"));
        target.click();




    }
}
