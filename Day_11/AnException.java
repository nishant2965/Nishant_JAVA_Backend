
public class AnException{

    public static int convert (String str) {

        try {
            int n = Integer.parseInt(str);
            return n;
        } catch (NumberFormatException e) {
            System.out.println("Exception found" + e);
            return -1;
            // TODO: handle exception
        }
    }
        
        
    public static void main(String [] args){

        System.out.println(convert("123.0f"));
        System.out.println(convert("123"));
        System.out.println(convert("45.67"));
        System.out.println(convert("test"));

    }

}