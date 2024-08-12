public class Loops_eg {
    public static void main(String[] args) {
        int i;
        // For Loop
        for(i = 1; i<=10; i++){
            System.out.println("Hello World"+i);
        }
        System.out.println("I Value is:"+i);

        int count = 0;
        // While Loop
        while(i>=1){
            System.out.println("Count = "+count);
            count++;
            System.out.println("i>1:"+i);
            i--;
        }

        System.out.println("I Value is:"+i);

        i = 0;
        // Do While Loop
        do { 
            System.out.println("I am IN DO While Loop");
        } while (i>=1);

    }
}