class Persegi {

  int panjang;
  int lebar;

  void insertData(int p, int l) {
    panjang = p;
    lebar = l;
  }

  void luasPersegi() {
    System.out.println(panjang*lebar);
  }

}

public class TestPersegi {
  public static void main(String[] args) {

    Persegi kotak1 = new Persegi();
    Persegi kotak2 = new Persegi();
    kotak1.insertData(5,5);
    kotak2.insertData(7,7);

    kotak1.luasPersegi();
    kotak2.luasPersegi();

  }
}
