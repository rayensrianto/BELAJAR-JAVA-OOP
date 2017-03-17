//Memanggil default constructor dari parameter constructor

class A {
  A() {
    System.out.println("Hello A");
  }

  A(int x) {
    this();
    System.out.println(x);
  }
}

class Contoh {
  public static void main(String[] args) {
    A obj = new A(10);

  }
}
