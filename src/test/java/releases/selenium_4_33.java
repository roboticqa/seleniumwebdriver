package releases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_4_33 {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://roboticqa.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//body")).getAttribute("");


    }

}
