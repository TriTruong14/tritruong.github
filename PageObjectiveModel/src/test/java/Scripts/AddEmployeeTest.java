package Scripts;

import Pages.AddEmployee;
import Pages.DashBoardPage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.ExcelReader;

import java.time.Duration;

public class AddEmployeeTest extends BaseTest {
    @Test
    public void AddEmployee () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //chờ ô input username sẵn sàng
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin","admin123");
        System.out.println("Login successful");

            DashBoardPage dashboardPage = new DashBoardPage(driver);
            dashboardPage.goToPimPage();
            System.out.println("Go to Pim successful");

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()=\"Add Employee\"]")));
            AddEmployee addEmployee = new AddEmployee(driver);
            addEmployee.goToAddEmployee();
            System.out.println("Navigation successful");

            String filePath = "PageObjectiveModel/src/test/java/Resources/TestData.xlsx";
            String firstName = ExcelReader.getCellData(filePath, "Sheet1", 1, 1).trim();
            String lastName = ExcelReader.getCellData(filePath,"Sheet1",1,2).trim();
            String empID = addEmployee.addNewEmployee(firstName,lastName);
            System.out.println("Add employee successful");

            Boolean isVerify = addEmployee.verifyNewEmployee(firstName, lastName, empID);
            if(isVerify){
                System.out.println("The results match");
            }else{
                System.out.println("The results do not match");
            }
        }
    }
