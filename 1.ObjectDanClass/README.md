## 1. Object dan Class

### Object

Sebuah entitas yang memiliki state(sifat) dan behavior(perilaku) itu disebut object.
- Entitas (entity) adalah sebuah objek yang keberadaannya dapat dibedakan terhadap objek lain. Contoh: Binatang : KAMBING, SAPI, KUCING. Manusia : MAHASISWA, DOSEN, PEMASOK, PENJUAL.
- state itu bisa di sebut sifat, info atau data. Misal object laptop, laptop ini merk nya Macbook, ini termasuk state.
- behavior itu bisa di sebut perilaku atau kata kerja. Misal object laptop, behavior nya adalah nyala dan mati.

Object adalah sebuah instance dari class. Class adalah template atau blueprint dimana object ini tercipta. Jadi, object adalah hasil dari class.

### Class

Class adalah kumpulan kode-kode yang berupa template dan menjadi sumber daya dari sebuah object. Misal, object pulpen, warna pulpen merah dan kemampuan menulis semua itu di atur, di coding, di buat dengan code-code yang ada di dalam class. :D

Isi class pada Java biasanya antara lain:
- fields
- methods
- constructors
- blocks
- nested class and interface

#### Deklarasi Class

```java

class Nama_Class {
	field;
	method;
}

```
### Instance Variable

Instance variable adalah variable yang ada di dalam class, tapi di luar method. Instance variable tidak membutuhkan memory saat di compile, tapi akan membutuhkan memory saat object(instance) di buat. Maka nya nama nya instance variable.
```java

class IniClass {
	String InstanceVariable1;
	int InstanceVariable2;

	void iniMethod(){
	}
}
```

### Method di Java

Di Java, method itu seperti function, yang berfungsi untuk menampilkan behavior dari sebuah object.

Keuntungan method adalah:
- Code Reusability
- Code Optimization

### Cara initialize object

Initializing object adalah menyetorkan data, meletakan data atau memberikan data ke object. Kurang lebih seperti itu :D
Versi english nya: Initializing object simply means storing data into object.
- By refeterence variable
- By method
- By constructor

### 1.object-class-main-within-class

```java
public class Murid {

  int id;
  String name;

  public static void main(String[] args) {
    Murid SD = new Murid();
    System.out.println(SD.id);
    System.out.println(SD.name);
  }

}
```
- Di atas adalah contoh pembuatan object di dalam class.
- Object bernama SD di buat di dalam method main, dan method main ini berada di dalam class Murid.
```
output:
0
null
```
### 2.object-class-main-outside-class
```java
class Murid {

  int id;
  String name;

}

class Aplikasi {

  public static void main(String[] args) {

    Murid SMP = new Murid();
    System.out.println(SMP.id);
    System.out.println(SMP.name);

  }

}
```
- Di atas adalah contoh pembuatan object di luar class.
- Terdapat dua class yaitu Murid dan Aplikasi, class Murid berisi instance variable id dan name sedang class Aplikasi berisi main method dan pembuatan object.
- Object bernama SMP di buat di class Aplikasi dan class Murid sebagai base/blueprint nya.
```
output:
0
null
```

### 3.object-by-variable
```java
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
```
- Kode di atas adalah contoh object memanggil variable.
- Kode di atas ada dua class, yaitu Murid dan Aplikasi.
- Class Murid berisi dua instance variable yaitu id dan name, sedang class Aplikasi berisi main method.
- Main method pada class Aplikasi, berisi pembuatan object bernama SMA dengan berbasis class Murid.
- ``` Murid SMA = new Murid(); ``` ini adalah code pembuatan object dengan nama SMA dan class Murid sebagai blueprint/cetakannya/resourcenya.
-
Setelah SMA(Object) sudah di initialize, maka object SMA ini bisa mengakses dan memiliki resource yang ada di class Murid.
Kode dibawah ini adalah, SMA memanggil instance variable id dari class Murid(ya karna memang SMA ini object dari class Murid, jadi manggil nya resource yang di class Murid), setelah itu memberikan nilai pada variable id dengan nilai 1012. Begitu juga saat memberikan nilai Darmaji ke instance variable name.
```
SMA.id = 1012;
SMA.name = "Darmaji";
```
- Setelah variable id dan name di panggil dan isi sebuah data/nilai oleh object SMA, maka jika di print, sudah ada hasil nya.
```
System.out.println("ID : "+SMA.id);
System.out.println("Name :"+SMA.name);

output:

ID : 1012
Name :Darmaji
```

### 4.object-by-variable-2
```java
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
```
- Di atas contoh pembuatan object lebih dari satu.

### 5.object-by-method
```java
class Murid {
  int id;
  String name;

  void insertData(int i, String n) {
    id = i;
    name = n;
  }

  void tampilkanData() {
    System.out.println(id+" "+name);
  }
}

public class Aplikasi {
  public static void main(String[] args) {
    Murid SMP = new Murid();
    SMP.insertData(123, "Naruto");
    SMP.tampilkanData();

  }

}
```
- Di atas adalah contoh object memanggil method class.
- Object SMP memanggil method insertData lalu memasukan nilai melalui parameter.
- dan tampilkanData dari class Murid menampilkan nilai yang di masukan oleh object SMP tadi.
```
output:
123 Naruto
```

### 6.ObjectAndClass-sample1
```java
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
```
### 7.ObjectAndClass-sample2
```java
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
```
### 8.ObjectAndClass-sample3
```java
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
    darmaji.insertData(101, "Darmaji", 1000);
    darmaji.tampilAkun();
    darmaji.cekSaldo();
    darmaji.simpanUang(500);
    darmaji.cekSaldo();
    darmaji.ambilUang(900);
    darmaji.cekSaldo();
  }
}
```
