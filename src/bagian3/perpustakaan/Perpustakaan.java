
package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    // ArrayList yang menampung objek bertipe Buku
    private ArrayList<Buku> koleksi = new ArrayList<>();

    // Menambah satu buku ke koleksi
    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    // Menampilkan seluruh koleksi beserta nomor urut
    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    // Mencari buku berdasarkan judul, lalu menandainya dipinjam
    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // 1. Method kembalikanBuku(String judul)
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (!b.isDipinjam()) {
                    System.out.println("Buku " + judul + " sebenarnya belum dipinjam / sudah ada di perpustakaan.");
                } else {
                    b.setDipinjam(false);
                    System.out.println(judul + " berhasil dikembalikan.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // 3. Method cariPenulis(String penulis)
    public void cariPenulis(String penulis) {
        System.out.println("== Hasil Pencarian Buku Karya: " + penulis + " ==");
        boolean ditemukan = false;
        int nomor = 1;
        
        for (Buku b : koleksi) {
            // Menggunakan equalsIgnoreCase agar pencarian nama tidak sensitif huruf besar/kecil
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println(nomor + ". " + b.info());
                nomor++;
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Tidak ada koleksi buku dari penulis tersebut.");
        }
    }

    // Menghitung jumlah buku yang masih tersedia
    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }
}