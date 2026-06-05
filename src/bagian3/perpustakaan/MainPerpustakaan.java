
package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[]args){
        //membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();
        
        //membuat objek buku lalu memasukkannua ke koleksi
        perpus.tambahBuku(new Buku("laskar pelangi", "andrea hirata"));
        perpus.tambahBuku(new Buku("bumi manusia", "pramodya"));
        perpus.tambahBuku(new Buku("negeri 5 negara", "ahmad fuadi"));
        
        perpus.tampilkanKoleksi();
        
        System.out.println("");
        perpus.pinjamBuku("Bumi manusia");
        perpus.pinjamBuku("Bumi manusia");// mencoba menjiam kedua kali
        
        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println("buku Tersedia :" + perpus.jumlahTersedia());
    }
    
}
