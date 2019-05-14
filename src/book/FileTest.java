package book;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) {
		
		File file = new File("E:\\QLF\\安装文件\\eclips-workspace\\project\\Word.txt");
		
		if(file.exists()) {
			
			file.delete();
			System.out.println("已删除");
		}else {
			
			try {
				
				file.createNewFile();
				System.out.println("已创建");
			}catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
	}

}
