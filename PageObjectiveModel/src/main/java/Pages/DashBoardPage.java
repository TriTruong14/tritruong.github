package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
        private WebDriver driver;
        public DashBoardPage (WebDriver driver) {
            this.driver = driver;
        }

        public void goToPimPage () {
            driver.findElement(By.xpath("//span[text()='PIM']")).click();
        }
        public void goToAdminPage () {
            driver.findElement(By.xpath("//span[text()='Admin']")).click();
        }
        public void goToMyInfoPage () {
            driver.findElement(By.xpath("//span[text()='My Info']")).click();
        }
    }
