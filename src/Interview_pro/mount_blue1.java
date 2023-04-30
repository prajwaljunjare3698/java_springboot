package Interview_pro;
//Input: Given an array of strings, [“RED”, “BLUE”, “GREEN”] 
//Output:
	// R B G
	// E L R
	// D U E
	//   E E
	//	   N
public class mount_blue1 {
	public static void main(String[] args) {
		String arr[] = {"RED","BLUE","GREEN"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length();j++) {
				System.out.print(arr[j].charAt(i)+" ");
			}
			System.out.println();
		}
	}
}
