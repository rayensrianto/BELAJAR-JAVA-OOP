class Karyawan {
  float gaji = 30000;
}

class Programmer extends Karyawan {
  float bonus = 2500;

  public static void main(String[] args) {
    String garis = "=====================================================";
    Programmer p = new Programmer();
    System.out.println("Gaji programmer: "+p.gaji);
    System.out.println("Bonus programmer: "+p.bonus);
    System.out.println(garis);
  }
}
