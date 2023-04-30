package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap2 {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(7, "first");
		m.put(2, "second");
		m.put(8, "third");
		m.put(4, "fourth");
		m.put(5, "fifth"); 
//		System.out.println(m);
//		
//		Set s = m.entrySet();
//		Iterator itr = s.iterator();
//		
//		while(itr.hasNext()) {
//			 //Converting to Map.Entry so that we can get key and value separately  
//			Map.Entry entr = (Map.Entry)itr.next();
//			
//			System.out.println(entr.getKey()+" "+entr.getValue());
//		}
		System.out.println(m.get(9));	//null
		System.out.println(m.get(2) ); 	//second
	}
}
