import java.util.Scanner;
public class Switch_Case_Eg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Who is the President of India?");
        System.out.printf(" a. Mahatma Gandhi \n b. Narendra Modi \n c. Nelson Mandela \n d. Draupati Murmu \n");
        System.out.println("Choose the correct option:");
        char ans = sc.next().charAt(0);
        switch (ans) {
            case 'a': 
                System.out.println("Wrong Answer"); break;
            case 'b': 
            System.out.println("Wrong Answer"); break;
            case 'c': 
            System.out.println("Wrong Answer"); break;
            case 'd': 
            System.out.println("Correct Answer"); break;
            default:
                System.out.println("Choosi Nokku"); 
        }
        sc.close();
    }
}