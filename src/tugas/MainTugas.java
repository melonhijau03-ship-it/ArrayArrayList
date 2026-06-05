
package tugas;


public class MainTugas {
    
     public static void main(String[] args) {
 
        // ── 4. Array String nama mata kuliah (ukuran tetap, minimal 3) ──────
        String[] mataKuliah = {
            "Pemrograman Berorientasi Objek",
            "Struktur Data",
            "Basis Data"
        };
 
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║          SISTEM PENGELOLAAN NILAI MAHASISWA          ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
 
        System.out.println("\n── Daftar Mata Kuliah ──");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("  %d. %s%n", i + 1, mataKuliah[i]);
        }
 
        // ── 1-2. Buat KelasKuliah dan tambahkan minimal 5 Mahasiswa ─────────
        KelasKuliah kelas = new KelasKuliah();
 
        kelas.tambahMahasiswa(new Mahasiswa("adil",    "2201001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("adit",    "2201002", 55.5));
        kelas.tambahMahasiswa(new Mahasiswa("maulana",      "2201003", 72.0));
        kelas.tambahMahasiswa(new Mahasiswa("umar",    "2201004", 40.0));
        kelas.tambahMahasiswa(new Mahasiswa("ifan",      "2201005", 90.5));
 
        // ── Tampilkan semua data awal ────────────────────────────────────────
        System.out.println("\n── Data Mahasiswa (Awal) ──");
        kelas.tampilkanSemua();
 
        // ── 5. Tampilkan rata-rata dan jumlah lulus ──────────────────────────
        System.out.printf("%nRata-rata nilai  : %.2f%n", kelas.hitungRataRata());
        System.out.printf("Jumlah lulus     : %d mahasiswa%n", kelas.jumlahLulus());
 
        // ── 6. Tambah satu mahasiswa baru, lalu tampilkan jumlah terbaru ─────
        System.out.println("\n── Menambahkan Mahasiswa Baru ──");
        kelas.tambahMahasiswa(new Mahasiswa("nanda", "2201006", 78.0));
        System.out.printf("Jumlah data terbaru : %d mahasiswa%n", kelas.jumlahMahasiswa());
 
        // Tampilkan ulang seluruh data setelah penambahan
        System.out.println("\n── Data Mahasiswa (Setelah Penambahan) ──");
        kelas.tampilkanSemua();
        System.out.printf("%nRata-rata nilai  : %.2f%n", kelas.hitungRataRata());
        System.out.printf("Jumlah lulus     : %d mahasiswa%n", kelas.jumlahLulus());
    }
}
