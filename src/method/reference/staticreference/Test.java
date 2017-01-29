package method.reference.staticreference;

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

    //Lambda Expression Way
    employeeList.forEach(e -> printEmployee(e));

    //Static Method Reference Way
    employeeList.forEach(Test::printEmployee);

    //Lambda Expression Way
    Supplier<Employee> employeeSupplier = () -> createUser();
    System.out.println(employeeSupplier);

    //Static Method Reference Way
    Supplier<Employee> employee = Test::createUser;
    System.out.println(employee.get());
  }

  //Static Method With Void Return Type
  public static void printEmployee(Employee employee) {
    System.out.println(employee.getName());
  }

  //Static Method With Return Type
  public static Employee createUser() {
    Employee employee = new Employee(10, "Ten");
    return employee;
  }

}
