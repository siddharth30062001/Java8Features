package employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        
        List<Employee> elist=new ArrayList<>();
        elist.add(new Employee(101, "Rahul", "Engineering", 70000));
        elist.add(new Employee(102, "Amit", "HR", 70000));
        elist.add(new Employee(103, "Sumit", "HR", 30000));
        elist.add(new Employee(104, "John", "Engineering", 90000));
        elist.add(new Employee(105, "Jack", "Engineering", 80000));

        List<Employee> list1=
            elist.stream().filter(p->p.getDepartment()
            .equals("Engineering") && p.getSalary()>=80000)
            .collect(Collectors.toList());

            System.out.println("List of Employee: "+list1);

        System.out.println("*******************");

        List<Employee> list2=
            elist.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
            .collect(Collectors.toList());

            System.out.println("List of Employee on the basis of salary: "+list2);
        
        System.out.println("*******************"); 

        Map<String,List<Employee> > list3=
            elist.stream().collect(Collectors.groupingBy(Employee::getDepartment));
            System.out.println("Employee on the basis of Department: "+list3); 

        System.out.println("*******************");
            
        Map<String,Double> list4=
            elist.stream().collect(Collectors.groupingBy(Employee::getDepartment ,Collectors.averagingDouble(Employee::getSalary)));
            System.out.println("Average of each Deapartment: "+list4);



    }
    
}
