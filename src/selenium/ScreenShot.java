package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShot {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.baidu.com/");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		File scrFile = ((RemoteWebDriver) dr).getScreenshotAs(OutputType.FILE);
		
		try {
			Files.copy(scrFile, new File("d:\\screenfile.png"));	
		}catch (IOException e){
			e.printStackTrace();
		}

		dr.quit();
		
//		try {
//            //利用FileUtils工具类的copy()方法保存getScreenshotAs()返回的文件对象。
//            //看到网上有使用File.copyFile()方法，我这里测试的结果需要使用copy()方法
//            Files.copy(scrFile, new File("d:\\screenfile.png"));
//        } catch (IOException e) {
//            // 异常处理
//            e.printStackTrace();
//        }
	
	}

}
