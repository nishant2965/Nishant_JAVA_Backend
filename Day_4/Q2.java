class Parent{
    private int pVar;

    public Parent(int pvar){
        this.pVar = pVar;
    }
    Parent(){}
    

}

class Child extends Parent{
    private int cVar;

    // Child(){};
    public Child (int pVar, int cVar){

        super(pVar);
        this.cVar = cVar;

    }

    public Child (int cVar){
        // super(0);
        this.cVar = cVar;

    }

}
public class Q2 {

    public static void main(String []args){

        Parent p1 = new Parent(10);
        Child c1 = new Child (10, 20);
        Child c2 = new Child (20);

        // System.out.println("Only parent is initialized  and the value is " + p1.pVar);
        // System.out.println("child is initialized  and the value is " + p1.pVar + "and" + c1.cVar);
        // System.out.println("child is initialized  using overloading and value is " + c2.cVar);

        // For the above we will have to create getter which will help us show the values.
        

    }
    
}
