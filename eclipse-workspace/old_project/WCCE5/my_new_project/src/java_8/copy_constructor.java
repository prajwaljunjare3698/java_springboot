package java_8;
public class copy_constructor {
    String name;
    int age;
    copy_constructor(){
        this.name = "math";
        this.age = 23;
        System.out.println(name+" "+age);
    }
    //creating copy constructor
    copy_constructor(copy_constructor obj){
        name = obj.name;
        age = obj.age;
        System.out.println(name+" "+age);
    }
    
    public static void main(String args[]){
    	copy_constructor t1 = new copy_constructor();
        //passing obj reg to new obj
    	copy_constructor t3 = new copy_constructor(t1);
        
        //also one way to give another obj values
    	copy_constructor t2 = t1;
        System.out.println(t2.name+" "+t2.age);
    }
}