package book;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest1 {

	
	public static void main(String[] args) {
		
		File file = new File("word.txt1");
		try{
			
			FileOutputStream out = new FileOutputStream(file);
			byte buy[]="����һֻСë¯".getBytes();
			
			out.write(buy);
			out.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		try {
			
			FileInputStream in = new FileInputStream(file);
			byte byt[] = new byte[1024];
			int len = in.read(byt);
			System.out.println("�ļ��е���Ϣ�ǣ�"+new String(byt,0,len));
			in.close();
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	
	
	
}
