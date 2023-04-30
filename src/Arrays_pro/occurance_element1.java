package Arrays_pro;
import java.util.HashMap;
import java.util.Map;

public class occurance_element1 {
	public static void main(String[] args) {
		String s="Prajwal";
		Map <Character, Integer>h = new HashMap();
		
		for(char c:s.toCharArray())
		{
			int count=0;
			if(h.containsKey(c))
			{
				count=h.get(c);
				h.put(c, ++count);
			}		
			else
			{
				h.put(c, 1);
			}
		}		
		System.out.println(h);
	}
}
