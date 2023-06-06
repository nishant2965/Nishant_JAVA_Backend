// package DAY_6;

public class Age {

    public static String ageD(int age){
        if(age < 13){
            return "kid";
        }
        else if(age >= 13 && age <20){
            return "teen";
        }
        else{
            return "adult";
        }
    }

    public static void main(String [] args){

        int age = 25;
        System.out.println(ageD(age));
        // System.out.println(age);

    }
    
}
