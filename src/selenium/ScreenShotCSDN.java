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

		//�����û��������룬�˴�ר�Ž����������������쳣����
			
		dr.findElement(By.xpath("//*[@id=\'all\']")).sendKeys("ab_2016");
		dr.findElement(By.id("password-number")).sendKeys("123");
		dr.findElement(By.xpath("//*[@id=\'app\']/div/div/div/div[2]/div[4]/form/div/div[6]/div/button")).click();
	
		// ��������������������޷������½��ҳ�棬Ҳ���޷����е�������á��Ĳ����������������Ը������catch��֧
		dr.findElement(By.linkText("����")).click();


			
		}catch(Exception e){
		
		// ��ӡ�쳣ԭ�򣬿���̨Ҳ���ӡ
			
		System.out.println("====exception reason==="+ e);

		//ͼƬ���Ƽ�ʱ���
		
		String dateString = getDateFormat();
		// getScreenshotAs()�Ե�ǰ���ڽ��н�ͼ
		File srcFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		// ��Ҫָ��ͼƬ�ı���·�����ļ���
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
