public class Student{

    public static String Name = "Nishant";



public static String getName(){
    // String name = Name;
    return Name;
}


public static String setName(String name){
    Name = name;
    return Name;
}

public static void main(String[] aggs){

    System.out.println(getName());

    System.out.println(setName("Agrawal"));
    System.out.println(Name);
    

    
}

}