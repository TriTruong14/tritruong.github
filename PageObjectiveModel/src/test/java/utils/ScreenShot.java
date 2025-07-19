package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {
    public static void captureScreenshot(WebDriver driver, String namePrefix){
        //kiểm tra xem driver có hỗ trợ không
        if(!(driver instanceof TakesScreenshot)){
            System.out.println("Driver does not support screen captured");
        }

        //thực hiện thao tác chụp mành hình và lưu vào mục ảo
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //Tạo chuỗi thời gian
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        //Tạo nơi lưu file hình ảnh
        File destFile = new File("screenshot/" + namePrefix + "_" + timeStamp + ".png");

        try{
            Files.createDirectories(destFile.getParentFile().toPath());

            Files.copy(srcFile.toPath(),destFile.toPath());

            System.out.println("Captured Screen");
        } catch (IOException e) {
            System.out.println("Error while saving");
        }
    }
}
