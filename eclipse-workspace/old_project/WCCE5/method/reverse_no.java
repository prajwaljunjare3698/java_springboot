package method;
import java.util.Scanner;
public class reverse_no
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        
        int remainder=0;
        int result=0;

        while(no>0)
        {
            remainder = no%10;
            result = result *10+remainder;
            no = no/10;
        }
        System.out.println(result);
        sc.close();
    }
    
}
