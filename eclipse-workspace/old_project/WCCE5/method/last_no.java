package method;
import java.util.Scanner;
public class last_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        int result = no%10;

        System.out.println(result);

        sc.close();

    }
    
}
