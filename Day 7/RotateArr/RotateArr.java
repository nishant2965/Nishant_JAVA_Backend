

public class RotateArr {

    public static int[] rotate(int[] arr, int x){

        int n = arr.length;
        int k = 0;
        
        for(int i = 0; i<x; i++){
            k = arr[n-1];
            for(int j = n-2; j>=0; j--){
                arr[j+1] = arr[j];
            }
            arr[0] = k;
        }
        return arr;
    }
    public static void printArr(int[] arr){

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};
        printArr(rotate(arr, 2));

    }
    
}
