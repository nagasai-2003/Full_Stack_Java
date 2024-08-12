class Method_Overload{
    // having the same method name but different method signature
    // Method Signature
    // access_modifier + Return_Type + Method_Name + Parameteres
    // public int add(int a, int b)
    public int add(int a, int b){
        return a+b;
    }
    // Overloaded Method
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

}
public class Method_Overloading {
    public static void main(String[] args) {
        Method_Overload obj = new Method_Overload();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10,20,70));
        System.out.println(obj.add(16.854, 18.19243));
        
    }
    
}