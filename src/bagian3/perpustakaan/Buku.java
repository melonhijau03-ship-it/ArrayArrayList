
package bagian3.perpustakaan;


public class Buku {
    // Atribut: data yang dimiliki setiap buku
    private String judul;
    private String penulis;
    private int tahunTerbit; // Penambahan atribut tahunTerbit
    private boolean dipinjam;

    // Constructor: disesuaikan untuk menerima parameter tahunTerbit
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // buku baru dianggap tersedia
    }

    // Getter: cara membaca atribut dari luar class
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() { // Getter untuk tahunTerbit
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    // Method untuk mengubah status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Mengembalikan keterangan buku beserta tahun terbit
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        // Menampilkan tahun terbit di dalam info
        return judul + " (" + tahunTerbit + ") oleh " + penulis + " [" + status + "]";
    }
}   
