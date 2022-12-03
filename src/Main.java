public class Main {
    public static Employee [] employees = new Employee [10];

    public static void main(String[] args) {

        Employee employeeData = new Employee("Иван", "Иванов", "Иванович", 1, 50_560, 1);
        Employee employeeData1 = new Employee("Алексей", "Иванов", "Иванович", 2, 21_345, 1);
        Employee employeeData2 = new Employee("Василий", "Иванов", "Иванович", 4, 45_076, 1);
        Employee employeeData3 = new Employee("Максим", "Иванов", "Иванович", 3, 67_123, 1);
        Employee employeeData4 = new Employee("Эдуард", "Иванов", "Иванович", 5, 87_845, 1);
        Employee employeeData5 = new Employee("Мария", "Иванова", "Ивановны", 1, 142_006, 1);
        Employee employeeData6 = new Employee("Кирилл", "Иванов", "Иванович", 2, 56_222, 1);
        Employee employeeData7 = new Employee("Анастасия", "Иванова", "Ивановны", 4, 76_444, 1);
        Employee employeeData8 = new Employee("Ксения", "Иванова", "Ивановны", 5, 701_805, 1);

        employees[Employee.indexOfFreeElement(employees)] = employeeData;
        employees[Employee.indexOfFreeElement(employees)] = employeeData1;
        employees[Employee.indexOfFreeElement(employees)] = employeeData2;
        employees[Employee.indexOfFreeElement(employees)] = employeeData3;
        employees[Employee.indexOfFreeElement(employees)] = employeeData4;
        employees[Employee.indexOfFreeElement(employees)] = employeeData5;
        employees[Employee.indexOfFreeElement(employees)] = employeeData6;
        employees[Employee.indexOfFreeElement(employees)] = employeeData7;
        employees[Employee.indexOfFreeElement(employees)] = employeeData8;
        System.out.println();

        // Вывод всех данных сотрудников на консоль
        Employee.employeeDataList(employees);

        // Вывод суммы зарплаты всех сотрудников
        Employee.printSumOfAllEmployeeSalaries(employees);

        // Вывод среднего значения зарплаты сотрудников
        Employee.printAverageSumOfAllEmployeesSalaries(employees);

        // Вывод сотрудника с наименьшей оплатой
        Employee.printEmployeeDetailsWithMinSalary(employees);

        // Вывод сотрудника с наибольшей оплатой
        Employee.printEmployeeDetailsWithMaxSalary(employees);

        // Вывод Ф.И.О всех сотрудников
        Employee.printFirsNameLastNameEmployees(employees, null);

        // Вывод Ф.И.О сотрудников отдела
        Employee.printFirsNameLastNameEmployees(employees, 4);

        // Индексация зарплаты всех сотрудников
        Employee.indexSalaryEmployees(employees, 10, null);

        // Индексация зарплаты отдела
        Employee.indexSalaryEmployees(employees, 10, 2);

        // Вывод сотрудника с наименьшей заработной платой из отдела
        Employee.minDepartmentEmployeeSalary(employees, 5);

        // Вывод сотрудника с наибольшей заработной платой из отдела
        Employee.maxDepartmentEmployeeSalary(employees, 2);

        // Вывод суммы зп отдела
        Employee.printSumDepartmentEmployeeSalary(employees, 5);



    }
}