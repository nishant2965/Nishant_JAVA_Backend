public class MergeSort {

    public static void conq(int[] arr, int si, int mid, int ei){

        int [] narr = new int[ei-si+1];
        int i1 = si;
        int i2 = mid + 1;
        int x = 0;
        while(i1 <= mid && i2 <= ei){
            if(arr[i1] <= arr[i2]){
                narr[x++] = arr[i1++];
            }
            else{
                narr[x++] = arr[i2++];
            }
        }

        while(i1 <= mid){
            narr[x++] = arr[i1++];
        }
        while(i2<= ei){
            narr[x++] = arr[i2++];
        }

        for(int i = 0 , j = si; i< narr.length; i++, j++){
            arr[j] = narr[i];
        }

    }

    public static void divide( int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conq(arr, si, mid, ei);


    }

    public static void main(String[] args){


       int [] arr = {61,12,83,4,35,46,77};
       divide(arr, 0, 6);
       for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
       }



    }
    
}
