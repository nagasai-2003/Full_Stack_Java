import java.util.Arrays;

class Array_Rotations {
    static void left_rotate(int[] arr,int n){
    n = n%arr.length;
    while(n-- >0){//System.out.println(Arrays.toString(arr));
    // Step -1 
    int last = arr[arr.length-1];
    // Step - 2
    for(int i = arr.length-1; i>0; i-- ){
        arr[i] = arr[i-1];
    }
    // System.err.println(Arrays.toString(arr));
    //Step - 3
    arr[0] = last;
    System.err.println(Arrays.toString(arr));}
    }

    
    public static void main(String[] args) {
        int[] arr = {8,4,5,1,7,3,2,4};
        System.err.println(Arrays.toString(arr));
        left_rotate(arr,9);
    }
}