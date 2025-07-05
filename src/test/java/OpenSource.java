import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSource {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login?fbclid=IwY2xjawLNlTRleHRuA2FlbQIxMABicmlkETFHWlRzREROVjUyM2pXdnFrAR7PpESQdoA0hZHc1yIJuso667wF0-cMADgldKPc1xuLDXBeOKlxi0J3Vh2KbQ_aem_YzYsLc13R7p1GHHww9Welw");

            Thread.sleep(5000);

            //locator ô input
            WebElement userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
            WebElement passWord = driver.findElement(By.xpath("//input[@name=\"password\"]"));
            //nhập dữ liệu đã được set cứng
//            userName.sendKeys("Admin");
//            passWord.sendKeys("admin123");

            //Nếu muốn nhập dữ liệu động thì làm theo các bước dưới đây
            //đầu tiên lấy giá trị từ locator
            String userNameText = driver.findElement(By.xpath("//p[starts-with(normalize-space(),\"Username\")]")).getText();
            String userPasswordText = driver.findElement(By.xpath("//p[starts-with(normalize-space(),\"Password\")]")).getText();
            //Xử lý chuỗi
            String userNameValue = userNameText.split(":")[1].trim();
            String userPasswordValue = userPasswordText.split(":")[1].trim();
            //nhập dữ liệu ĐỘNG từ locator
            userName.sendKeys(userNameValue);
            passWord.sendKeys(userPasswordValue);


            WebElement btnLogin = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
            btnLogin.click();

            Thread.sleep(6000);

            System.out.println("Đăng nhập thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            driver.quit();
        }
    }
}
