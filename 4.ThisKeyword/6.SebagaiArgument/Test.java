class Test {
  void m(Test obj) {
    System.out.println("method terpanggil");
  }

  void p() {
    m(this);
  }

  public static void main(String[] args) {
    Test objek = new Test();
    objek.p();
  }
}
