import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class SeleniumWaitDemo {

    public static void main(String[] args) {

        // create chrome driver instance
        WebDriver driver=new ChromeDriver();

        // get application
        driver.get("https://testpages.eviltester.com/styled/basic-ajax-test.html");

        //maximize window
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Select Web from dropdown
        WebElement dropdown=driver.findElement(By.name("id"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Desktop");

        By language=By.xpath("//select/option[@selected]");

        //Explicit wait
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(language));
        System.out.println(driver.findElement(language).getText());

        WebElement spinner=driver.findElement(By.xpath("//span[@id='ajaxBusy']/img"));
        wait.until(ExpectedConditions.invisibilityOf(spinner));

        //Fluent Wait
        Wait<WebDriver> fluentWait=new FluentWait<>(driver)
                .pollingEvery(Duration.ofSeconds(1))
                        .withTimeout(Duration.ofSeconds(20))
                                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.invisibilityOf(spinner));



        //wait until spinner to disapper


        //click on button
        WebElement submitBtn=driver.findElement(By.xpath("//input[@name='submitbutton']"));
        submitBtn.click();

        //close browser
        driver.close();

    }
}
