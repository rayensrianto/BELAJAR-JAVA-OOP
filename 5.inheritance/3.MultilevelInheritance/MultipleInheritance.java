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

class AnakKucing extends Kucing {
  AnakKucing() {
    System.out.println("Anak kucing");
  }
  void menangis() {
    System.out.println("meong hiks hiks meong...");
  }
}

class MultipleInheritance {
  public static void main(String[] args) {
    AnakKucing morganisa = new AnakKucing();
    morganisa.makan();
    morganisa.ngomong();
    morganisa.menangis();
  }
}
