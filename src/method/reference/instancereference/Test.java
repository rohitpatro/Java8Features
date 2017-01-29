package method.reference.instancereference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class Employee {
  private int id;
  private String name;

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}

public class Test {
  public static void main(String[] args) {
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee(1, "one"));
    employeeList.add(new Employee(2, "two"));
    employeeList.add(new Employee(3, "three"));
    employeeList.add(new Employee(4, "four"));
    employeeList.add(new Employee(5, "five"));

    Test test = new Test();

    // Lambda Expression Way
    employeeList.forEach(employee -> test.printEmployee(employee));

    // Instance Method Reference Way
    employeeList.forEach(test::printEmployee);

    // Lambda Expression Way
    Supplier<Employee> employeeSupplier1 = () -> test.createUser();
    System.out.println(employeeSupplier1.get());

    // Instance Method Reference Way
    Supplier<Employee> employeeSupplier2 = test::createUser;
    System.out.println(employeeSupplier2.get());

  }

  // Static Method With Void Return Type
  public void printEmployee(Employee employee) {
    System.out.println(employee.getName());
  }

  // Static Method With Return Type
  public Employee createUser() {
    Employee employee = new Employee(10, "Ten");
    return employee;
  }

}
