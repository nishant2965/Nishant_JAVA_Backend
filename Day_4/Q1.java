interface Animal{
    void walk();

}

interface Herbivore{
    void eats();
}

class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("It walks");
    }
    public void eats(){
        System.out.println("It eats");
    }
}

public class Q1 {

    public static void main(String args[]){

        Horse h1 = new Horse();
        h1.walk();
        h1.eats();

    }

    
}
