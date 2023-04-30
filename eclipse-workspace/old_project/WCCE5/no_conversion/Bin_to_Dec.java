package no_conversion;

public class Bin_to_Dec {
	public static void main(String[] args) {
		int a = 1100;
		int powr=0;
		int no=0;
		int mul = 1;
		int temp=0;
		int iter=0;
		int i=1;
		boolean s = false;
		boolean flag=true;
		while(a>0) {
			if(flag) {
				temp = a%10;
				flag=false;
			}
			if(!flag) {
				if(i<=iter) {
					mul=mul*2;
					i++;
				}
				else {
					if(temp==1) {
						no=no+mul;
					}
					mul=1;
					i=1;
					iter++;
					a=a/10;
					flag=true;
				}
			}
		}
		System.out.println(no);
	}
}
