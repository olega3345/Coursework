public class Employee {
    private String fio;
    private int department;
    private float salary;
    private int id;
    private static int counter = 0;
    public Employee(String fio, int Department, float Salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }
    public String getFIO() {
        return fio;
    }
    public float getSalary() {
        return salary;
    }
    public int getDepartment() {
        return department;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
         return "ФИО: " + fio + " Отдел: " + department + " Зарплата: " + salary;
    }
}






