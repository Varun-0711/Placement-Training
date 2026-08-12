import java.util.*;

class Employee {
    int empid;
    String empname;
    double salary;

    Employee(int empid, String empname, double salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }

    void address() {
        System.out.println("123 Main Street, City, Country");
    }
}

public class train4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of employees: ");
    int n = sc.nextInt();
    Employee[] emp = new Employee[n];
    for(int i = 0; i < n; i++) {
        System.out.println("\nEnter details for employee " + (i + 1));
        System.out.print("Employee ID: ");
        int empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Name: ");
        String empname = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        emp[i] = new Employee(empid, empname, salary);
    }
    System.out.println("\nEmployee details:");
    for(int i = 0; i < n; i++) {    
        emp[i].address();
        System.out.println("Employee ID: " + emp[i].empid);
        System.out.println("Employee Name: " + emp[i].empname);
        System.out.println("Salary: " + emp[i].salary);
    }   
}
}