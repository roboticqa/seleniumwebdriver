import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathLocatorDemo {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://advantageonlineshopping.com/admin/");

        driver.manage().window().maximize();

        List<WebElement> ancestorElement=driver.findElements(By.xpath("//input/ancestor::label"));
        List<WebElement> ancestorOrSelfElement=driver.findElements(By.xpath("//input/ancestor-or-self::label"));

        System.out.println("Ancestor: "+ancestorElement.size());
        System.out.println("Ancestor: "+ancestorOrSelfElement.size());

        driver.close();
    }
}
