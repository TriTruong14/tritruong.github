import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AND_OR {
    public static void main(String[] args) {
        WebDriver driver;
        WebElement w,x;
//        System.setProperty("webdriver.chrome.driver","E://Selenium//Selenium_Jars//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        // Launch the application
        driver.get("https://mail.google.com/mail/u/0/");

        //Search element using OR in the xpath
        w=driver.findElement(By.xpath("//*[@type='submit' OR @name='btnReset']"));

        //Print the text of the element
        System.out.println(w.getText());

        //Search element using AND in the xpath
        x=driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogin']"));

        //Print the text of the searched element
        System.out.println(x.getText());

        //Close the browser
        driver.quit();
    }
}
