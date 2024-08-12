class EncapExample{
    private String name;
    private int age;

    // Setter Method or Setattr method
    public void Setter(String nameu, int ageu ){
        name = nameu;
        age = ageu;
    }

    // Getter Method or Getattr Method
    public void Getter(){
        System.out.println(name+" is "+age+" years Young");
    }

}
class Encapuslation_Example2 {
    public static void main(String[] args) {
        EncapExample obj = new EncapExample();
        obj.Getter();
        obj.Setter("Naga Sai", 10000);
        obj.Getter();
    }
}