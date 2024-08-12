// Static Variable
class Product{
    static int CustomerId = 2765;
    Product(){
        CustomerId++;
        System.out.println("Customer Id : "+CustomerId);
    }
}
class security_check{
    static String app_name;
    static double version;
    static boolean app_status;
    static {
        app_name = "DJSAI";
        version = 2.47;
        app_status = true;
        System.out.println("Static Block Executed Before Main Method");
    }
}
// Static Methods
class computer{
    static void access_display(String name){
        System.out.println(name+" is Accessing Display");
    }
    static void access_keyboard(String name){
        System.out.println(name+" is Accessing Keyboard");
    }
    static void access_mouse(String name){
        System.out.println(name+" is Accessing Mouse");
    }
}
public class Static_Example {
    static {
        System.out.println("Static Block Executed Before Main Method");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        // Static Variable
        Product customer1 = new Product();
        Product customer2 = new Product();
        Product customer3 = new Product();
        Product customer4 = new Product();
        Product customer5 = new Product();
        System.out.println(customer5.CustomerId);
        System.out.println(Product.CustomerId);
        
        // Static Methods
        computer.access_display("Naga Sai");
        computer.access_keyboard("Naga Sai");
        computer.access_mouse("Naga Sai");

        // Static Blocks
        System.out.println(security_check.app_name);
        System.out.println(security_check.version);
        System.out.println(security_check.app_status);
    }
}