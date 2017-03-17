//Kadang penamaan variable dan parameter itu mirip/hampir sama, jadi keyword ini buat membedakan ke dua nya.

class Murid {
  int id;
  String nama;

  Murid(int id, String nama) {
    this.id = id;
    this.nama = nama;
  }

  void tampil() {
    System.out.println(id+" "+nama);
  }

}

public class TestMurid {
  public static void main(String[] args) {
    Murid obj1 = new Murid(111, "Naruto");
    Murid obj2 = new Murid(222, "Sakura");

    obj1.tampil();
    obj2.tampil();
  }
}
