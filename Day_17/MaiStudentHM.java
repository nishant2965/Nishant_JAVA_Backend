import java.util.HashMap;
import java.util.Map;

public class MaiStudentHM{
    public static void main(String[] args) {
        class Student {
            private String firstName;
            private String lastName;
            private double GPA;

            public Student(String firstName, String lastName, double GPA) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.GPA = GPA;
            }


            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public double getGPA() {
                return GPA;
            }

            public void setGPA(double GPA) {
                this.GPA = GPA;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", GPA=" + GPA +
                        '}';
            }
        }


        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("i", new Student("i", "a", 3.8));
        studentMap.put("j", new Student("j", "b", 3.5));
        studentMap.put("k", new Student("k", "c", 4.0));
        studentMap.put("l", new Student("l", "d", 3.9));
        studentMap.put("m", new Student("m", "e", 3.7));
        studentMap.put("n", new Student("n", "f", 3.6));
        studentMap.put("o", new Student("o", "g", 3.4));
        studentMap.put("p", new Student("p", "h", 3.2));


        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

        }
        System.out.println("for each method");

        studentMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}