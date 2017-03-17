class Murid {

  int id;
  String name;

  void insertData(int i, String n) {
    id = i;
    name = n;
  }

  void tampilkanData() {
    System.out.println(id+" "+name);
  }

}


public class Aplikasi {

  public static void main(String[] args) {

    Murid SMP = new Murid();
    SMP.insertData(123, "Naruto");
    SMP.tampilkanData();

  }

}
