class Test {
  public int counter = 0;

  public Test() {
    counter += 1;
  }

  public int getCounter() {
    return counter;
  }

  public void addCounter() {
    counter += 1;
  }

}

public class Main {
  public static void main(String[] args) {
    Test obj1 = new Test();
    Test obj2 = new Test();
    Test obj3 = new Test();

    obj1.addCounter();
    System.out.println("Counter milik obj1 = "+obj1.getCounter());
    System.out.println("Counter milik obj2 = "+obj2.getCounter());
    System.out.println("Counter milik obj3 = "+obj3.getCounter());
  }
}
/*
output:
Counter milik obj1 = 2
Counter milik obj2 = 1
Counter milik obj3 = 1

*/
