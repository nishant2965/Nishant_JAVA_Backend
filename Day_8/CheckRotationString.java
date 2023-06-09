

public class CheckRotationString {

    public static boolean check(String s, String s1){

        if(s.length() != s1.length()){
            return false;
        }

        String s2 = s+s;

        return s2.contains(s1);

    }

    public static void main(String[] args){

        String s = "CheckforThis";
        String s1 = "ThisCheckforThis";
        String s3 = "ThisCheckfor";

        System.out.println(check(s, s1));
        System.out.println(check(s, s3)); 
        

        

    }
    
}
