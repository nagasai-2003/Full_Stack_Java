import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in Fibonacci series :");
        int input = sc.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int fib;
        if(input <= 1){
            System.out.println("0");
        }
        else if (input == 2){
            System.out.println("0 1");
        }
        else{
            System.out.printf("0 1 ");
            for(int i = 2; i< input; i++){
                fib = fib1+fib2;
                fib1 = fib2;
                fib2 = fib;
                System.out.printf("%d ",fib);
            }
        }
        sc.close();
    }
}