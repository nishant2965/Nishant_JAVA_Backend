

public class ExceptionHandler {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);  // Simulating division by zero
            System.out.println("Result: " + result);
        }  catch (Exception e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }

    public static int divideNumbers(int n, int d) throws Exception{
        try{
            return n / d;
        }catch(Exception e){
             throw new CustomException("null");

        }
       
    }
}