import java.util.Arrays;

class Searching {
    static int linar_search(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int Binary_Search(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left<=right ){
            int mid = (left+right)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else if(arr[mid]>target){
                right = mid-1;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = {7,33,11,55,34,84,17,35,65,31,68,90};
        System.out.println(linar_search(arr, 69));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Binary_Search(arr, 85));
    }
} {
    
}
