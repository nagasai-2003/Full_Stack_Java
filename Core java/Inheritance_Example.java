class A{
    int A_var = 100;
    void A_Method(){
        System.out.println("I am Method From A");
    }
}
// extends Keyword
// Single Inheritance
class B extends A{
    int B_var = 150;
    void B_Method(){
        System.out.println("I am Method From B");
    }
}

// Multi level Inheritance
class C extends B{
    int C_var = 200;
    void C_Method(){
        System.out.println("I am Method From C");
    }
}

class Inheritance_Example {
    public static void main(String[] args) {
        // Object for A Class
        System.out.println("Created Object for A Class");
        A objA = new A();
        System.out.println(objA.A_var);
        objA.A_Method();

        //Object for B Class
        System.out.println("Created Object for B Class");
        B objB = new B();
        System.out.println(objB.B_var);
        objB.B_Method();
        System.out.println("Accessing the A class Methods and Attributes form B Object");
        System.out.println(objB.A_var);
        objB.A_Method();


        //Object for C Class
        System.out.println("Created Object for C Class");
        C objC = new C();
        System.out.println(objC.C_var);
        objC.C_Method();
        System.err.println("Accessing the B class with C Object");
        System.out.println(objC.B_var);
        objC.B_Method();
        System.err.println("Accessing the A class with C Object");
        System.out.println(objC.A_var);
        objC.A_Method();
    }
    
}