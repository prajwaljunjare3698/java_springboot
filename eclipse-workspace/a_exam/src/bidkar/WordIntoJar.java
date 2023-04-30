package bidkar;

//Q2. Write a function that divides a phrase into word jars, 
//with each jar containing n or fewer characters. Only include full words inside each jar.
//Examples
//divideString("she sells sea shells by the sea", 10)
//=> ["she sells", "sea shells", "by the sea"]
//divideString("the mouse jumped over the cheese", 7)
//=> ["the", "mouse", "jumped", "over", "the", "cheese"]
//divideString("a b c d e", 2)
//=> ["a", "b", "c", "d", "e"]
//Notes
//- Spaces count as one character.
//- Trim beginning and end spaces for each word jar.
//- If jars are too small to hold a single word, return an empty array: []
public class WordIntoJar {
	public static void main(String[] args) {
		String str = "india is my country";
		int range = 7;
		String s = "";
		int count = 0;
		for(int i=0;i<str.length();i++) {
			int j = i;
						
			if(count<range-1) {
				s = s + str.charAt(i);
				count++;
				System.out.println(s+" "+count);
			}
			else {
				System.out.println(count);
				if(str.charAt(j)==' ' || str.charAt(++j)==' ') {
					System.out.println(s);
					s = "";
					count = 0;
				}
				else {
					System.out.println(s);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
//		int c = 0;
//		int count = 0;
//		for(int i=0;i<str.length();i++) {
//			if(s.length()<=range) {
//				if(str.charAt(i)!=' ' || s.length()/2-1<range) {
//					s = s + str.charAt(i); 
//					count++;
//					c = i;
//					System.out.println(s);
//				}
//				else {
//					String next = "";
//					int j = count;
////					System.out.println(j);
//					for(j=count;j<=range;j++) {
//						next = next + str.charAt(++c);
////						System.out.println(next);
//					}
////					System.out.println(j);
//					if(j == range && str.charAt(j)==' ') {
//						s = s + next; 
////						System.out.println("inside");
//						count = 0;
//						System.out.println(s);
//					}
//					else {
//						System.out.println(s);
//						s = "";
//						count = 0;
//					}
//				}								
//			}
//		}
	}
}
