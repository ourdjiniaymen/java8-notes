package utils;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int yearOfJoining;

    public Employee(int id, String name, String department, double salary, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }
}
