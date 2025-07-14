package advanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptAlertsDemo {

    public static void main(String[] args) throws InterruptedException {
        //Create chromedriver instance
        WebDriver driver=new ChromeDriver();

        // navigate to application
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //maximize browser
        driver.manage().window().maximize();

        //Handle alerts
        //click on js alert button
        driver.findElement(By.xpath("//ul//button[text()='Click for JS Alert']")).click();

        //wait for 3 seconds
        Thread.sleep(3000);

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement result=driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(),"You successfully clicked an alert");

        // Handle confirmation popup
        WebElement confirmationElement=driver.findElement(By.xpath("//ul//button[text()='Click for JS Confirm']"));
        confirmationElement.click();

        //click on cancel
        Alert confirmation=driver.switchTo().alert();
        confirmation.dismiss();
        Assert.assertEquals(result.getText(),"You clicked: Cancel");

        //click on ok button
        confirmationElement.click();
        Alert confirmationOk=driver.switchTo().alert();
        confirmationOk.accept();
        Assert.assertEquals(result.getText(),"You clicked: Ok");


        // Handle Prompt
        WebElement promptElement=driver.findElement(By.xpath("//ul//button[text()='Click for JS Prompt']"));
        promptElement.click();
        Alert promptPopup=driver.switchTo().alert();
        System.out.println(promptPopup.getText());
        promptPopup.sendKeys("RoboticQA");
        promptPopup.accept();
        Assert.assertEquals(result.getText(),"You entered: RoboticQA");


        //wait for 3 seconds
        Thread.sleep(3000);

        //close driver
        driver.close();
    }

}

