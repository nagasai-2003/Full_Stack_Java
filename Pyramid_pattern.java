import java.util.Scanner;
public class Pyramid_pattern {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter No of Rows :");
        int n = sc.nextInt();
        int dots = (n*2)-1;
        for(int i = 1; i<=n; i++){
            int sp = n-i;
            int dot = (i*2)-1;
            for(int j = 0; j<dots; j++){
                if(sp >0){
                    System.out.printf(" ");
                    sp--;
                }
                else if(dot>0){
                    System.out.printf("*");
                    dot--;
                }
                else break;
            }
            System.out.println("");
        }
        
    }
}