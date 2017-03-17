class Alamat {
  String kota, provinsi, negara;

  public Alamat(String kota, String provinsi, String negara) {
    this.kota = kota;
    this.provinsi = provinsi;
    this.negara = negara;
  }
}

public class Pegawai {
  int id;
  String nama;
  Alamat alamat;

  public Pegawai(int id, String nama, Alamat alamat) {
    this.id = id;
    this.nama = nama;
    this.alamat = alamat;
  }

  void tampil() {
    System.out.println(id+" "+nama);
    System.out.println(alamat.kota+" "+alamat.provinsi+" "+alamat.negara);
  }

  public static void main(String[] args) {
    Alamat alamat1 = new Alamat("Semarang", "Jawa Tengah", "Indonesia");
    Alamat alamat2 = new Alamat("Surabaya", "Jawa Timur", "Indonesia");

    Pegawai pegawai1 = new Pegawai(111, "Naruto", alamat1);
    Pegawai pegawai2 = new Pegawai(222, "Sasuke", alamat2);

    pegawai1.tampil();
    pegawai2.tampil();

  }
}
