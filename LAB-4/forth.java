class Person {
    private String name;
    private int age;
    private long phoneNumber;
    private String address;
    private double salary;

    Person(String name, int age, long phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Person {
    private String specialization;

    Employee(String name, int age, long phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSalary();
    }
}

class Manager extends Person {
    private String department;

    Manager(String name, int age, long phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    void printManagerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        printSalary();
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, 1234567890, "1234 Main St", 75000, "Software Engineer");
        Manager manager = new Manager("Jane Doe", 40, 9876543210, "5678 Elm St", 100000, "IT");

        System.out.println("Employee Details:");
        employee.printEmployeeDetails();
        System.out.println();

        System.out.println("Manager Details:");
        manager.printManagerDetails();
    }
}
