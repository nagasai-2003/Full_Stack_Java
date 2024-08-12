public class Break_Continue {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            System.out.println("Hello World"+i);
            if (i == 5){
                break;
            }
        }   
System.out.println();
        // Example of Continue 
        for(int i = 1; i<=10; i++){
            if (i == 5){
                continue;
            }
            System.out.println("Hello World"+i);
        }
    }
}