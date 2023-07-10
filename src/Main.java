public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee( "Иванов Иван Иванович", 1, 30000.12f);
        employees[1] = new Employee("Жогина Полина Олеговна", 2, 100000.41f);
        employees[2] = new Employee("Кунникова Анна Максимовна", 3, 30000.76f);
        employees[3] = new Employee("Бердникова Елизавета Алексеевна", 4, 50000.24f);
        employees[4] = new Employee("Опарина Мария Витальевна", 5, 70000.42f);
        employees[5] = new Employee("Красильников Александр Андреевич", 1, 40000.77f);
        employees[6] = new Employee("Любимов Никита Андреевич", 2, 35000.98f);
        employees[7] = new Employee("Гевак Михаил Евгеньевич", 3, 57000.90f);
        employees[8] = new Employee("Павлова Екатерина Анатольевна", 4, 25000.97f);
        employees[9] = new Employee("Смирнова Маргарита Николаевна", 5, 35000.87f);

        printAll();

        System.out.println("Сумма зарплат: " + getSalarySum());

        Employee EmployeeWithMinSalary = getEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary());

        Employee EmployeeWitchMaxSalary = getEmployeeWitchMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWitchMaxSalary());

        System.out.println("Средняя зарплата сотрудника: " + getAverageSalary());

        printFIO();


    }
    // список всех сотрудников
    private static void printAll() {
        for (Employee employee : employees)
            System.out.println(employee);
    }
    // сумма затрат на зарплаты в месяц
    private static float getSalarySum() {
        float sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    // сотрудник с минимальной зарплатой
    private static Employee getEmployeeWithMinSalary() {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (minEmployee == null || minEmployee.getSalary() > employee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }
    // сотрудник с максимальной зарплатой
    private static Employee getEmployeeWitchMaxSalary() {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (maxEmployee == null || maxEmployee.getSalary() < employee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }
    // средняя зарплата
    private static float getAverageSalary() {
        float averageSalary = getSalarySum() / employees.length;
        return averageSalary;
    }
    // ФИО всех сотруднриков
    private static void printFIO() {
        for (Employee employee : employees)
             System.out.println(employee.getFIO());
    }
}




