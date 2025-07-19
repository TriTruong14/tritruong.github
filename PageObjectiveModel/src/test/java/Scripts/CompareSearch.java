package Scripts;

import Pages.AdminPage;
import Pages.DashBoardPage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CompareSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://opensource-demo.orangehrmlive.com");
            Thread.sleep(5000);
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("Admin", "admin123");

            Thread.sleep(5000);
            DashBoardPage dashboardPage = new DashBoardPage(driver);
            dashboardPage.goToAdminPage();

            Thread.sleep(5000);
            AdminPage adminPage = new AdminPage(driver);
            adminPage.searchUsername("admin");
            Thread.sleep(5000);

            Boolean isUserFound = adminPage.isUserFound("admin");
            if(isUserFound){
                System.out.println("USER Found ");
            }else {
                System.out.println("USER NOT FOUND");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            driver.quit();
        }
    }
}
