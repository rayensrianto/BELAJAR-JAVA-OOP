class Murid {
  int id;
  String name;

  Murid(int i, String n) {
    id = i;
    name = n;
  }

  void tampil() {
    System.out.println(id+" "+name);
  }

  public static void main(String[] args) {
    Murid obj1 = new Murid(101, "Naruto");
    Murid obj2 = new Murid(102, "Sasuke");
    obj1.tampil();
    obj2.tampil();
  }
}
