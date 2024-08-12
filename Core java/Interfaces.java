interface Humans{
    void speak();
    void lives();
    void eats();
}

class Indian implements Humans{
    public void speak(){
        System.out.println("I Speak Telugu");
    }

    public void lives(){
        System.out.println("I Live in Guntur");
    }

    public void eats(){
        System.out.println("I eat Annam");
    }
}

class Chinese implements Humans{
    public void speak(){
        System.out.println("Chinese");
    }

    public void lives(){
        System.out.println("China");
    }

    public void eats(){
        System.out.println("Noodles");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // Indian Class
        Indian djsai = new Indian();
        System.out.println("Accessing Indian Class with djsai object");
        djsai.speak();
        djsai.lives();
        djsai.eats();

        // Chinese Class
        Chinese Xi_jinping = new Chinese();
        System.out.println("Accessing Indian Class with Xi_jinping object");
        Xi_jinping.speak();
        Xi_jinping.lives();
        Xi_jinping.eats();
    }
}