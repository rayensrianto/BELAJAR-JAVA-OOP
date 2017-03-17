class Murid {

  int id;
  String name;
  int age;

  Murid(int i, String n) {
    id = i;
    name = n;
  }

  Murid(int i, String n, int a) {
    id = i;
    name = n;
    age = a;
  }

  void tampil() {
    System.out.println(id+" "+name+" "+age);
  }

  public static void main(String[] args) {

    Murid obj1 = new Murid(111, "Naruto");
    Murid obj2 = new Murid(222, "Sakura", 16);
    obj1.tampil();
    obj2.tampil();

  }

}
