package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationAndWindows {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {


        //create chrome driver instance
        WebDriver driver=new ChromeDriver();

        //Navigate to application
        driver.get("https://roboticqa.com/selenium-demo-app/");

        //maximize the windows - standard - taskbar will be visible
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //maximize full screen - full screen size - it will take taskbar also
        driver.manage().window().fullscreen();

        Thread.sleep(2000);

        //navigate to URL string
        driver.navigate().to("https://google.com");

        Thread.sleep(2000);

        //navigate using URL object
        URL url=new URL("https://google.com");
        driver.navigate().to(url);
        System.out.println("Title:"+driver.getTitle());

        Thread.sleep(2000);

        // Navigate to back in browser
        driver.navigate().back();
        driver.navigate().back();


        Thread.sleep(2000);
        System.out.println("Title:"+driver.getTitle());

        // Navigate to forwards in browser
        driver.navigate().forward();

        Thread.sleep(2000);
        System.out.println("Title:"+driver.getTitle());

        //refresh the page
        driver.navigate().refresh();

        Thread.sleep(2000);

        //close the browser
        driver.close();

    }

}
