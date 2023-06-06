public class Fibo {

//withot recursion.
    public static void main(String[] args){

        int n = 10;
        int a = 0;
        int b = 1;
        int k = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 0; i<n-2 ; i++){
            k = a+b;
            System.out.print(k + " ");
            a = b;
            b= k;
        }

    }
    
}
