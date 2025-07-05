import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String [] args) {
        //tự động tải chrome
        WebDriverManager.chromedriver().setup();
        //khởi tạo trình duyệt chrome
        WebDriver driver = new ChromeDriver();
        //mở fullscreen

        //thiết lập chromeoption dể dùng profile thật -> mở chrome search chrome://version
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("user-data-dir=\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
//        options.addArguments("--profile-directory=Default");

        driver.manage().window().maximize();
        //truy cập google
        driver.get("https://www.google.com");

        //tìm tới ô tìm kiếm của google
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
        //nhập dữ liệu vào ô tìm kiếm
        searchBox.sendKeys("Hoc Selenium");
        //nhấn enter để tìm
        searchBox.submit();

        //đóng trình duyệt
//        driver.quit();

        //xpath: "//tagname[@attribute="value"]
            // "//": tìm kiếm ở mọi nơi có trong cây html
            //tagname: tên thẻ html (div,input,span,p,h,img,...) ko bao gồm style và script
            //attribute: điều kiện lọc (type, id, class,...)
        //contains
            //xpath: //tagname[contains(@attribute, value)]
            //ví dụ: h1[contains(@class, "text-2xl")]
            //ví dụ 2: //h1[text()="XPath Demo Page"] --> dẫn tuyệt đối/khớp toàn bộ nội dung
            //         //h1[contains(@text()="XPath")] --> dẫn tương đối/khớp 1 phần nội dung
        //text()
            //xpath: //tagname[text()="value"]
            //ví dụ: //button[text()="Login"] --> trỏ đến nút button có text = Login
        //xpath: (xpath cơ bản)[vị trí]
            //ví dụ: (//li[text()="Item"])[3] --> trong 1 page có nhiều phần tử giống nhau, chỉ khác vị trí thì thêm index cho phần tử cần tìm.
            //                                    trỏ đến Item thứ 3 trong nhiều items

        //following-sibling  --> để tìm phần tử có liên quan đến phần tử khác, dùng để lấy thẻ đứng sau
            //ví dụ 1: label/following-sibling::input[@name="username"]
            //ví dụ 2: (//label/following-sibling::input)[1]
        //preceding-sibling  --> dùng để lấy thẻ đứng trước,  ngược lại following-sibling

        //and: thỏa mãn hết tất cả điều kiện, or: thỏa mãn 1 trong những điều kiện đúng.

        //normalize-space: loại bỏ khoảng trắng đầu và cuối để so sánh
            //ví dụ: //button[normalize-space(@text="Login")]
    }
}
