import java.util.stream.IntStream;

public class Employee {
    //Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника.
    // Отделы для простоты должны быть названы от 1 до 5.
    private final String fullName;
    private int Department;
    private int salary;

    //Добавить статическую переменную-счетчик, которая будет отвечать за id.
    private final int id;
    private static int counter = 0;


    //Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return Department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    //Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
    public void setDepartment(int department) {
        Department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
    //По умолчанию все поля должны передавать через конструктор(кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        Department = department;
        this.salary = salary;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", Department=" + Department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}

