import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class BaiTap_4_CompareSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://opensource-demo.orangehrmlive.com");
            sleep(5000);
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
            System.out.println("Login Successful");
            sleep(5000);

            driver.findElement(By.xpath("//span[text()=\"Admin\"]")).click();
            sleep(5000);
            //nhập dữ liệu vào ô username và search
            WebElement userName = driver.findElement(By.xpath("//label[text()=\"Username\"]/../following-sibling::div/input"));
            userName.sendKeys("Tri");
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
            System.out.println("Đã ấn tìm kiếm");
            sleep(3000);

            //lấy danh sách
            List<WebElement> row = driver.findElement(By.cssSelector(".oxd-table-body"));
            //đặt cờ
            boolean userFound = false; //không tìm thấy
            //tạo vòng lặp lấy dữ liệu từng dòng
//            for (WebElement row:rows)
//                if (userFind.)
                  //  (By.xpath("//div[@role=\"cell\"][2]/div")).getText();
        } catch (InterruptedException e) {
            System.out.println("lỗi " + e);
        }
    }
}
