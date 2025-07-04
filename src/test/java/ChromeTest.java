import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://roboticqa.com");

        driver.manage().window().maximize();

        driver.quit();

    }
}
