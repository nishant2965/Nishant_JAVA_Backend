class S{
    static int a;


    public static int getSvar(){
        return a;
    }
    public static int initialize(){
        return 12;
    }
    static{
        a = initialize();
    }
    public static void main(String [] args){

        System.out.println(getSvar());

    }
   
}





public class Q3 {

    public static void main(String [] args){
        // S s = new S();

        System.out.println(S.getSvar());

    }
    
}
