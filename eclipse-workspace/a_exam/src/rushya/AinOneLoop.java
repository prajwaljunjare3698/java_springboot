package rushya;

public class AinOneLoop {
	public static void main(String[] args) {
		 String s = "rushi sang pratu ie.kaljacha tukda";
		 boolean flag = true;
		 int count = 0;
		 int i = 0;
		 char c = 'a';
		 int temp = 0;
		 while(count<3 && temp==0) {
			 if(flag) {
				 if(i<s.length()) {
					 if(s.charAt(i)==c) {
						 count++;
						 flag = false;
					 }
					 if(count==3) {
						 System.out.println("a b c found");
					 }
					 i++;
				 }
				 else {
					 System.out.println(c+" not found");
					 temp++;
				 }
			 }
			 else {
				 i=0;
				 c++;
				 flag = true; 
			 }
		 }
//		 while(true) {
//			 if(flag) {
//				 if(i<s.length()) {
//					 if(s.charAt(i)==c) {
//						 count++;
//						 if(count==3) {
//							 System.out.println("found all");
//							 break;
//						 }
//						 flag = false;
//					 }
//					 i++;
//				 }
//				 else {
//					 System.out.println(c+" not found");
//					 break;
//				 }
//			 }
//			 else {
//				 i=0;
//				 c++;
//				 flag = true;
//			 }
//		 }
	}
}
