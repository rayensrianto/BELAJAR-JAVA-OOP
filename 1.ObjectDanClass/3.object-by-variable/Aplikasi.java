class Murid {

  int id;
  String name;

}

class Aplikasi {

  public static void main(String[] args) {

    Murid SMA = new Murid();
    SMA.id = 1012;
    SMA.name = "Darmaji";
    System.out.println("ID : "+SMA.id);
    System.out.println("Name :"+SMA.name);

  }

}

/*
print:

ID : 1012
Name :Darmaji
*/
