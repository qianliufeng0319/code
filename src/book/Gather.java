package book;

import java.util.ArrayList;
import java.util.List;

public class Gather {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		int i = (int)(Math.random()*(list.size()-1));
		System.out.println("�����ȡ�����е�Ԫ�أ�"+list.get(i));
		list.remove(2);
		System.out.println("�������ǡ�2����Ԫ�ش��������Ƴ��������е�Ԫ���ǣ�");
		for(int j=0;j<list.size();j++) {
			
			System.out.println(list.get(j));
			
		}
	}

}
