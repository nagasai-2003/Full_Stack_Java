class final1{
    final void display(){
        System.out.println("I am a Final Method from final1");
    }
}
final class final2 extends final1{
    // void display(){ Cannot Override a Final Method
    //     System.out.println("I am a Final Method");
    // }
}

// class final3 extends final2{ Cannot Extend a Final Class
//     // void display(){ Cannot Override a Final Method
//     //     System.out.println("I am a Final Method");
//     // }
// }

public class Final_Example {
    public static void main(String[] args) {
        final double pi = 3.14;
        System.out.println(pi);
        double radius = 5.0;
        double area = pi * radius * radius;
        System.out.println(area);
        final1 obj = new final1();
        obj.display();
        final2 obj1 = new final2();
        obj1.display();
        
    }
    
}