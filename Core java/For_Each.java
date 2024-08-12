public class For_Each {
    public static void main(String[] args) {
        System.out.println("For Each For 1D Array");
        int[] arr = {1,2,3,4,5};
        for(int i : arr){
            System.out.println(i);
        }
        System.err.println("For Each and For - For 2D Array");
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] row : arr2 ){
            for(int i = 0; i<row.length; i++){
                System.out.println(row[i]);
            }
        }
        System.err.println("For Each and For Each - For 2D Array");
        for(int[] row : arr2 ){
            for(int val:row){
                System.out.println(val);
            }
        }
        System.err.println("For and For Each - For 2D Array");
        for(int i =0; i<arr2.length; i++){
            for(int val: arr2[i]){
                System.out.println(val);
            }
        }

        System.err.println("For and For  - For 2D Array");
        for(int i =0; i<arr2.length; i++){
            for(int j = 0; j<arr2[0].length; j++){
                System.out.println(arr2[i][j]);
            }
        }
    }

}
 {
    
}
