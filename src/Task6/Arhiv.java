package Task6;

import java.util.ArrayList;

public class Arhiv extends Main{
    ArrayList<Student> Students;
    ArrayList<Employee> Employees;

    int a;

    Arhiv(){
        // ArrayList<Integer> ad = new ArrayList<Integer>();
        Students  = new ArrayList<Student>();
        Employees = new ArrayList<Employee>();

    }

    public void addStudent (Student s1){
        Students.add(s1);

        Student s2  = new Student("das",1.2) ;// создание Student s2  и инициализация объекта new Student("das",1.2)
        Student s3 = new Student("Grisha",3.4);
        Student s4 = new Student("Potap",5.0);
        Student s5 = new Student("Masha",3.1);
        System.out.println(s2);
        System.out.println(s1);

    }
    public void addEmployees (Employee e1){
        Employees.add(e1);
    }
    Employee e2 = new Employee("biology","Grisha",3);
    Employee e3 = new Employee("philosophy","Plato", 7);

    public void ShowStudents (){
        System.out.println(Students);
    }
    public  void ShowEmployess (){
        System.out.println(Employees);
    }
}
