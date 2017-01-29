package method.reference;

import java.util.ArrayList;
import java.util.List;

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

public class MethodReferenceTest {


  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(1, "one"));
    employees.add(new Employee(2, "two"));
    employees.add(new Employee(3, "three"));
    employees.add(new Employee(4, "four"));
    employees.add(new Employee(5, "five"));

    //employees.forEach(e -> System.out.println(e));
    //employees.forEach(MethodReferenceTest::staticPrintEmployee);
    employees.forEach(new MethodReferenceTest()::instancePrintEmployee);

  }

  public static void staticPrintEmployee(Employee employee) {
    System.out.println(employee.getName());
  }

  public void instancePrintEmployee(Employee employee) {
    System.out.println(employee.getName());
  }


}
