package singleton_break;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Single implements Serializable{
	private static final long serialVersionUID = 1L;
	static Single obj = new Single();
	private Single(){
	}
	public static Single getInstance() {
		return obj;
	}	
//	 public Object readResolve() throws Exception {
//	        return obj; 
//	    }	
}
public class BreakByDeserialization {
	public static void main(String[] args) throws Exception {
		Single obj1 = Single.getInstance();
		System.out.println(obj1.hashCode());
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("singleton_break.simple.txt"));		
			os.writeObject(obj1);
			
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("singleton_break.simple.txt"));
			Single obj2 = (Single) inputStream.readObject();
			System.out.println(obj2.hashCode());			
			
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}
}
