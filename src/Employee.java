public class Employee {
    private String fio;
    private int Department;
    private float Salary;
    private int id;
    private static int counter = 0;
    public Employee(){
        this.id = counter++;
    }
    public Employee(String fio, int Department, float Salary) {
        this.fio = fio;
        this.Department = Department;
        this.Salary = Salary;
        this.id = counter++;

    }
    public String getFIO() {
        return fio;
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
        return "ФИО: " + fio + " Отдел: " + Department + " Зарплата: " + Salary;
    }
}





