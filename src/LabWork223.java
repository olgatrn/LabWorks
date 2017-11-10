class Employee {
    public void calculateSalary(String name, double... salary) {

        double totalSalary = 0;

        for (double x : salary) {
            totalSalary += x;
        }

        System.out.println(name + ": " + totalSalary);
    }
}

public class LabWork223 {
    public static void main(String... args) {
        Employee employee = new Employee();
        employee.calculateSalary("Tom", 56.78, 98.56, 90.87);
        employee.calculateSalary("Jim", 576.78, 498.56, 790.87, 67.89);
        employee.calculateSalary("X");
    }
}
