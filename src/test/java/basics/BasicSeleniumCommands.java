package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCommands {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://roboticqa.com/selenium-demo-app/");
        driver.manage().window().maximize();

        WebElement name=driver.findElement(By.xpath("//input[contains(@class,'name')]"));
        WebElement email=driver.findElement(By.xpath("//input[contains(@class,'email')]"));
        WebElement url=driver.findElement(By.xpath("//input[contains(@class,'url')]"));
        WebElement city=driver.findElement(By.xpath("//input[@value='Pune' and @type='radio']"));
        WebElement button=driver.findElement(By.xpath("//button[@class='pushbutton-wide']"));
        // Enter text in textbox
        name.sendKeys("RoboticQA User");
        email.sendKeys("abc@gmail.com");
        url.sendKeys("https://roboticqa.com");

        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)",city);

        city.click();

        Thread.sleep(5000);

        email.clear();

        Thread.sleep(5000);

        button.click();
        //close browser
        driver.close();



    }


}
