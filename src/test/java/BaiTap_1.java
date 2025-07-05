import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaiTap_1 {
    public static void main (String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://www.saucedemo.com");
            Thread.sleep(5000);
            WebElement userName = driver.findElement(By.xpath("//input[@name=\"user-name\"]"));
            WebElement userPassword = driver.findElement(By.xpath("//input[@name=\"password\"]"));
            WebElement btnLogin = driver.findElement(By.xpath("//input[@name=\"login-button\"]"));
            //cách thứ 2 lấy nhanh hơn nếu dùng ID
//            WebElement userName = driver.findElement(By.id("user-name"));

            //chỗ web này ko lấy giá trị động bằng String được vì đó là 1 mảng, cần code phức tạp hơn.
//            String userNameValue = userName.split(":")[1].trim();
//            String userPasswordValue = userPassword.split(":")[1].trim();

            userName.sendKeys("standard_user");
            userPassword.sendKeys("secret_sauce");
            btnLogin.click();

            Thread.sleep(6000);
            System.out.println("Login successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
