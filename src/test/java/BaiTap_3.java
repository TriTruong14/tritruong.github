import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaiTap_3 {
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
            System.out.println("Login Successful");
            Thread.sleep(5000);

            WebElement firstName = driver.findElement(By.name("firstName"));
            WebElement lastName = driver.findElement(By.name("lastName"));
            String firstNameValue = firstName.getAttribute("value").trim();
            String lastNameValue = lastName.getAttribute("value").trim();

            String fullNameValue = firstNameValue + " " + lastNameValue;

            WebElement fullNameDisplay = driver.findElement(By.cssSelector("p.oxd-userdropdown-name"));//lấy xpath bằng classname => by.cssSelector or by.classname
            String fullNameDisplayValue = fullNameDisplay.getText().trim();

            if (fullNameValue.equalsIgnoreCase(fullNameDisplayValue)) {
                System.out.println("kết quả trùng khớp");
            } else {
                System.out.println("không trùng khớp");
            }


        } catch (InterruptedException e) {
            System.out.println("lỗi " + e);
        }
    }
}
