package book;

public class Take {
	
	public static void main(String[] args) {
		
		try {
			String str = "lili";
			System.out.println(str+"�����ǣ�");
			int age = Integer.parseInt("20L");
			System.out.println(age);
			
		}catch(Exception e) {
			e.printStackTrace();		
		}
		
		System.out.println("program over");
	}

}
