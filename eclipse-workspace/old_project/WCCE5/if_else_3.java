// biggest no from amond 3 no

import java.util.*;

public class if_else_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st no");
        int a = sc.nextInt();

        System.out.println("enter 2nd no");
        int b = sc.nextInt();

        System.out.println("enter 3rd no");
        int c = sc.nextInt();

        if(a > b && a > c)
        {
            System.out.println(a+" is greater than "+b+" and "+c);
        }
        else if(b > a && b > c)
        {
            System.out.println(b+" is greater than "+a+" and "+c);
        }
        else if(c > a && c > b)
        {
            System.out.println(c+" is grater than "+a+" and "+b);
        }

        sc.close();
    }
    
}
