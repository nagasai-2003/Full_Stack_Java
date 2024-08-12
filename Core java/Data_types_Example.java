import java.util.Arrays;

public class Data_types_Example {

    public static void main(String[] args) {
        // Primitive Data Types

        // Byte - 8 bit and its range is -128 to 127
        byte b = 127;
        System.out.println("Byte Value: "+b);

        // Short - 16 bit and its range is -32768 to 32767
        short s = 32767;
        System.out.println("Short Value: "+s);

        // Int - 32 bit and its range is -2147483648 to 2147483647
        int i = 2147483647;
        System.out.println("Int Value: "+i);

        // Long - 64 bit and its range is -9223372036854775808 to 9223372036854775807
        long l = 9223372036854775807L;
        System.out.println("Long Value: "+l);

        // Float - 32 bit
        float f = 3.14f;
        System.out.println("Float Value: "+f);

        // Double - 64 bit
        double d = 3.14;
        System.out.println("Double Value: "+d);

        // Char - 16 bit
        char c = 'a';
        System.out.println("Char Value: "+c);

        // Boolean - 1 bit
        boolean bool = true;
        System.out.println("Boolean Value: "+bool);

        // Non-Primitive Data Types
        // String
        String str = "Naga Sai";
        System.out.println("String Value: "+str);
        
        // Arrays 
        int arr[] = {1,2,3,4,5};
        System.out.println("Array Value: "+Arrays.toString(arr));

        // Class Object
        nenu obj = new nenu("Naga Sai", "Guntur");
        System.out.println("Class Object: "+obj.na_peru+" "+obj.Na_vooru);

    }

}
class nenu{
    String na_peru;
    String Na_vooru;

    nenu(String na_peru, String Na_vooru){
        this.na_peru = na_peru;
        this.Na_vooru = Na_vooru;
    }
}