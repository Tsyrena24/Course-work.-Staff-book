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

    //
    public static int indexOfFreeElement(Employee[] employees) {                            // Нахождение свободной ячейки массива
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        throw new RuntimeException("Data cannot be written! The array is full.");
    }

    public static void employeeDataList(Employee[] employees) {                             // Вывод на консоль всех данных сотрудника
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
             System.out.println(employees[i] + " ");
            }
        } System.out.println();
    }
    public static double sumOfAllEmployeeSalaries (Employee[] employees) {                  // Сумма всех зарплат сотрудников
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                sum += employees[i].getSalaryEmployee();
            }
        }
        return sum;
    }

    public static void printSumOfAllEmployeeSalaries(Employee[] employees) {                // Вывод суммы всех зарплат сотрудников
        System.out.println("Сумма затрат на зарплаты в месяц: " + Employee.sumOfAllEmployeeSalaries(employees) + " рублей.");
        System.out.println();
    }

    public static double minSalaryEmployee (Employee[] employees, double minSalary) {                         // Мин зарплата из сотрудников
        double min = 900000000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalaryEmployee() < minSalary) {
                    minSalary = employees[i].getSalaryEmployee();
                }
            }
        }
        return minSalary;

    }

    public static int IndexOfMinSalaryOfEmployees(Employee[] employees) {
        int count = 0;
        int index = 0;
        for (; count < employees.length; ) {
            if (employees[count] != null) {
                break;
            }
            count++;
        }
        double min = employees[count].getSalaryEmployee();
        for (count++; count < employees.length; count++) {
            if (employees[count] != null && min >  employees[count].getSalaryEmployee()) {
                min = employees[count].getSalaryEmployee();
                index = count;
            }
        }
        return index;
        }

    public static void printEmployeeDetailsWithMinSalary(Employee[] employees) {            // Вывод сотрудника с мин зарплатойй
        System.out.println("Cотрудник " + employees[IndexOfMinSalaryOfEmployees(employees)].getNameEmployee() + " " + employees[IndexOfMinSalaryOfEmployees(employees)].getSurnameEmployee() + " " + employees[IndexOfMinSalaryOfEmployees(employees)].getPatronymicEmployee() + " имеет наименьшую оплату в фирме в размере - " + employees[IndexOfMinSalaryOfEmployees(employees)].getSalaryEmployee() + " рублей.");
        System.out.println();
    }


    public static double maxSalaryEmployee (Employee[] employees) {                         // Макс зарплата из сотрудников
        double maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalaryEmployee() > maxSalary) {
                    maxSalary = employees[i].getSalaryEmployee();
                }
            }
        }
        return maxSalary;
    }

    public static int IndexOfMaxSalaryOfEmployees(Employee[] employees) {
        int count = 0;
        int index = 0;
        for (; count < employees.length; ) {
            if (employees[count] != null) {
                break;
            }
            count++;
        }
        double max = employees[count].getSalaryEmployee();
        for (count++; count < employees.length; count++) {
            if (employees[count] != null && max <  employees[count].getSalaryEmployee()) {
                max = employees[count].getSalaryEmployee();
                index = count;
            }
        }
        return index;
    }

    public static void printEmployeeDetailsWithMaxSalary(Employee[] employees) {               // Вывод сотрудника с макс зарплатойй
        System.out.println("Cотрудник " + employees[IndexOfMaxSalaryOfEmployees(employees)].getNameEmployee() + " " + employees[IndexOfMaxSalaryOfEmployees(employees)].getSurnameEmployee() + " " + employees[IndexOfMaxSalaryOfEmployees(employees)].getPatronymicEmployee() + " имеет наибольшую оплату в фирме в размере - " + employees[IndexOfMaxSalaryOfEmployees(employees)].getSalaryEmployee() + " рублей.");
        System.out.println();
    }


    public static double averageSumOfAllEmployeesSalaries(Employee[] employees) {              // Средняя зарплата
        int cell = 0;
        double average;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                cell += 1;
            }
        }
        average = sumOfAllEmployeeSalaries(employees) / cell;
        return average;
    }

    public static void printAverageSumOfAllEmployeesSalaries(Employee[] employees) {           // Вывод средней зарплаты
        System.out.println("Среднее значение зарплат - " + averageSumOfAllEmployeesSalaries(employees) + " рублей.");
        System.out.println();
    }

    public static void printFirsNameLastNameEmployees (Employee[] employees, Integer department) {                  // Ф.И.О всех сотрудников/по отделу
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


    public static void indexSalaryEmployees (Employee[] employees, double indexSalary, Integer department) {        // Индексация зарплаты всех сотрудников/отдела
        System.out.print("Индексация заработной платы на "+ indexSalary + "%");
        double hg;
        if (department == null) {
            System.out.println();
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    hg = employees[i].getSalaryEmployee() + (employees[i].getSalaryEmployee() * indexSalary / 100);
                    employees[i].setSalaryEmployee(hg);
                    System.out.println(employees[i].getNameEmployee() + " " + employees[i].getSurnameEmployee() + " " + employees[i].getPatronymicEmployee() + " —— " + employees[i].getSalaryEmployee() + " рублей");
                }
            }
        }
        else {
            System.out.println(" по отделу №"+ department);
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartmentEmployee() == department) {
                    hg = employees[i].getSalaryEmployee() + (employees[i].getSalaryEmployee() * indexSalary / 100);
                    employees[i].setSalaryEmployee(hg);
                    System.out.println(employees[i].getNameEmployee() + " " + employees[i].getSurnameEmployee() + " " + employees[i].getPatronymicEmployee() + " —— " + employees[i].getSalaryEmployee() + " рублей");
                }

            }
        }
        System.out.println();
    }

    public static void minDepartmentEmployeeSalary (Employee[] employees, int department) {    //Вывод сотрудника с наименьшей заработной платой из отдела
        double minSalary = 900000000;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartmentEmployee() == department) {
                if (employees[i].getSalaryEmployee() < minSalary) {
                    minSalary = employees[i].getSalaryEmployee();
                    index = i;
                }
            }
        }
        System.out.println(employees[index].getNameEmployee() + " " + employees[index].getSurnameEmployee() + " " + employees[index].getPatronymicEmployee() + " имеет наименьшую зарплату по отделу №" + department + " в размере " + minSalary);
        System.out.println();
    }

    public static void maxDepartmentEmployeeSalary (Employee[] employees, int department) {     //Вывод сотрудника с наибольшей заработной платой из отдела
        double maxSalary = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartmentEmployee() == department) {
                if (employees[i].getSalaryEmployee() > maxSalary) {
                    maxSalary = employees[i].getSalaryEmployee();
                    index = i;
                }
            }
        }
        System.out.println(employees[index].getNameEmployee() + " " + employees[index].getSurnameEmployee() + " " + employees[index].getPatronymicEmployee() + " имеет наибольшую зарплату по отделу №" + department + " в размере " + maxSalary);
        System.out.println();
    }

    public static double sumDepartmentEmployeeSalary (Employee[] employees, int department) {     // Сумма зарплаты отдела
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartmentEmployee() == department) {
                sum += employees[i].getSalaryEmployee();
            }
        }
        return sum;
    }

    public static void printSumDepartmentEmployeeSalary(Employee[] employees, int department) {    // Вывод суммы зп отдела
        System.out.println("Сумма заработной платы отдела №" + department + " составляет " + sumDepartmentEmployeeSalary(employees, department) + " рублей.");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Ф.И.О сотрудника: " + nameEmployee + " " + surnameEmployee + " " + patronymicEmployee + "; отдел №" + departmentEmployee + "; заработная плата: " + salaryEmployee + "; личное ID - " + counter++;
 }
}


