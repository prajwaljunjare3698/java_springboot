package Practice;
class X
{
	static int i = 1111;
   static{
       i = i-- - --i;    //L1
       System.out.println(i);
   }
   {
       i = i++ + ++i;    //L2
       System.out.println(i);
   }
}
class Y extends X{
	   static{
	       i = --i - i--;    //L3
	       System.out.println(i);
	   }
	   {
	       i = ++i + i++;    //L4
	       System.out.println(i);
	   }
	}

public class main1{
   public static void main(String[] args){
       Y y = new Y();
       System.out.println(y.i);    //L5
   }
}