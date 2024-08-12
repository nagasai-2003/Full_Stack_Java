class A{
    void A1(){
        System.out.println("I am A1");
    }
    void A2(){
        System.out.println("I am A2");
    }
}
class B extends A{
    public void B1(){
        System.out.println("I am B1");
    }
    // Overriding
    void A1(){
        System.out.println("I am A1 from B1");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        B objB = new B();
        // Accessing B
        objB.B1();
        objB.A1();
        objB.A2();

    }
}