package book;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) {
		
		File file = new File("E:\\QLF\\��װ�ļ�\\eclips-workspace\\project\\Word.txt");
		
		if(file.exists()) {
			
			file.delete();
			System.out.println("��ɾ��");
		}else {
			
			try {
				
				file.createNewFile();
				System.out.println("�Ѵ���");
			}catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
	}

}
