package advanced;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileUploadDemo {

    public static void main(String[] args) throws InterruptedException {

        //create chrome instance
        WebDriver driver=new ChromeDriver();

        // navigate to application
        driver.get("https://the-internet.herokuapp.com/upload");

        //maximize windows
        driver.manage().window().maximize();

        //File upload
        File file=new File(System.getProperty("user.dir")+"//target//page.png");
        WebElement uploadElement=driver.findElement(By.id("file-upload"));
        uploadElement.sendKeys(file.getAbsolutePath());

        //click on upload
        driver.findElement(By.xpath("//input[@value='Upload']")).click();


        //verify file is uploaded successfully
        WebElement fileUploadMsg=driver.findElement(By.cssSelector("div.example h3"));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(fileUploadMsg));

        Assert.assertEquals(fileUploadMsg.getText(),"File Uploaded!");

        //wait
        Thread.sleep(5000);

        //close driver
        driver.close();
    }

}
