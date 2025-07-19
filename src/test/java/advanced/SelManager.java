package advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelManager {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options=new ChromeOptions();
        options.setBrowserVersion("140.0.7305.0");
        // Create chrome driver instance
        WebDriver driver=new ChromeDriver(options);
        //138

        //Set driver path
        //System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        //Maximize browser
        driver.manage().window().maximize();

        //navigate to google.com
        driver.get("https://google.com");

        //wait for 15 sec
        Thread.sleep(15000);

        //close browser
        driver.close();

    }
}
