
import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        // User gives input with that we need to print the square box of dots.
        /*
         *  if input = 5
         *  output =
         *  * * * * *
         *  * * * * *  
         *  * * * * *
         *  * * * * *
         *  * * * * *
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        for(int j = 1; j <= n; j++) // COntrols NO of Rows
        {
            for (int i = 1; i <= n; i++) // Controls NO of Columns
            {
                System.out.printf("* ");
            }
        System.out.println("");
        }

        System.out.println("Right angle Traingle Pattern");
        // Right angle Traingle Pattern
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.printf("* ");
            }
            System.out.println("");
        }

    }
}