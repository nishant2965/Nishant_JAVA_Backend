public class FizzBuzz {
    
    
    public static void check(int n){

        if (n %3 == 0 && n%5 ==0){
            System.out.println("FizzBuzz");
        }
        else if(n%3 == 0){
            System.out.println("Fizz");
        }
        else if(n%5 == 0){
            System.out.println("buzz");
        }
        else{
            System.out.println(n);
        }

    }

    public static void main(String[] args){

        int n = 100;

        for(int i = 1; i <= n; i++){
            check(i);
        }


    }
}
