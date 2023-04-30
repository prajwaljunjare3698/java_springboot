package method;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        int no1 = sc.nextInt();
        System.out.println("enter second no");
        int no2 = sc.nextInt();
        System.out.println("enter operation +,-,*,/");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case '+':
            {
            add(no1,no2);
            break;
                    }
            case '-':
            {
            sub(no1,no2);
            break;
            }       
            case '*':
            {
            mul(no1,no2); break;}
            case '/':
            {
            div(no1,no2); break;}
            default :
            {
                System.out.println("invalid");
            }
        }
        sc.close();
    }
    public static void add(int a , int b)
    {
        int c = a+b;
        System.out.println(c);
    }
    public static void sub(int a , int b)
    {
        int c = a-b;
        System.out.println(c);
    }
    public static void mul(int a, int b)
    {
        int c = a*b;
        System.out.println(c);
    }
    public static void div(int a , int b)
    {
        int c = a/b;
        System.out.println(c);
    }

    
}
