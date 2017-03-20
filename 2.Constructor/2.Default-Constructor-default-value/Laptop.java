public class Laptop {
  int nomor;
  String merk;

  void tampil() {
    System.out.println(nomor+" "+merk);
  }

  public static void main(String[] args) {
    Laptop obj1 = new Laptop();
    Laptop obj2 = new Laptop();

    obj1.tampil();
    obj2.tampil();
  }

}
