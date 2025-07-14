package advanced;

import org.openqa.selenium.Credentials;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URI;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BasicAuthDemo {
    public static void main(String[] args) throws InterruptedException {

        //Create chromedriver instance
        WebDriver driver=new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        // basic auth
        //HasAuthentication authentication=(HasAuthentication)driver;
        //authentication.register(()->new UsernameAndPassword("admin","admin"));

        Predicate<URI> uriPredicate= uri->uri.toString().contains("the-internet.herokuapp.com");
        Supplier<Credentials> authetication=UsernameAndPassword.of("admin","admin");
        ((HasAuthentication)driver).register(uriPredicate,authetication);

        Predicate<URI> uriPredicate1= uri->uri.toString().contains("google.com");
        Supplier<Credentials> authetication1=UsernameAndPassword.of("uname","pass");
        ((HasAuthentication)driver).register(uriPredicate1,authetication1);

        // navigate to application
        driver.get("https://the-internet.herokuapp.com/basic_auth");

        //wait for 5 seconds
        Thread.sleep(5000);

        //close driver
        driver.close();
    }
}
