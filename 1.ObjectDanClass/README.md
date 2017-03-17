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


### Object and Class Example: main within class (Contoh1)

### Object and Class Example: main outside class (Contoh2)

### 3 Cara initialize object

Initializing object adalah menyetorkan data, meletakan data atau memberikan data ke object. Kurang lebih seperti itu :D
Versi english nya: Initializing object simply means storing data into object.

#### 1. By refeterence variable
#### 2. By method
#### 3. By constructor
