package SeleniumHandon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Practice0024_BrokenLinks {
    @Test
    public  void m1()throws IOException {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        List<WebElement> tags =  driver.findElements(By.tagName("a"));
        int brokenLinksCount = 0;
        for(WebElement element :tags){
            String link = element.getAttribute("href");

            if(link==null ||link.isEmpty()){
                continue;
            }

            URL url1 = new URL(link);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url1.openConnection();
            httpURLConnection.connect();
            int responseCode =   httpURLConnection.getResponseCode();

            if(responseCode>=400){
                System.out.println(link+"     Failed");
                brokenLinksCount++;
            }else {
                System.out.println(link+"     WorkinFine "+responseCode);
            }
        }
        System.out.println(brokenLinksCount);


    }
}
/*
1-tags
2-getAttribute("href")
3-store in as string -> if value is null or empty -continue -skip
4- url url1 = new Url(vaue)
5-url1.openconncetion() => Casting with HTTPurl
HttpURLConnection httpURLConnection = (HttpURLConnection) url1.openConnection();
            httpURLConnection.connect();
            int responseCode =   httpURLConnection.getResponseCode();
            if(rescode>=400){
            broken
 */