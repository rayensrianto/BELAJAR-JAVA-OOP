class Binatang {
  void makan() {
    System.out.println("sedang makan nyam nyam ...");
  }
}

class Kucing extends Binatang{
  Kucing() {
    System.out.println("ini kucing");
  }

  void meong() {
    System.out.println("meoong meoong");
  }
}

class Sapi extends Binatang{
  Sapi() {
    System.out.println("ini sapi");
  }

  void moo() {
    System.out.println("moooo...");
  }
}

public class Contoh {
  public static void main(String[] args) {
    Kucing obj1 = new Kucing();
    obj1.makan();
    obj1.meong();

    Sapi obj2 = new Sapi();
    obj2.makan();
    obj2.moo();
  }
}
