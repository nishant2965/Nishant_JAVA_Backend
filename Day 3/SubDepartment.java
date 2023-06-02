
public class SubDepartment extends Department{
    int departmentSize;

   
    public int getDepartmentSize(){
            return this.departmentSize;
    }

    public static void main(String[] args){

        SubDepartment sub = new SubDepartment();
        sub.departmentSize = 15;
        System.out.println(sub.getDepartmentSize());
       

    }
}