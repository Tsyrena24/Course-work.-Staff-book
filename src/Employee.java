import java.util.Objects;

public class Employee {
    private String nameEmployee;
    private String surnameEmployee;
    private String patronymicEmployee;
    private int departmentEmployee;
    private double salaryEmployee;
    private static int counter = 1;
    private int id = counter;

    public Employee(String nameEmployee, String surnameEmployee, String patronymicEmployee, int departmentEmployee, double salaryEmployee, int counter) {
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
        this.patronymicEmployee = patronymicEmployee;
        this.departmentEmployee = departmentEmployee;
        this.salaryEmployee = salaryEmployee;
        this.id = counter;
        counter++;

    }
    public String getNameEmployee() {
        return this.nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getSurnameEmployee() {
        return this.surnameEmployee;
    }

    public void setSurnameEmployee(String surnameEmployee) {
        this.surnameEmployee = surnameEmployee;
    }

    public String getPatronymicEmployee() {
        return this.patronymicEmployee;
    }

    public void setPatronymicEmployee(String patronymicEmployee) {
        this.patronymicEmployee = patronymicEmployee;
    }

    public int getDepartmentEmployee() {
        return this.departmentEmployee;
    }

    public void setDepartmentEmployee(int departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }

    public double getSalaryEmployee() {
        return this.salaryEmployee;
    }

    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }


    // Вывод на консоль всех данных сотрудника
    public static void employeeDataList(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
             System.out.println(employees[i] + " ");
            }
        } System.out.println();
    }

    // Вывод Ф.И.О всех сотрудников/по отделу
    public static void printFirsNameLastNameEmployees (Employee[] employees, Integer department) {
        if (department == null) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    System.out.println("Ф.И.О сотрудника №" + (i + 1) + " " + employees[i].getNameEmployee() + " " + employees[i].getSurnameEmployee() + " " + employees[i].getPatronymicEmployee() + ".");
                }
            }
        }
        else {
            System.out.println("Сотрудники отдела №" + department);
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartmentEmployee() == department) {
                    System.out.println("Ф.И.О сотрудника: "  + employees[i].getNameEmployee() + " " + employees[i].getSurnameEmployee() + " " + employees[i].getPatronymicEmployee() + ".");
                }
            }
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentEmployee == employee.departmentEmployee && Double.compare(employee.salaryEmployee, salaryEmployee) == 0 && id == employee.id && Objects.equals(nameEmployee, employee.nameEmployee) && Objects.equals(surnameEmployee, employee.surnameEmployee) && Objects.equals(patronymicEmployee, employee.patronymicEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameEmployee, surnameEmployee, patronymicEmployee, departmentEmployee, salaryEmployee, id);
    }

    @Override
    public String toString() {
        return "Ф.И.О сотрудника: " + nameEmployee + " " + surnameEmployee + " " + patronymicEmployee + "; отдел №" + departmentEmployee + "; заработная плата: " + salaryEmployee + "; личное ID - " + counter++;
 }
}


