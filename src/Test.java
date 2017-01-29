interface MathOperation {
  int operation(int a, int b);
}

interface TestOperation {
  int operation(int a, int b);
}

public class Test {

  static MathOperation add = (int a, int b) -> a + b;
  static MathOperation sub = (int a, int b) -> a - b;
  static MathOperation mul = (int a, int b) -> a * b;
  static MathOperation div = (int a, int b) -> a / b;

  static TestOperation test = (int a, int b) -> a + b;

  public static void main(String[] args) {

    Test test = new Test();
    System.out.println(test.operate(5, 10, add));
    System.out.println(test.operate(5, 10, sub));
  }

/*  public static long countList() {
    List<String> names = new ArrayList();
    names.add("One");
    names.add("Two");
    names.add("Three");
    names.add("Four");
    names.add("Five");
    names.add("Six");
    names.add("Seven");
    names.add("Eight");
    names.add("Nine");
    names.add("Ten");
    return names.size();
  }*/

  private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);
  }

}
