import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");

        // ID locator
        driver.findElement(By.id("small-searchterms")).sendKeys("Apple");

        //class locator
        driver.findElement(By.className("search-box-button")).click();

        //name locator
        driver.findElement(By.name("NewsletterEmail")).sendKeys("roboticqa");

        //link text
        driver.findElement(By.linkText("My account")).click();

        //tag name
        driver.findElement(By.tagName("input")).click();

        //partial link text
        driver.findElement(By.partialLinkText("Recently")).click();

        //xpath example
        driver.findElement(By.xpath("//input[@value='2']")).click();

        Thread.sleep(5000);

        driver.manage().window().maximize();

        driver.quit();
    }

}
