package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

    public static void main(String[] args) throws InterruptedException {

        //Create chromedriver instance
        WebDriver driver=new ChromeDriver();

        // navigate to application
        driver.get("https://the-internet.herokuapp.com/iframe");


        //maximize browser
        driver.manage().window().maximize();

        //close the popup
        WebElement popupClose=driver.findElement(By.xpath("//button[contains(@class,'tox-notification__dismiss')]/div/*"));
        popupClose.click();

        //switch to iframe
        driver.switchTo().frame("mce_0_ifr");

        //get text
        WebElement text=driver.findElement(By.xpath("//body[@id='tinymce']/p"));
        System.out.println("The Text is :"+text.getText());

        //come out of frame
        driver.switchTo().defaultContent();

        //get title text
        WebElement titleHeading=driver.findElement(By.xpath("//h3"));
        System.out.println("Title Heading is :"+ titleHeading.getText());

        //close browser
        driver.close();

        Thread.sleep(3000);

    }

}
