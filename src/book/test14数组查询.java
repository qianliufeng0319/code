package book;

import java.util.Arrays;

public class test14�����ѯ {
	
	public static void main(String[] args) {
		
		int ia[] = new int[] {1,8,9,4,5};
		
		Arrays.sort(ia);
		
		int index = Arrays.binarySearch(ia, 4);
		
		System.out.println("4������λ���ǣ�"+index);
	}
	

}
