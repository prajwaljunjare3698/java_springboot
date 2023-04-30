package bidkar;

public class ValidString {
//	Q1. Write a function to check string is valid or not.
//	Conditions
//	- Small letter vowels(a,e,i,o,u) has weight 0.5 and Capital letter vowels(A,E,I,O,U)weight 1
//	- Small letter consonants has weight 1 and Capital letter consonents has weight 2
//	- Special characters [!,@,#,^,&,*,(,),-,+,[,],.] has weight 1.5
//	- String is not valid with space,number
//	- Valid string contain weight of all the characters in the string is equal
//	Exmaples
//	1. String = "aaeeBacacee"  String is valid
//		a = 2
//		B = 2
//		c = 2
//		e = 2
//	2. String = "#GHyhgY#!!" String is valid	- 22111233
//		# = 3
//		! = 3					aeBjI
//		G+g = 3
//		H+h = 3
//		Y+y = 3
//	3. String ="abc$#123" String is not valid
	public static void main(String[] args) {
		check("aaeeBacacee");
	}
	private static void check(String str) {
		for(int i=0;i<str.length();i++) {
			
		}
	}
}
