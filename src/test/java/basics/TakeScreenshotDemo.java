package basics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshotDemo {

    public static void main(String[] args) {
        //Chromedriver instance
        WebDriver driver=new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        // navigate to application
        driver.get("https://seleniumbase.io/demo_page");

        //enter text "Roboticqa" in Text Input Field:
        WebElement input1= driver.findElement(By.id("myTextInput"));
        input1.sendKeys("RoboticQA Academy");


        // full window screenshot
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot,new File("./target/page.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File elementScreenshot=input1.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(elementScreenshot,new File("./target/element.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //close driver
        driver.close();
    }
}
