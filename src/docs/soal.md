Skenario

Anda sedang mengerjakan modul "Human Resources" untuk sebuah perusahaan. Terdapat dua kelas utama yang sudah didefinisikan secara sederhana: Karyawan dan Divisi. Tugas Anda adalah membuat skenario pengujian (Unit Test) untuk memastikan logika bisnis pada kedua kelas tersebut berjalan dengan benar menggunakan framework TestNG.
Struktur Kelas (Spesifikasi Bisnis)

    Kelas Karyawan:

        Atribut: nama (String), jabatan (String), gajiPokok (double).

        Metode hitungGajiTotal(): Mengembalikan gaji pokok + tunjangan jabatan (Manager: 5.000.000, Staff: 2.000.000, Lainnya: 0).

        Metode updateGaji(double persentase): Menaikkan gajiPokok berdasarkan persentase (misal: input 10 berarti naik 10%).

    Kelas Divisi:

        Atribut: namaDivisi (String) dan daftarKaryawan (List of Karyawan).

        Metode tambahKaryawan(Karyawan karyawan): Menambahkan objek karyawan ke dalam list.

        Metode getJumlahKaryawan(): Mengembalikan total karyawan di divisi tersebut.

        Libatkan Exception Handling