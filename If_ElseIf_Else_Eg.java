import java.util.Scanner;

class If_ElseIf_Else_Eg {
    public static void main(String[] args) {
        System.out.println("Enter Your Account Balance :");
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        if (balance >100000) System.out.println("Trip to Thailand");
        else if (balance > 50000) System.out.println("Trip to Himalays");
        else if (balance>30000) System.out.println("Trip to Kerala");
        else if (balance>20000) System.out.println("Trip to Vizag");
        else System.out.println("Sit at home Silently and watch Brathuku Jatka Bandi");
        sc.close();
    
    }
}