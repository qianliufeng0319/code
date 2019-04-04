package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEvents {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.get("http://www.baidu.com");
		dr.manage().window().maximize();
		
		dr.findElement(By.id("kw")).sendKeys("selenium");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ɾ��һ��m
		dr.findElement(By.id("kw")).sendKeys(Keys.BACK_SPACE);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 //����m �ո� �̳�
		
		dr.findElement(By.id("kw")).sendKeys("m");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dr.findElement(By.id("kw")).sendKeys(Keys.SPACE);
		dr.findElement(By.id("kw")).sendKeys("�̳�");
		
		//ȫѡ���������
		
		dr.findElement(By.id("kw")).sendKeys(Keys.CONTROL,"a");
		
		//�������������
		
		dr.findElement(By.id("kw")).sendKeys(Keys.CONTROL,"x");
		
		//ճ�����������
		
		dr.findElement(By.id("kw")).sendKeys(Keys.CONTROL,"v");
		
		//ͨ���س��������ύ����
		
		dr.findElement(By.id("kw")).sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		dr.quit();
	}

}
