class This_example{
    String name = "Mama Bro";
    int age = 120;
    String Place = "Eluru";
    void Get_Detials(String name, int age, String Place){
        this.name = name;
        this.age = age;
        this.Place = Place;
    }

    void Print_Detials(){
        System.out.println(name+" is from "+Place+" and is "+age+" Years Young");
    }
}
public class This_Example {
    public static void main(String[] args) {
        This_example obj = new This_example();
        obj.Get_Detials("Naga Sai",10000,"Guntur");
        obj.Print_Detials();
    }
    
}