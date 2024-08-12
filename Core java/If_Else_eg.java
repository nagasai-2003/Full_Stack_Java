import java.util.Scanner;

public class If_Else_eg {
    public static void main(String[] args) {
        Scanner dj = new Scanner(System.in);
        System.out.println("Enter a Number between 1 and 10:");
        int num = dj.nextInt();
        if ( num >=1 && num <=10) {
            System.out.println("Success");
        }
        else {
            System.out.println("Failed");
        }
        dj.close();

        // Even odd Checker
        if(num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}