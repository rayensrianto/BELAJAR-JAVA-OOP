## 2. constructors

Constructor adalah method spesial ada yang berguna untuk menginisialisasi object. Kenapa method spesial? Karna method ini langsung berkerja saat object di buat.

### Syarat Constructor
- nama constructor harus sama dengan nama class

### Jenis Constructor
- default constructor (tanpa parameter)
- parameter constructor (ada parameter)

### 1. Default-Contructor
```Java
class BelajarJava {

  BelajarJava() {
    System.out.println("Selamat belajar Java");
  }

  public static void main(String[] args) {
    BelajarJava obj = new BelajarJava();
  }

}
```
- Di atas adalah contoh default constructor.
- Di dalam class BelajarJava terdapat sebuah method constructor yang isi nya mencetak "Selamat belajar Java"
- Maka method tersebut akan otomatis langsung berkerja/terpanggil saat membuat object.
```
output:
Selamat belajar Java
```

### 2. Default-Contructor-default-value
```Java
public class Laptop {
  int nomor;
  String merk;

  void tampil() {
    System.out.println(nomor+" "+merk);
  }

  public static void main(String[] args) {
    Laptop obj1 = new Laptop();
    Laptop obj2 = new Laptop();

    obj1.tampil();
    obj2.tampil();
  }

}
```
```
output:
0 null
0 null
```
- Di atas adalah contoh code yang tidak menggunakan constructor.
- Ini hanya untuk membandingkan dengan contoh 1.Default-Contructor, yatu sama-sama menampilkan default value.

### 3.Parameter-Constructor
```Java
class Murid {
  int id;
  String name;

  Murid(int i, String n) {
    id = i;
    name = n;
  }

  void tampil() {
    System.out.println(id+" "+name);
  }

  public static void main(String[] args) {
    Murid obj1 = new Murid(101, "Naruto");
    Murid obj2 = new Murid(102, "Sasuke");
    obj1.tampil();
    obj2.tampil();
  }
}
```
- Constructor itu termasuk method, jadi ada fitur parameter juga, di atas adalah contoh Constructor yang berparameter.
- Karna constructor akan otomatis berkerja/berjalan saat pembuatan object, maka parameter di masukan saat pembuatan object juga.
- Object obj1 dan Object obj2 adalah contoh cara memasukan parameter ke counstructor.

### 3.Constructor-Overloading
```Java
class Murid {
  int id;
  String name;
  int age;

  Murid(int i, String n) {
    id = i;
    name = n;
  }

  Murid(int i, String n, int a) {
    id = i;
    name = n;
    age = a;
  }

  void tampil() {
    System.out.println(id+" "+name+" "+age);
  }

  public static void main(String[] args) {
    Murid obj1 = new Murid(111, "Naruto");
    Murid obj2 = new Murid(222, "Sakura", 16);
    obj1.tampil();
    obj2.tampil();
  }
}
```
- constructor overloading adalah dimana terdapat lebih dari satu constructor.
- yang membedakan satu constructor dengan constructor lain nya adalah parameter nya.
