abstract class BaseEmployee{
    String Name;
    int Salary;
    BaseEmployee(String name, int salary){
        this.Name = name;
        this.Salary = salary;
    }
    String getName(){
        return Name;
    }
    int getSalary(){
        return Salary;
    }
    void setName(String name){
        this.Name = name;
    }
    void setSalary(int salary){
        this.Salary = salary;
    }
    abstract void bonus_calculation();
    void display(){
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee Salary: " + Salary);
    }
}
class Developer extends BaseEmployee{
    String stack;
    Developer(String name, int salary, String stack){
        super(name, salary);
        this.stack = stack;
    }
    @Override
    void bonus_calculation(){
        System.out.println("Bonus calculation for developer: " + (Salary * 0.1));
    }
    @Override
    void display(){
        super.display();
        System.out.println("Developer Stack: " + stack);
    }
}

class Manager extends BaseEmployee{
    String department;
    Manager(String name, int salary, String department){
        super(name, salary);
        this.department = department;
    }
    @Override
    void bonus_calculation(){
        System.out.println("Bonus calculation for manager: " + (Salary * 0.2));
    }
    @Override
    void display(){
        super.display();
        System.out.println("Manager Department: " + department);
    }
}



public class gettersetter {
    public static void main(String[] args) {
        Developer dev = new Developer("John Doe", 50000, "Java");
        dev.display();
        dev.bonus_calculation();

        System.out.println();

        Manager mgr = new Manager("Jane Smith", 80000, "Sales");
        mgr.display();
        mgr.bonus_calculation();
    }
}
