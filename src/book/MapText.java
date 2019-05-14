package book;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class MapText {
	
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		Emp emp = new Emp("001","����");
		Emp emp2 = new Emp("005","����");
		Emp emp3 = new Emp("004","��һ");
		map.put(emp.getE_id(), emp.getE_name());
		map.put(emp2.getE_id(), emp2.getE_name());
		map.put(emp3.getE_id(), emp3.getE_name());
		
		Set <String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		System.out.println("HashMap��ʵ�ֵ�Map���ϣ�����");
		
		while(it.hasNext()){
			
		String str = (String) it.next();
		String name = (String) map.get(str);
		System.out.println(str+" "+name);
		
			
		}
		
		TreeMap<String,String> treemap = new TreeMap<>();
		treemap.putAll(map);
		
		Iterator<String> iter = treemap.keySet().iterator();
		
		System.out.println("TreeMap��ʵ�ֵ�Map���ϣ�����������");
		
		while(iter.hasNext()) {
			
		String str = (String) iter.next();
		String name = (String) treemap.get(str);
		System.out.println(str+" " + name);
			
		}
	}

}
