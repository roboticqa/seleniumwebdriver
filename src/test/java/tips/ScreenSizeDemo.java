package tips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenSizeDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        //Maximize
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //fullscreen
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.close();
    }
}
