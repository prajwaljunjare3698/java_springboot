package rushya;

public class StringPro {
    public static void main(String args[]) {
      String s = "dg#js/3sj#hd6/3jd62#/3";
            
      int count = 0;
      boolean flag = false;
      for(int i=0;i<s.length()-count;i++) {
    	  if(s.charAt(i)=='#') {
    		  for(int j=s.length()-1;j>=i;j--) {
    			  if(s.charAt(j)=='#') {
    				  count = j;
    				  flag = true;
    				  break;
    			  }
    		  }
    	  }
    	  if(flag) {
    		  for(int k=i+1;k<=count--;k++) {
    			  if(s.charAt(k)!='#') {
    				  System.out.println(s.charAt(k));
    			  }
    		  }
    		  flag = false;
    	  }
      }
    }
}