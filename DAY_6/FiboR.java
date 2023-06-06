public class FiboR {

    public static void nextNumber(int a, int b, int n){

        if(n == 0){
            return;
        }
        
        System.out.print((a+b) + " ");
        nextNumber(b, a+b, n-1);
        
        

        
    }

    public static void main(String[] args){

        int n = 10;
        int a = 0;
        int b = 1;
        int k = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        nextNumber(a, b, n-2); 


    }
    
}
