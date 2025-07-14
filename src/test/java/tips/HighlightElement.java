package tips;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {
    public static void main(String[] args) {

        //create chrome instance
        WebDriver driver=new ChromeDriver();

        //navigate to application
        driver.get("https://www.google.com/");

        //maximize browser
        driver.manage().window().maximize();

        //find and get Element
        WebElement element=driver.findElement(By.name("q"));
        JavascriptExecutor js=((JavascriptExecutor)driver);

        js.executeScript("arguments[0].style.border='2px solid yellow'", element);


    }
}
