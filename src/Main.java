public class Main {
    public static Employee [] employees = new Employee [10];
    public static int indexOfFreeElement(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        throw new RuntimeException("The book could not be recorded! The array is full.");
    }

    public static void main(String[] args) {

        Employee employeeData = new Employee("Иван", "Иванов", "Иванович", 1, 50_000, 1);
        Employee employeeData1 = new Employee("Алексей", "Иванов", "Иванович", 2, 100_000, 1);
        Employee employeeData2 = new Employee("Василий", "Иванов", "Иванович", 4, 45_000, 1);
        Employee employeeData3 = new Employee("Максим", "Иванов", "Иванович", 3, 67_000, 1);
        Employee employeeData4 = new Employee("Эдуард", "Иванов", "Иванович", 5, 87_000, 1);

        employees[indexOfFreeElement(employees)] = employeeData;
        employees[indexOfFreeElement(employees)] = employeeData1;
        employees[indexOfFreeElement(employees)] = employeeData2;
        employees[indexOfFreeElement(employees)] = employeeData3;
        employees[indexOfFreeElement(employees)] = employeeData4;
        System.out.println();

        Employee.employeeDataList(employees);
        System.out.println();
        //Employee.sumOfAllEmployeeSalaries(employees);
        System.out.println("Сумма затрат на зарплаты в месяц: " + Employee.sumOfAllEmployeeSalaries(employees));
        System.out.println();

        Employee.minSalaryEmployee(employees);
        System.out.println();

        Employee.maxSalaryEmployee(employees);
        System.out.println();

        Employee.averageSumOfAllEmployeesSalaries(employees);
        System.out.println();

        Employee.firsNameLastNameEmployees(employees);



    }
}