public class ReverseArray {

    public static int[] reverse(int[] arr){
        int k = arr.length;
        for(int i = 0; i<k/2; i++){
            int a = arr[(k-1) - i];
            arr[(k-1) - i] = arr[i];
            arr[i] = a;
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
        printArr(reverse(arr));

    }
    
}
