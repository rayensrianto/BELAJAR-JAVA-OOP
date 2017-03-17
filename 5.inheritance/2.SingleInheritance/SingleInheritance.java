class Binatang {
  void makan() {
    System.out.println("sedang makan..");
  }
}

class Kucing extends Binatang {
  Kucing() {
    System.out.println("Ini kucing");
  }
  void ngomong() {
    System.out.println("meooong");
  }
}

class SingleInheritance {
  public static void main(String[] args) {
    Kucing morganisa = new Kucing();
    morganisa.makan();
    morganisa.ngomong();
  }
}
