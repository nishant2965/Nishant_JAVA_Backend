
public class FizzBuzzNoMod {

    public static void main(String[] args){
        int a = 0,b=0;

        int n = 100;
        for(int i =1; i<=100; i++){
            a++;
            b++;


            if(a == 3){
                System.out.print("Fizz");
                a = 0;
            }
            if(b == 5){
                System.out.print("Buzz");
                b = 0;
            }
            if(a!= 0 && b!= 0){
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
