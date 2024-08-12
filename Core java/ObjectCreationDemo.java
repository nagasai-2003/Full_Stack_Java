class SkateBoard{
    // Properties or variables or attributes
    String color = "Black";
    String Material = "Wood";
    int num_wheels = 6;
    boolean breaks = true;

    // Methods
    void moving(){
        System.out.printf("SkateBoard is moving with %d wheels \n",num_wheels);
    }
    void breaking(){
        System.out.println("SkateBoard breaking = "+breaks);
    }


}
class ObjectCreationDemo {
    public static void main(String[] args) {

        // Object creation
        SkateBoard s = new SkateBoard();

        // Accessing object properties
        System.out.println("SkateBoard color = "+s.color);
        System.out.println("SkateBoard Material = "+s.Material);
        System.out.println("SkateBoard num_wheels = "+s.num_wheels);
        System.out.println("SkateBoard breaks = "+s.breaks);

        // Accessing object methods
        s.moving();
        s.breaking();
    }
}