package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {

        //Create WebDriver instance for chrome
        WebDriver driver=new ChromeDriver();

        //Create WebDriver instance for Firefox
        //WebDriver driver=new FirefoxDriver();

        //Create WebDriver instance for Edge
        //WebDriver driver=new EdgeDriver();

        //Create WebDriver instance for Edge
        //WebDriver driver=new SafariDriver();

        //Create WebDriver instance for Edge
       // WebDriver driver=new InternetExplorerDriver();

        //Navigate to application
        driver.get("https://google.com");

        //Maximize the application
        driver.manage().window().maximize();

        //close current windows
        driver.close();

        //all associated windows
        //driver.quit();
    }

}
