class Murid {

  int id;
  String name;
  static String namaSekolah = "Akademi Ninja";

  Murid(int i, String n) {
    id = i;
    name = n;
  }

  void tampil() {
    System.out.println(id+" "+name+" "+namaSekolah);
  }

  public static void main(String[] args) {
    Murid obj1 = new Murid(111, "Naruto");
    Murid obj2 = new Murid(222, "Sasuke");
    obj1.tampil();
    obj2.tampil();
  }

}
