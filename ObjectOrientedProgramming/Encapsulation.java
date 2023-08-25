package ObjectOrientedProgramming;

class Employee{
    public String name;
    public int age;
    private int salary;
    public String Designation;

   //Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }
    public String getDesignation(){
        return Designation;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setDesignation(String Designation){
        this.Designation = Designation;
    }



}
public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
       e.setName("Md.Zahid Hasan Juel");
       e.setAge(25);
       e.setDesignation("SQA Engineer");
       e.setSalary(80);

        System.out.println("<---- Employee Information ----->");
        System.out.println("Employee name: "+e.getName());
        System.out.println("Employee Age: "+e.getAge());
        System.out.println("Employee Designation: "+e.getDesignation());
        System.out.println("Employee name: "+e.getSalary()+"$");

    }
}
