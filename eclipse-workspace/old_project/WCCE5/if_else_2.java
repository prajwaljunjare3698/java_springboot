import java.util.*;

public class if_else_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any no");
        int a = sc.nextInt();

        System.out.println("enter 2nd no");
        int b = sc.nextInt();

        if(a > b)
        {
            System.out.println(a+" is bigger than "+b);
        }
        else
        {
            System.out.println(b+"is bigger than"+a);
        }
        sc.close();
    }


    
}
