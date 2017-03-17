class Penghitung {

  //int hitung = 0;
  static int hitung = 0;

  Penghitung() {
    hitung++;
    System.out.println(hitung);
  }

  public static void main(String[] args) {
    Penghitung obj1 = new Penghitung();
    Penghitung obj2 = new Penghitung();
    Penghitung obj3 = new Penghitung();
  }

}
