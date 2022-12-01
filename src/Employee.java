public class Employee {
    String nameEmployee;
    String surnameEmployee;
    String patronymicEmployee;
    int departmentEmployee;
    double salaryEmployee;
    static int counter = 1;
    int id = counter;

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

    //

    public static void employeeDataList(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
             System.out.println(employees[i] + " ");
            }
        }
    }
    public static double sumOfAllEmployeeSalaries (Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                sum += employees[i].getSalaryEmployee();
            }
        }
        return sum;
    }

    public static void minSalaryEmployee (Employee[] employees) {
        double minSalary = 900000000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalaryEmployee() < minSalary) {
                    minSalary = employees[i].getSalaryEmployee();
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalaryEmployee() ==  minSalary) {
                    System.out.println("Минимальная зарплата у сотрудника: " + employees[i].getNameEmployee() + " " + employees[i].getSurnameEmployee() + " " + employees[i].getPatronymicEmployee() + " из отдела №" + employees[i].getDepartmentEmployee() + " - " + minSalary + " рублей");
                }
            }
        }
    }

    public static void maxSalaryEmployee (Employee[] employees) {
        double maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalaryEmployee() > maxSalary) {
                    maxSalary = employees[i].getSalaryEmployee();
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary == employees[i].getSalaryEmployee()) {
                    System.out.println("Максимальная зарплата у сотрудника: " + employees[i].getNameEmployee() + " " + employees[i].getSurnameEmployee() + " " + employees[i].getPatronymicEmployee() + " из отдела №" + employees[i].getDepartmentEmployee() + " - " + maxSalary + " рублей");
                }
            }
        }
    }

    public static void averageSumOfAllEmployeesSalaries(Employee[] employees) {
        int cell = 0;
        double average;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                cell += 1;
            }
        }
        average = sumOfAllEmployeeSalaries(employees) / cell;
        System.out.println("Среднее значение зарплат - " + average + " рублей");
    }

    public static void firsNameLastNameEmployees (Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("Ф.И.О сотрудника №" + (i + 1) + " " + employees[i].getNameEmployee() + " " + employees[i].getSurnameEmployee() + " " + employees[i].getPatronymicEmployee());
            }
        }
    }


    @Override
    public String toString() {
        return "Ф.И.О сотрудника: " + nameEmployee + " " + surnameEmployee + " " + patronymicEmployee + "; номер отдела: " + departmentEmployee + "; зарплата: " + salaryEmployee + "; id - " + id;
 }
}


