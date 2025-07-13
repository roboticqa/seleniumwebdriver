package advanced;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.plaf.TableHeaderUI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DownloadFileDemo {

    public static void main(String[] args) {

        //chromeoptions
        ChromeOptions options=new ChromeOptions();
        Map<String, Object> prefs=new HashMap<String,Object>();
        prefs.put("download.default_directory",System.getProperty("user.dir")+"//target//downloadFiles");
        options.setExperimentalOption("prefs",prefs);

        //create chrome instance
        WebDriver driver=new ChromeDriver(options);

        // navigate to application
        driver.get("https://the-internet.herokuapp.com/download");

        //maximize windows
        driver.manage().window().maximize();


        // click on file
        //WebElement link=driver.findElement(By.xpath("//h3[text()='File Downloader']/following-sibling::a[1]"));
        //link.click();

        //download all files
        List<WebElement> links=driver.findElements(By.xpath("//h3[text()='File Downloader']/following-sibling::a"));
        links.stream().forEach(link->{
            try{
                link.click();
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        });

        //close driver
        driver.close();
    }

}
