# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data peserta pelatihan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan ID karyawan, dan memberikan output berupa informasi detail dari peserta tersebut seperti nama, ID, dan bidang pelatihan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, Peserta, PesertaPelatihan, dan PelatihanApp adalah contoh dari class.

```java
public class Peserta {
    ...
}

public class PesertaPelatihan extends Peserta {
    ...
}

public class PelatihanApp {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, peserta = new PesertaPelatihan(nama, id, bidang); adalah contoh pembuatan object.

```java
PesertaPelatihan peserta = new PesertaPelatihan(nama, id, bidang);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, nama, idKaryawan, dan bidang adalah contoh atribut.

```java
private String nama;
private int idKaryawan;
private String bidang;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Peserta dan PesertaPelatihan.

```java
public Peserta(String nama, int idKaryawan) {
    this.nama = nama;
    this.idKaryawan = idKaryawan;
}

public PesertaPelatihan(String nama, int idKaryawan, String bidang) {
    super(nama, idKaryawan);
    this.bidang = bidang;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setNama, setIdKaryawan, dan setBidang adalah contoh method mutator.

```java
public void setNama(String nama) {
    this.nama = nama;
}

public void setIdKaryawan(int idKaryawan) {
    this.idKaryawan = idKaryawan;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getNama, getIdKaryawan, dan getBidang adalah contoh method accessor.

```java
public String getNama() {
    return nama;
}

public int getIdKaryawan() {
    return idKaryawan;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut nama, idKaryawan, dan bidang dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```java
private String nama;
private int idKaryawan;
private String bidang;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, PesertaPelatihan mewarisi Peserta dengan sintaks extends.

```java
public class PesertaPelatihan extends Peserta {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method info(boolean) di PesertaPelatihan merupakan overloading method info dan info() di PesertaPelatihan merupakan override dari method info() di Peserta.

```java
public String info(boolean ringkas) {
    return ...;
}

@Override
public String info() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else dalam pengecekan jumlah peserta dan validasi input ID.

```java
if (sesi.getJumlah() == 3) {
    System.out.println("Pelatihan PENUH");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk meminta input dan menampilkan data.

```java
for (int i = 0; i < 3; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Karyawan: ");
String nama = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, PesertaPelatihan[] daftar = new PesertaPelatihan[3]; adalah contoh penggunaan array.

```java
PesertaPelatihan[] daftar = new PesertaPelatihan[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani error dan validasi saat parsing ID yang harus berupa angka.

```java
try {
    id = Integer.parseInt(inputId);
} catch (NumberFormatException e) {
    System.out.println("Kesalahan: ID harus berupa angka!");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ahmad Taufiq Wahyu Pratama  
NPM: 2310010392
