
package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku lalu memasukkannya ke koleksi (ditambah parameter tahun)
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya", 1980)); // Tambahan untuk tes cariPenulis

        perpus.tampilkanKoleksi();
        System.out.println();
        
        // Pengujian Pinjam Buku
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali
        System.out.println();
        
        // Pengujian 1: Uji coba mengembalikan buku
        System.out.println("--- Uji Coba Pengembalian Buku ---");
        perpus.kembalikanBuku("Bumi Manusia");
        perpus.kembalikanBuku("Bumi Manusia"); // coba kembalikan kedua kali setelah tersedia
        System.out.println();
        
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();
        
        // Pengujian 3: Uji coba mencari buku berdasarkan penulis
        System.out.println("--- Uji Coba Pencarian Penulis ---");
        perpus.cariPenulis("Pramoedya");
        System.out.println();
        perpus.cariPenulis("Tere Liye"); // Tes jika penulis tidak terdaftar
    }  
}
