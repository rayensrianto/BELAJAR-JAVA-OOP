class A {
  void helloM() {
    System.out.println("Hello m");
  }

  void helloN() {
    System.out.println("Hello n");
    this.helloM();
    //helloM(); <-- hasil nya sama dengan this.helloM();
  }
}

class Contoh {
  public static void main(String[] args) {
    A obj = new A();
    obj.helloN();
  }
}
