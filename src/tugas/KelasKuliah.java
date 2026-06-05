
package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa;
 
    public KelasKuliah() {
        daftarMahasiswa = new ArrayList<>();
    }
 
    // Menambahkan satu objek Mahasiswa ke dalam koleksi
    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }
 
    // Menghitung rata-rata nilai seluruh mahasiswa
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }
 
    // Menghitung jumlah mahasiswa yang lulus (nilai >= 60)
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) count++;
        }
        return count;
    }
 
    // Menampilkan seluruh data mahasiswa beserta header tabel
    public void tampilkanSemua() {
        System.out.println("=".repeat(60));
        System.out.printf("%-20s | %-12s | %6s | %s%n",
                "NAMA", "NPM", "NILAI", "STATUS");
        System.out.println("-".repeat(60));
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m);
        }
        System.out.println("=".repeat(60));
        System.out.printf("Jumlah mahasiswa : %d%n", daftarMahasiswa.size());
    }
 
    // Getter jumlah total mahasiswa
    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}
