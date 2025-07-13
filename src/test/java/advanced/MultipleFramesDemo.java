package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFramesDemo {

    public static void main(String[] args) throws InterruptedException {

        //Create chromedriver instance
        WebDriver driver=new ChromeDriver();

        // navigate to application
        driver.get("https://the-internet.herokuapp.com/nested_frames");


        //maximize browser
        driver.manage().window().maximize();



        // main frame
        driver.switchTo().frame("frame-top");

        //swith to left frame
        driver.switchTo().frame("frame-left");

        //Nested frames
        WebElement element=driver.findElement(By.xpath("//body"));
        System.out.println(element.getText());

        //exit left frame
        driver.switchTo().defaultContent();

        // main frame
        driver.switchTo().frame("frame-top");

        //swith to middle frame
        driver.switchTo().frame("frame-middle");

        //Nested frames
        WebElement element1=driver.findElement(By.xpath("//div[@id='content']"));
        System.out.println(element1.getText());

        //exit middle frame
        driver.switchTo().defaultContent();

        // main frame
        driver.switchTo().frame("frame-top");

        //swith to right frame
        driver.switchTo().frame("frame-right");

        //Nested frames
        WebElement rightElement=driver.findElement(By.xpath("//body"));
        System.out.println(rightElement.getText());

        //exit right frame
        driver.switchTo().defaultContent();

        // main frame buttom
        driver.switchTo().frame("frame-bottom");

        //Nested frames
        WebElement bottonFrame=driver.findElement(By.xpath("//body"));
        System.out.println(bottonFrame.getText());

        //exit bottom frame
        driver.switchTo().defaultContent();


        //close browser
        driver.close();

        Thread.sleep(3000);

    }

}
