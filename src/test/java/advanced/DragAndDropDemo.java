package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

    public static void main(String[] args) throws InterruptedException {
        //Create chromedriver instance
        WebDriver driver=new ChromeDriver();

        // navigate to application
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        //maximize browser
        driver.manage().window().maximize();

        //wait
        Thread.sleep(5000);

        // Drag and Drop
        WebElement draggable=driver.findElement(By.id("column-a"));
        WebElement droppable=driver.findElement(By.id("column-b"));
//
//        Actions actions=new Actions(driver);
//        actions.dragAndDrop(droppable,draggable).perform();

        //wait
        Thread.sleep(5000);

        //Drag and Drop by OffSet
        Rectangle start=draggable.getRect();
        Rectangle finish=droppable.getRect();
        new Actions(driver).dragAndDropBy(draggable, finish.getX() -start.getX(), finish.getY()-start.getY())
                .perform();

        //close driver
        driver.close();
    }

}
