package book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class UpdateStu {
	
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		map.put("01", "��ͬѧ");
		map.put("02", "κͬѧ");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		System.out.println("key�����е�Ԫ��");
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		Collection<String> coll =map.values();
		it = coll.iterator();
		System.out.println("values�����е�Ԫ��");
		
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
	}

}
