package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		Map m1 = new HashMap();
		m1.put("akshay", "quintify");
		m1.put("pankaj", "solera");
		m1.put("vishwas","infosys");
		m1.put("manish", "tcs");
		
		// output not in order
		//System.out.println(m1);
		
		Set s = m1.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
} 
