class Karyawan {

  int id;
  String nama;
  float gaji;

  void insertData(int i, String n, float g) {
    id = i;
    nama = n;
    gaji = g;
  }

  void tampilData() {
    System.out.println(id+" "+nama+" "+gaji);
  }

}

public class TestKaryawan {

  public static void main(String[] args) {

    Karyawan k1 = new Karyawan();
    Karyawan k2 = new Karyawan();

    k1.insertData(111, "Darmaji", 300000);
    k2.insertData(222, "Darmanto", 400000);

    k1.tampilData();
    k2.tampilData();

  }

}

/*
print out:
111 Darmaji 300000.0
222 Darmanto 400000.0
*/
