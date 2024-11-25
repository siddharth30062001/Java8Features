package employee;

public class Employee {

    int id;
    String name;
    String department;
    double salary;

    Employee(int id,String name,String department,double salary){

        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public int getId(){
        return id;

    }

    public String getName(){
        return name;
        
    }

    public String getDepartment(){
        return department;
        
    }

    public double getSalary(){
        return salary;
        
    }

    public String toString(){
        return " Id: "+id + " Name: "+name+" Department: "+department+" Salary: "+salary;
    }
}