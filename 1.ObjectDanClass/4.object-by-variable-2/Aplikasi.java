class Murid {

  int id;
  String name;

}

class Aplikasi {

  public static void main(String[] args) {

    Murid SMA = new Murid();
    Murid SMP = new Murid();
    SMA.id = 1012;
    SMA.name = "Darmaji";
    System.out.println("Anak SMA");
    System.out.println("ID : "+SMA.id);
    System.out.println("Name :"+SMA.name);

    SMP.id = 1013;
    SMP.name = "Darmanto";
    System.out.println("Anak SMP");
    System.out.println("ID : "+SMP.id);
    System.out.println("Name :"+SMP.name);


  }

}

/*
print:

ID : 1012
Name :Darmaji
*/
