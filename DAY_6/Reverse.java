public class Reverse {


    public static int reverse(int x){

        int f = 0;
        int y;
        int k;
        if(x == 0){
            return 0;
        }
        while(x>0){

            y = x%10;
            f = f + y;
            f = f*10;
            k = y/10;
            x = x/10;
        }
       
        return f/10;

    }
    public static void main(String [] args){

        
        
        System.out.println(reverse(12345));
        System.out.println(reverse(100));
        System.out.println(reverse(0));

    }
    
}
