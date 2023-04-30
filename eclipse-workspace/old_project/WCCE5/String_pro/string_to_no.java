package String_pro;
public class string_to_no extends Exception {
	public static void main(String[] args) {
		  String s = "abc123xyz";
	      String s1 = "";
	      int var = 0;
	      int b = 0;
	      int ob=0;
	      for(int i=0;i<s.length();i++){
	          try{
	        	  String k = ""+s.charAt(i);
	              ob = Integer.parseInt(k);
	              System.out.println(ob);
	              b=b*10+ob;
	          }
	          catch(Exception e){
	              //System.out.println("its not no "+s.charAt(i));
	        	  //System.out.println();
	          }
	      }
	    System.out.println(b);
	}
}
