// import java.io.BufferedReader;
// import java.io.FileReader;
import java.io.*;
// import java.util.Scanner;
// import java.util.Collection;
import java.util.*;

class Student implements Comparable<Student> {

    private String fName;
    private String lName;
    private double gpa;

    public Student (String fName, String lName, double gpa){
        this.fName = fName;
        this.lName = lName;
        this.gpa = gpa;
    }

    public String getFname(){
        return fName;
    }
    public String getLname(){
        return lName;
    }
    public double getGpa(){
        return gpa;
    }

    public int compareTo(Student other){
        return lName.compareTo(other.getLname());
    }

    public String toString(){
        return fName + " " + lName + " " + gpa;
    }

}

public class CsvL {

    public static void main(String [] args) throws Exception{

        String line;

        BufferedReader br = new BufferedReader(new FileReader("data.csv"));

        br.readLine();
        List<Student> students = new ArrayList<>();

        while((line = br.readLine()) != null){
            String[] data = line.split(",");
            String fName = data[0];
            String lName = data[1];
            double gpa = Double.parseDouble(data[2]);


            Student student = new Student(fName, lName, gpa);
            students.add(student);

        }

        Collections.sort(students);
        for(Student student : students){
            System.out.println(student);

        }



    }
    
}
