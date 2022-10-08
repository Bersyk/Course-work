public class Main {
    //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    public static void conclusionAll() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    //Посчитать сумму затрат на зарплаты в месяц.
    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum+=employee.getSalary();
            }
        }
        return sum;
    }

    //Найти сотрудника с максимальной зарплатой.
    public static Employee getEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    //Найти сотрудника с минимальной зарплатой.
    public static Employee getEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    //Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    public static double calculateAverageSalary() {
        int average = calculateSumSalary() / employees.length;
        System.out.println(average);
        return average;
    }

    //Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static void printEmployeesNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    //Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
        private static final Employee[] employees = new Employee[10];
        public static void main (String[]args){
            employees[0] = new Employee("Иванов Иван Иванович", 2, 100_000);
            employees[1] = new Employee("Закусило Петр Петрович", 3, 40_000);
            employees[2] = new Employee("Коитусов Виктор Аркадьевич", 5, 50_000);
            employees[3] = new Employee("Пришельцев Малдер Иванович", 2, 150_000);
            employees[4] = new Employee("Хилый Костя Андреевич", 3, 30_000);
            employees[5] = new Employee("Ким Эдвуард Викторович", 4, 127_000);
            employees[6] = new Employee("Подкастер Орк Чемоданович", 1, 40_000);
            employees[7] = new Employee("Анохин Николай ЛМРович", 4, 45_000);
            employees[8] = new Employee("Клинкова Маления Микеловна", 5, 53_000);
            employees[9] = new Employee("Ордов Гарош Аркадьевич", 2, 67_000);
            System.out.println("Вывод всех данных о сотрудниках: ");
            System.out.println(" ");
            conclusionAll();
            System.out.println(" ");
            System.out.println("Cумма затрат на зарплаты в месяц: " + calculateSumSalary());
            System.out.println(" ");
            System.out.println("Cотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary());
            System.out.println(" ");
            System.out.println("Cотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary());
            System.out.println();
            System.out.println("Средняя зарплата: " + calculateAverageSalary());
            System.out.println();
            System.out.printf("Cписок Ф.И.О всех сотрудников: ");
            System.out.println();
            printEmployeesNames();
        }
    }