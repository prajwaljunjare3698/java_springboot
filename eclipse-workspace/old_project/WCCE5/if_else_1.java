import java.util.*;

public class if_else_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any no");
        int a = sc.nextInt();

        if(a%2 == 0)
        {
            System.out.println("the no is even");
        }
        else{
            System.out.println("the no is odd");
        }
        sc.close();
    }
    
}
