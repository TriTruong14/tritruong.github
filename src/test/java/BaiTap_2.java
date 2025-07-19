import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaiTap_2 {
    public static void main (String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://opensource-demo.orangehrmlive.com");
            Thread.sleep(5000);

            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
            System.out.println("Login successful");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//span[text()=\"PIM\"]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[contains(text(),\"Add Employee\")]")).click();
            Thread.sleep(3000);
            driver.findElement(By.name("firstName")).sendKeys("Tri");
            driver.findElement(By.name("lastName")).sendKeys("Truong");
            WebElement empID = driver.findElement(By.xpath("//label[text()=\"Employee Id\"]/../following-sibling::div/input"));
            String empIDValue = empID.getAttribute("value").trim();
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();


        } catch (InterruptedException e) {
            System.out.println("Lỗi" + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
