package Scripts;

import Pages.AddEmployee;
import Pages.DashBoardPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import utils.ScreenShot;

public class AddEmployeeTest {
    public static void main (String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        WebDriver driver = DriverFactory.getDriver(); // cách mới khi đã có lớp DriverFactory rồi

        try {
            driver.get ("https://opensource-demo.orangehrmlive.com");
            Thread.sleep(5000);

            //lớp loginpage
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("Admin", "admin123");

            System.out.println("Login successful");
            Thread.sleep(5000);

            DashBoardPage dashboardPage = new DashBoardPage(driver);
            dashboardPage.goToPimPage();
            System.out.println("Go to Pim successful");
            Thread.sleep(3000);

            AddEmployee addEmployee = new AddEmployee(driver);
            addEmployee.goToAddEmployee();
            System.out.println("Navigation successful");
            Thread.sleep(3000);

            String firstName = "Tri";
            String lastName = "Truong";
            String empID = addEmployee.addNewEmployee(firstName,lastName);
            System.out.println("Add employee successful");
            Thread.sleep(5000);

            Boolean isVerify = addEmployee.verifyNewEmployee(firstName, lastName, empID);
            if(isVerify){
                System.out.println("The results match");
            }else{
                System.out.println("The results do not match");
            }

        } catch (Exception e) {
            System.out.println("lỗi: " + e.getMessage());
            ScreenShot.captureScreenshot(driver,"AddEmployeeTest");
        } finally {
            driver.quit();
        }
    }
}
