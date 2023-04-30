package strings;

public class Strings2 {
	public static void main(String[] args) {
	
		String s =" I love India ";
		System.out.println(s.length());
		
		System.out.println("---------");
		
		System.out.println(s.toUpperCase());
		
		System.out.println("----------");
		
		System.out.println(s.toLowerCase());
		
		System.out.println("----------");
		
		System.out.println(s.startsWith( " I"));
		System.out.println(s.startsWith( " i"));
		
		System.out.println("----------");
		
		System.out.println(s.endsWith("ia "));
		System.out.println(s.endsWith("IA"));
		
		System.out.println("--------");
		System.out.println(s.contains("Ind"));
		System.out.println(s.contains("ind"));
		
		System.out.println("------------");
		System.out.println(s.concat(" im from india"));
		
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(90));
		
		System.out.println("----------");
		System.out.println(s.indexOf('I',2));
		System.out.println(s.indexOf('q'));
		System.out.println(s.indexOf('a'));
		
		System.out.println("-----------");
		
		System.out.println(s.substring(3));
		System.out.println(s.substring(7));
		
		System.out.println("---------");
	    System.out.println(s.substring(3,7));
	    System.out.println(s.substring(13,15));
		

}
}