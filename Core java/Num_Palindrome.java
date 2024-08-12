import java.util.Scanner;
public class Num_Palindrome {
    static boolean is_num_Palindrome(int num){
        int temp = num;
        int check = 0;
        while(temp >0){
            int rem = temp%10;
            check = check*10+rem;
            temp = temp/10;
        }
        if (check == num) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner dj = new Scanner(System.in);
        int num = dj.nextInt();
        System.out.println(is_num_Palindrome(num));
    }
}
