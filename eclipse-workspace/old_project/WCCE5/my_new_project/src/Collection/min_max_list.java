package Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class min_max_list {
	public static void main(String[] args) {
		ArrayList<Integer> a = new <Integer> ArrayList();
		a.add(3);
		a.add(2);
		a.add(8);
		a.add(4);
		a.add(1);
		//a.add(null);//null can accept in Integer
		
		Integer b= 2;
//		for(int i=0;i<a.size();i++) {
//			if(a.get(i)%b==0) {
//				System.out.println(a.get(i));
//			}
//		}
		int arr[] = {1,2,34,5};
		ArrayList a1 = new ArrayList();
		for(int i=0;i<arr.length;i++) {
			a.add(arr[i]);
		}
		System.out.println(a);
//		for(Object o:a) {
//			if(o%i==0) {
//				System.out.println(o);
//			}
		//			
//		}
		Iterator i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("find even no");
		for(int p=0;p<a.size();p++) {
			int b1 = a.get(p);
			if(b1%2==0) {
				System.out.println(b1);
			}
		}
		
		
	}
	
}
