
class Hello1{
    public void display(){
        System.out.println("Hello from Hello 1");
    }
    @Deprecated
    public void old_Method(){
        System.out.println("Hello from old Method");
    }
    public void new_Method(){
        System.out.println("Hello from new Method");
    }
}

class Hello2 extends Hello1{
    @Override
    public void display(){
        System.out.println("Hello from Hello 2");
    }
}

@Deprecated
class Old_Class{
    public void display(){
        System.out.println("Hello from Old Class");
    }
}
public class Annotation_Example {
    public static void main(String[] args) {
        Hello1 obj = new Hello1();
        obj.display();
        Hello2 obj2 = new Hello2();
        obj.display();
        obj.old_Method();
        obj.new_Method();
        Old_Class obj3 = new Old_Class();
        obj3.display();
        
    }
    
}