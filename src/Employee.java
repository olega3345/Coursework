import org.w3c.dom.css.Counter;
public class Employee {
    private String FIO;
    private int Department;
    private float Salary;
    private static int id;

    public Employee(int id, String FIO, int Department, float Salary) {
        super();
        this.FIO = FIO;
        this.Department = Department;
        this.Salary = Salary;
        id++;

    }
    public String getFIO() {
        return FIO;
    }
    public float getSalary() {
        return Salary;
    }
    public int getDepartment() {
        return Department;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        Department = department;
    }
    public void setSalary(float salary) {
        Salary = salary;
    }
    @Override
    public String toString() {
        return "ФИО: " + FIO + " Отдел: " + Department + " Зарплата: " + Salary;
    }
}






