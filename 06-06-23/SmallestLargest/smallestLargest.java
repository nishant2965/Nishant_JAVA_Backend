
public class smallestLargest {

    public static int smallest(int[] arr){

        int a = arr[0];

        for (int i = 0; i<arr.length; i++){

            if(arr[i] < a){
                a = arr[i];
            }    
        }
        return a;

    }

    public static int largest(int[] arr){
        int a = arr[1];

        for (int i = 0; i<arr.length; i++){
            if(arr[i] > a){
                a = arr[i];
            }    
        }
        return a;

    }

    public static void main(String [] args){

        int [] arr = {1,2,4,7,8,23,5,9};
        System.out.println(smallest(arr)); 
        System.out.println(largest(arr));

    }
    
}
