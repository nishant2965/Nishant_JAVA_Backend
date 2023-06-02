
class Parent {
    public void printMessage() {
        System.out.println("This is the parent class.");
    }
}


class Child extends Parent {
    @Override
    public void printMessage() {
        System.out.println("This is the child class.");
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.printMessage();  
        child.printMessage();   


        Parent polymorphicReference = new Child();
        polymorphicReference.printMessage();  
    }
}
