class Pegawai {

  String nama;
  int umur;
  String alamat;

  Pegawai(String nama, int umur) {
    this.nama = nama;
    this.umur = umur;
  }

  Pegawai(String nama, int umur, String alamat) {
    this(nama,umur);
    this.alamat = alamat;
  }

  void tampil() {
    System.out.println(nama+" "+umur+" "+alamat);
  }

}

class Contoh {
  public static void main(String[] args) {
    Pegawai obj1 = new Pegawai("Darmaji", 23);
    Pegawai obj2 = new Pegawai("Darmanto", 21, "Solo");

    obj1.tampil();
    obj2.tampil();
  }
}
