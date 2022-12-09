public class Main {
    private static Employee [] employees = new Employee [10];

    // Нахождение свободной ячейки массива
    public static int indexOfFreeElement(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        throw new RuntimeException("Data cannot be written! The array is full.");
    }
    
    public static void main(String[] args) {

        Employee employeeData  = new Employee("Иван",     "Иванов",  "Иванович", 1, 50_560,  1);
        Employee employeeData1 = new Employee("Алексей",  "Иванов",  "Иванович", 5, 10_500,  1);
        Employee employeeData2 = new Employee("Василий",  "Иванов",  "Иванович", 4, 45_076,  1);
        Employee employeeData3 = new Employee("Максим",   "Иванов",  "Иванович", 3, 67_123,  1);
        Employee employeeData4 = new Employee("Эдуард",   "Иванов",  "Иванович", 5, 87_845,  1);
        Employee employeeData5 = new Employee("Мария",    "Иванова", "Ивановны", 1, 160_006, 1);
        Employee employeeData6 = new Employee("Кирилл",   "Иванов",  "Иванович", 2, 56_222,  1);
        Employee employeeData7 = new Employee("Анастасия","Иванова", "Ивановны", 4, 76_444,  1);
        Employee employeeData8 = new Employee("Ксения",   "Иванова", "Ивановны", 5, 70_805, 1);

        employees[indexOfFreeElement(employees)] = employeeData;
        employees[indexOfFreeElement(employees)] = employeeData1;
        employees[indexOfFreeElement(employees)] = employeeData2;
        employees[indexOfFreeElement(employees)] = employeeData3;
        employees[indexOfFreeElement(employees)] = employeeData4;
        employees[indexOfFreeElement(employees)] = employeeData5;
        employees[indexOfFreeElement(employees)] = employeeData6;
        employees[indexOfFreeElement(employees)] = employeeData7;
        employees[indexOfFreeElement(employees)] = employeeData8;
        System.out.println();

        // Вывод всех данных сотрудников на консоль
        Employee.employeeDataList(employees);

        // Вывод суммы зарплаты всех сотрудников
        EmployeeSalary.printSumOfAllEmployeeSalaries(employees);

        // Вывод среднего значения зарплаты сотрудников
        EmployeeSalary.printAverageSumOfAllEmployeesSalaries(employees);

        // Вывод сотрудника с наименьшей оплатой
        EmployeeSalary.printEmployeeDetailsWithMinSalary(employees);

        // Вывод сотрудника с наибольшей оплатой
        EmployeeSalary.printEmployeeDetailsWithMaxSalary(employees);

        // Вывод Ф.И.О всех сотрудников
        Employee.printFirsNameLastNameEmployees(employees, null);

        // Вывод Ф.И.О сотрудников отдела
        Employee.printFirsNameLastNameEmployees(employees, 4);

        // Индексация зарплаты всех сотрудников
        EmployeeSalary.indexSalaryEmployees(employees, 1, null);

        // Индексация зарплаты отдела
        EmployeeSalary.indexSalaryEmployees(employees, 1, 2);

        // Вывод сотрудника с наименьшей заработной платой из отдела
        EmployeeSalary.minDepartmentEmployeeSalary(employees, 5);

        // Вывод сотрудника с наибольшей заработной платой из отдела
        EmployeeSalary.maxDepartmentEmployeeSalary(employees, 2);

        // Вывод суммы зп отдела
        EmployeeSalary.printSumDepartmentEmployeeSalary(employees, 5);

        // Вывод всех сотрудников с зарплатой меньше числа
        EmployeeSalary.employeesWithLessSalaries(employees, 80000);

        // Вывод всех сотрудников с зарплатой больше числа
        EmployeeSalary.employeesWithHigherSalaries(employees, 70000);
    }
}