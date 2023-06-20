import java.util.*;
public class Student {

    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstname(){
        return firstName;
    }
    public String getLastname(){
        return lastName;
    }
    public double getGpa(){
        return gpa;
    }

    public void setFirstname(String firstName){
        this.firstName = firstName;
    }
    public void setLastname(String lastName){
        this.lastName = lastName;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public String toString(){
        return "{" + firstName + ", " + lastName + ", " + gpa + "}";
    }


    public static void main(String [] args){
        double sum = 0;

        ArrayList<Student> s = new ArrayList<>();

        s.add(new Student("Nishant", "Agrawal", 3.9));
        s.add(new Student("Abc", "Def", 2.3));
        s.add(new Student("GHI", "JKL", 3.4));
        s.add(new Student("MNO", "PQR", 3.6));
        s.add(new Student("STU", "VWX", 3.1));

        for(Student a : s){
            System.out.println(a);
            sum += a.getGpa();
        }

        double avg = sum / s.size();

        // System.out.println(avg);
        Iterator<Student> itr = s.iterator();
        while(itr.hasNext()){
            Student student = itr.next();
            if(student.getGpa() < avg){
                itr.remove();
            }
        }

        System.out.println(s);

    }
    
}
