public class FizzBuzzRec {


    public static void recursion(int a, int i){

        if(i == a+1){
            return;
        }

        if(i % 3 == 0 && i % 5 ==0){
            System.out.println("FizzBuzz");
        }
        else if(i % 3 == 0){
            System.out.println("Fizz");
        }
        else if(i % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(i);
        }
        recursion(a, i+1);
    }
    public static void main(String [] args){

        recursion(100, 1);

    }
    
}
