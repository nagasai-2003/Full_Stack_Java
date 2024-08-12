
import java.util.Arrays;
import java.util.Scanner;

class Arrays_Basics {
    public static void main(String[] args) {
        // Arrays - Collection of similar data types
        int[] arr1 = new int[5];
        int[] arr2 = {5,3,2,1,6,7};
        for(int i = 0; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        Scanner sc = new Scanner(System.in);
        // for(int i = 0; i<arr1.length; i++){
        //     arr1[i] = sc.nextInt();
        // }
        System.out.println(Arrays.toString(arr1));

        // 2d arrays

        int[][] arr3 = {{1,2,3,8,9},{4,5,6,2,1},{7,8,9,3,3}};
        int[][] arr4 = new int[3][9];
        System.out.println(Arrays.toString(arr4[0]));
        System.out.println(Arrays.toString(arr4[1]));
        System.out.println(Arrays.toString(arr4[2]));

        // Print 2d array
        for(int row = 0; row<arr3.length; row++){
            for(int col = 0; col<arr3[0].length; col++){
                System.out.printf(" %d ",arr3[row][col]);
            }
            System.out.println("");
        }

        // Copying the arrays
        int[] orig = {6,3,7,1,2,5};
        int[] arr5 = new int[orig.length];
        for(int i = 0; i<orig.length; i++){
            arr5[i] = orig[i];
        } 
        System.out.println("Copied array by Loop" + Arrays.toString(arr5));

        int[] arr6 = new int[orig.length];
        System.arraycopy(orig, 0,arr6, 0,orig.length);
        System.out.println("Copied array by System.arraycopy() "+Arrays.toString(arr6));

        int[] arr7 = Arrays.copyOf(orig, orig.length);
        System.out.println("Copied array by Arrays.copyOf "+Arrays.toString(arr7));
        
        // Sorting an array in java
        int[] unsorted = {6,2,3,1,8,9,4,2,0,1};
        int[] sorted = new int[unsorted.length];
        sorted = Arrays.copyOf(unsorted, unsorted.length);
        System.out.println("Array Before Sorting "+Arrays.toString(sorted));
        Arrays.sort(sorted);
        System.out.println("Array After Sorting "+Arrays.toString(sorted));

    }
}