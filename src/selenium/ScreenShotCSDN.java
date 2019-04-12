package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCSDN {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.get("https://passport.csdn.net/account/login?ref=toolbar");
		dr.manage().window().maximize();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.findElement(By.xpath("//*[@id=\'app\']/div/div/div/div[2]/div[4]/ul/li[2]/a")).click();
		
		try {

		//输入用户名和密码，此处专门将密码输入错误，造出异常现象
			
		dr.findElement(By.xpath("//*[@id=\'all\']")).sendKeys("ab_2016");
		dr.findElement(By.id("password-number")).sendKeys("123");
		dr.findElement(By.xpath("//*[@id=\'app\']/div/div/div/div[2]/div[4]/form/div/div[6]/div/button")).click();
	
		// 由于密码输入错误，所以无法进入登陆后页面，也就无法进行点击“设置”的操作，因此如我们所愿，进入catch分支
		dr.findElement(By.linkText("设置")).click();


			
		}catch(Exception e){
		
		// 打印异常原因，控制台也会打印
			
		System.out.println("====exception reason==="+ e);

		//图片名称加时间戳
		
		String dateString = getDateFormat();
		// getScreenshotAs()对当前窗口进行截图
		File srcFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		// 需要指定图片的保存路径及文件名
		FileUtils.copyFile(srcFile, new File("d:\\selenium"+dateString+".png"));
		
		e.printStackTrace();
		
        System.out.println("d:\\selenium"+dateString+".png");
			
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.quit();
		
		
	}
	
	public static String getDateFormat() {
		
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		String dateString = sdf.format(date);
		return dateString;
	}
	

	

}
