
interface Executable {
  public void execute();
}

class Runner {
  public void run(Executable e) {
    e.execute();
  }
}

public class Example {

  public static void main(String[] args) {

    Runner runner = new Runner();
    runner.run(() -> {
      System.out.println("good");
      System.out.println("second");
    });
  }
}