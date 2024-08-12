
class Methods{
    // Method Without Parameters and Without Return Type
     void hello(){
         System.out.println("This is the Method Without Parameters and Without Return Type");;
     }
 
     // Method With Parameters and Without Return Type
     void hello2(String name){
         System.out.println("Hello "+name);
     }
 
     // Method Without Parameters and With Return Type
     String hello3(){
         return "This is the Method Without Parameters and With Return Type";
     }
 
     // Method With Parameters and With Return Type
     String hello4(String name){
         return name +" is Very Good Person";
     }
 
 }
 class Method_Types {
     public static void main(String[] args) {
         int a = 10;
         int b = 20;
         System.out.println(a+b);
         Methods obj = new Methods();
         obj.hello();
         obj.hello2("Naga Sai");
         System.out.println(obj.hello3());
         String name = "Naga Sai";
         String msg = obj.hello4(name);
         System.out.println(msg);
         msg = msg +" and Good Student";
         System.out.println(msg);
     }
 }