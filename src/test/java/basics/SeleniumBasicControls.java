package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicControls {

    public static void main(String[] args) {
        // create chrome driver instance
        WebDriver driver=new ChromeDriver();

        // get application
        driver.get("https://testpages.eviltester.com/styled/basic-ajax-test.html");

        //maximize window
        driver.manage().window().maximize();

        

        //close browser
        driver.close();
    }
}
