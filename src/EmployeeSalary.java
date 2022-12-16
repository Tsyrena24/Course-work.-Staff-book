public class EmployeeSalary {

    // Сумма всех зарплат сотрудников
    public static double sumOfAllEmployeeSalaries (Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                sum += employees[i].getSalaryEmployee();
            }
        }
        return sum;
    }

    // Мин зарплата из сотрудников
    public static double minSalaryEmployee (Employee[] employees) {
        double minSalary = employees[0].getSalaryEmployee();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalaryEmployee() > minSalary) {
                    minSalary = employees[i].getSalaryEmployee();

                }

            }
        }
        return minSalary;

    }

    // Макс зарплата из сотрудников
    public static double maxSalaryEmployee (Employee[] employees) {
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

    // Индекс сотрудника с мин зарплатой
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

    // Индекс сотрудника с макс зарплатой
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

    // Вывод Всех сотрудников с зарплатой меньше числа
    public static void employeesWithLessSalaries(Employee[] employees, double salaryComparison) {
        System.out.println("Сотрудники имеющие заработную плату меньше " + salaryComparison + " рублей");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalaryEmployee() < salaryComparison) {
                System.out.println("Ф.И.О сотрудника: "  + employees[i].getNameEmployee() + " " + employees[i].getSurnameEmployee() + " " + employees[i].getPatronymicEmployee() + "; отдел №" + employees[i].getDepartmentEmployee() + "; id-" + (i+1) + "; заработная плата - " + employees[i].getSalaryEmployee() + " рублей." );
            }
        }
        System.out.println();
    }

    // Вывод Всех сотрудников с зарплатой больше числа
    public static void employeesWithHigherSalaries (Employee[] employees, double salaryComparison) {
        System.out.println("Сотрудники имеющие заработную плату больше " + salaryComparison + " рублей");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalaryEmployee() >= salaryComparison) {
                System.out.println("Ф.И.О сотрудника: "  + employees[i].getNameEmployee() + " " + employees[i].getSurnameEmployee() + " " + employees[i].getPatronymicEmployee() + "; отдел №" + employees[i].getDepartmentEmployee() + "; id-" + (i+1) + "; заработная плата - " + employees[i].getSalaryEmployee() + " рублей." );
            }
        }
        System.out.println();
    }

    // Средняя зарплата
    public static double averageSumOfAllEmployeesSalaries(Employee[] employees) {
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

    // Индексация зарплаты всех сотрудников/отдела
    public static void indexSalaryEmployees (Employee[] employees, double indexSalary, Integer department) {
        System.out.print("Индексация заработной платы на "+ indexSalary + "%");
        double hg;
        if (department == null) {
            System.out.println();
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    hg = employees[i].getSalaryEmployee() + (employees[i].getSalaryEmployee() * indexSalary / 100);
                    employees[i].setSalaryEmployee(hg);
                    System.out.println(employees[i].getNameEmployee() + " " + employees[i].getSurnameEmployee() + " " + employees[i].getPatronymicEmployee() + " —— " + employees[i].getSalaryEmployee() + " рублей.");
                }
            }
        }
        else {
            System.out.println(" по отделу №"+ department);
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartmentEmployee() == department) {
                    hg = employees[i].getSalaryEmployee() + (employees[i].getSalaryEmployee() * indexSalary / 100);
                    employees[i].setSalaryEmployee(hg);
                    System.out.println(employees[i].getNameEmployee() + " " + employees[i].getSurnameEmployee() + " " + employees[i].getPatronymicEmployee() + " —— " + employees[i].getSalaryEmployee() + " рублей.");
                }

            }
        }
        System.out.println();
    }

    //Вывод сотрудника с наименьшей заработной платой из отдела
    public static void minDepartmentEmployeeSalary (Employee[] employees, int department) {
        double minSalary = EmployeeSalary.minSalaryEmployee(employees);
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartmentEmployee() == department) {
                if (employees[i].getSalaryEmployee() < minSalary) {
                    minSalary = employees[i].getSalaryEmployee();
                    index = i;
                }
            }
        }
        System.out.println(employees[index].getNameEmployee() + " " + employees[index].getSurnameEmployee() + " " + employees[index].getPatronymicEmployee() + " имеет наименьшую зарплату по отделу №" + department + " в размере " + minSalary + " рублей.");
        System.out.println();
    }

    //Вывод сотрудника с наибольшей заработной платой из отдела
    public static void maxDepartmentEmployeeSalary (Employee[] employees, int department) {
        double maxSalary = EmployeeSalary.maxSalaryEmployee(employees);
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartmentEmployee() == department) {
                if (employees[i].getSalaryEmployee() > maxSalary) {
                    maxSalary = employees[i].getSalaryEmployee();
                    index = i;
                }
            }
        }
        System.out.println(employees[index].getNameEmployee() + " " + employees[index].getSurnameEmployee() + " " + employees[index].getPatronymicEmployee() + " имеет наибольшую зарплату по отделу №" + department + " в размере " + maxSalary + " рублей.");
        System.out.println();
    }

    // Сумма зарплаты отдела
    public static double sumDepartmentEmployeeSalary (Employee[] employees, int department) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartmentEmployee() == department) {
                sum += employees[i].getSalaryEmployee();
            }
        }
        return sum;
    }

    //==================================================================================================================

    // Вывод суммы всех зарплат сотрудников
    public static void printSumOfAllEmployeeSalaries(Employee[] employees) {
        System.out.println("Сумма затрат на зарплаты в месяц: " + EmployeeSalary.sumOfAllEmployeeSalaries(employees) + " рублей.");
        System.out.println();
    }

    // Вывод сотрудника с мин зарплатой
    public static void printEmployeeDetailsWithMinSalary(Employee[] employees) {
        System.out.println("Cотрудник " + employees[IndexOfMinSalaryOfEmployees(employees)].getNameEmployee() + " " + employees[IndexOfMinSalaryOfEmployees(employees)].getSurnameEmployee() + " " + employees[IndexOfMinSalaryOfEmployees(employees)].getPatronymicEmployee() + " имеет наименьшую оплату в фирме в размере - " + employees[IndexOfMinSalaryOfEmployees(employees)].getSalaryEmployee() + " рублей.");
        System.out.println();
    }

    // Вывод сотрудника с макс зарплатой
    public static void printEmployeeDetailsWithMaxSalary(Employee[] employees) {
        System.out.println("Cотрудник " + employees[IndexOfMaxSalaryOfEmployees(employees)].getNameEmployee() + " " + employees[IndexOfMaxSalaryOfEmployees(employees)].getSurnameEmployee() + " " + employees[IndexOfMaxSalaryOfEmployees(employees)].getPatronymicEmployee() + " имеет наибольшую оплату в фирме в размере - " + employees[IndexOfMaxSalaryOfEmployees(employees)].getSalaryEmployee() + " рублей.");
        System.out.println();
    }

    //Вывод средней зарплаты
    public static void printAverageSumOfAllEmployeesSalaries(Employee[] employees) {
        System.out.println("Среднее значение зарплат - " + averageSumOfAllEmployeesSalaries(employees) + " рублей.");
        System.out.println();
    }

    // Вывод суммы зп отдела
    public static void printSumDepartmentEmployeeSalary(Employee[] employees, int department) {
        System.out.println("Сумма заработной платы отдела №" + department + " составляет " + sumDepartmentEmployeeSalary(employees, department) + " рублей.");
        System.out.println();
    }



}
