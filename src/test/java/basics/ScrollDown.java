package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
    public static void main(String[] args) throws InterruptedException {

        //Create chromedriver instance
        WebDriver driver=new ChromeDriver();

        //navigate to application
        driver.get("https://roboticqa.com/selenium-demo-app/");

        //maximize page
        driver.manage().window().maximize();

        // Scroll to bottom
        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement scrollArea=driver.findElement(By.xpath("//div[@id='table2']"));

        js.executeScript("arguments[0].scrollTop=arguments[0].scrollHeight;",scrollArea);

        Thread.sleep(5000);

        driver.close();
    }
}
