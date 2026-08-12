import java.util.*;

class Employee {
    int empid;
    String empname;
    double salary;

    void address(int empid, String empname, double salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class train3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();

            System.out.println("\nEnter details for employee " + (i + 1));
            System.out.print("Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name: ");
            String empname = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            emp[i].address(empid, empname, salary);
        }

        System.out.println("\nEmployee details:");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
    }
}
