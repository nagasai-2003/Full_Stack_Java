
class Constructor {
    public Constructor() {
        System.out.println("Constructor is called");
    }

    Constructor(String name) {
        System.out.println(name+" you Have Called the Constructor");
}
}

public class Constructor_Eg {
    public static void main(String[] args) {
        Constructor obj = new Constructor("Naga Sai");  
    }
}