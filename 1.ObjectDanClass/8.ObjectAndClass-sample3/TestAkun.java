class Akun {

  int noAkun;
  String nama;
  float jumlah;

  void insertData(int no, String nm, float jml) {
    noAkun = no;
    nama = nm;
    jumlah = jml;
  }

  void simpanUang(float jml) {
    jumlah = jumlah + jml;
    System.out.println(jml+" tersimpan");
  }

  void ambilUang(float jml) {
    if(jumlah < jml) {
      System.out.println("Saldo tidak cukup");
    } else {
      jumlah = jumlah - jml;
      System.out.println(jml + " diambil");
    }
  }

  void cekSaldo() {
    System.out.println("Saldo : "+jumlah);
  }

  void tampilAkun() {
    System.out.println(noAkun+" "+nama+" "+jumlah);
  }

}

public class TestAkun {
  public static void main(String[] args) {
    Akun darmaji = new Akun();
    darmaji.insertData(101, "Darmaji", 1000000);
    darmaji.tampilAkun();
    darmaji.cekSaldo();
    darmaji.simpanUang(50000);
    darmaji.cekSaldo();
    darmaji.ambilUang(125000);
    darmaji.cekSaldo();
  }
}
