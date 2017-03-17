class Murid {

  int id;
  String name;

  Murid(int i, String n) {
    id = i;
    name = n;
  }

  Murid(Murid m) {
    id = m.id;
    name = m.name;
  }

  void tampil() {
    System.out.println(id+" "+name);
  }

  public static void main(String[] args) {
    Murid obj1 = new Murid(111, "Naruto");
    Murid obj2 = new Murid(obj1);

    obj1.tampil();
    obj2.tampil();
  }

}
