//Calling parameterized constructor from default constructor:

class A {

  A() {
    this(5);
    System.out.println("Hello A");
  }

  A(int x) {
    System.out.println(x);
  }

}

class Contoh {
  public static void main(String[] args) {

    A obj = new A();

  }
}
