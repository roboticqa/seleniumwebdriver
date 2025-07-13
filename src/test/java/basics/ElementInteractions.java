package basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;

public class ElementInteractions {

    public static void main(String[] args) throws InterruptedException, IOException {

        //Chromedriver instance
        WebDriver driver=new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        // navigate to application
        driver.get("https://seleniumbase.io/demo_page");

        //enter text "Roboticqa" in Text Input Field:
       WebElement input1= driver.findElement(By.id("myTextInput"));
       input1.sendKeys("RoboticQA Academy");
       input1.getScreenshotAs(OutputType.FILE);

        // enter text in textarea
        driver.findElement(By.name("textareaName")).sendKeys("Welcome to RoboticQA");

        // enter text in Pre-Filled Text Field
        WebElement prefilled=driver.findElement(By.id("myTextInput2"));
        prefilled.clear();
        prefilled.sendKeys("RoboticQA Academy Yuoutube Channel");

        // verify text
        WebElement text=driver.findElement(By.id("pText"));
        System.out.println("Text is:"+text.getText());


        //click on button
        driver.findElement(By.id("myButton")).click();

        // verify text
        WebElement text2=driver.findElement(By.id("pText"));
        System.out.println("Text is:"+text2.getText());

        Assert.assertEquals(text2.getText(),"This Text is Purple");

        // enter text in Placeholder Text Field:
        driver.findElement(By.xpath("//input[@placeholder='Placeholder Text Field']")).sendKeys("RoboticQA Shorts");

        //Select value from dropdown
        WebElement dropdown=driver.findElement(By.id("mySelect"));
        Select select=new Select(dropdown);
        //select.selectByValue("100%");
        select.selectByVisibleText("Set to 100%");

        //select checkbox
        WebElement chechbox=driver.findElement(By.id("checkBox1"));
        System.out.println("CheckBox isSelected:"+chechbox.isSelected());
        System.out.println("CheckBox isDisplayed:"+chechbox.isDisplayed());
        System.out.println("CheckBox isEnabled:"+chechbox.isEnabled());
        chechbox.click();
        System.out.println("CheckBox isSelected:"+chechbox.isSelected());
        System.out.println("CheckBox isDisplayed:"+chechbox.isDisplayed());
        System.out.println("CheckBox isEnabled:"+chechbox.isEnabled());

        //select radio button
        WebElement rdoBtn=driver.findElement(By.id("radioButton2"));
        System.out.println("Radio isSelected:"+rdoBtn.isSelected());
        System.out.println("Radio isDisplayed:"+rdoBtn.isDisplayed());
        System.out.println("Radio isEnabled:"+rdoBtn.isEnabled());
        rdoBtn.click();
        System.out.println("Radio isSelected:"+rdoBtn.isSelected());
        System.out.println("Radio isDisplayed:"+rdoBtn.isDisplayed());
        System.out.println("Radio isEnabled:"+rdoBtn.isEnabled());

        // get link url and text
        WebElement link=driver.findElement(By.id("myLink1"));
        System.out.println("Text of URL:"+link.getText());
        System.out.println("URL:"+link.getAttribute("href"));
        link.click();

        //wait time
        Thread.sleep(5000);

        //close driver
        driver.close();
    }

}
