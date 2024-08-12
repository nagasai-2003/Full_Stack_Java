
import java.util.Scanner;

public class Prime_Num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        boolean flag = true;
        int num = sc.nextInt();
        if (num == 0 || num == 1){
            System.out.println("Not Prime");
            flag = false;
        }
        else if(num>2){
            for(int i = 2; i<num/2+1; i++){
                if(num%i == 0){
                    flag = false;
                    System.out.println("Not Prime");
                    break;
                }
            }
        }
        if(flag == true) System.out.println("Prime");

    }
    
}