class Test {
  public static int counter = 0;

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
    System.out.println("Counter milik class = "+Test.counter);
  }
}

/*
OUTPUT:
Counter milik obj1 = 4
Counter milik obj2 = 4
Counter milik obj3 = 4
Counter milik class = 4
*/
