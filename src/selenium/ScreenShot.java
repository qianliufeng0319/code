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
//            //����FileUtils�������copy()��������getScreenshotAs()���ص��ļ�����
//            //����������ʹ��File.copyFile()��������������ԵĽ����Ҫʹ��copy()����
//            Files.copy(scrFile, new File("d:\\screenfile.png"));
//        } catch (IOException e) {
//            // �쳣����
//            e.printStackTrace();
//        }
	
	}

}
