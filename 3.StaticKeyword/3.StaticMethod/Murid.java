class Murid {

  int id;
  String name;
  static String sekolah = "IT";

  static void ubahSekolah() {
    sekolah = "Ninja";
  }

  Murid(int i, String n) {
    id = i;
    name = n;
  }

  void tampil() {
    System.out.println(id+" "+name+" "+sekolah);

  }

  public static void main(String[] args) {
    Murid.ubahSekolah();

    Murid obj1 = new Murid(123, "Naruto");
    Murid obj2 = new Murid(234, "Hinata");
    obj1.tampil();
    obj2.tampil();
  }

}
