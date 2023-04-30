package study;

public class StringtoNOwitoutParseInt {
    public static void convert(String s)
    {
    	int num = 0;
    	int n = s.length();
    	
    	for(int i = 0; i < n; i++) {
    		
    		num = num * 10 + ((int)s.charAt(i) - 48);    		
    	}
    	
    	System.out.println(num);
    }
    
    public static void main(String[] args)
    {
    	String s = "12453";
    	convert(s);
    	
    	String a = "A";
    	int no = (int)a.charAt(0)-48;
    	System.out.print(no);
    }
}
