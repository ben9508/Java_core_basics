public class Employee {
    /* Available to all child classes */
    public String name;

    /* Accessible only by the Employee class */
    private double salary;

    /* Name variable is assigned in the constructor */
    public Employee (String empName) {
        name = empName;
    }

    /* Salary variable is assigned a value */
    public void setSalary(double empSal) {
        salary = empSal;
    }

    /* This method prints employee details */
    public void printEmp() {
        System.out.println("name : " + name);
        System.out.println("salary : " + salary);
    }


    public static void main(String args[]) {
        Employee empOne = new Employee("Ben");
        empOne.setSalary(10000);
        empOne.printEmp();
    }
}
