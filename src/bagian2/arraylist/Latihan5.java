
package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan5 {
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<>();
            nilai.add(80);
            nilai.add(75);
            nilai.add(90);
            
        int total = 0;
        for (int n : nilai) { // for-each pada ArrayList
            total += n;
        }
        double rata = (double) total / nilai.size();
    
        System.out.println("Data : " + nilai);
        System.out.println("Total : " + total);
        System.out.println("Rata-rata : " + rata);
        
        // Latihan 2.1 PROGRAM DAFTAR BELANJA
        System.out.println("--- 1. Program Daftar Belanja ---");
        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("mie instan");          // Item ke-1 (index 0)
        daftarBelanja.add("Minyak wijen");  // Item ke-2 (index 1)
        daftarBelanja.add("garam");          // Item ke-3 (index 2)
        daftarBelanja.add("kopi");           // Item ke-4 (index 3)

        // Menghapus item ke-2 (indeks 1)
        daftarBelanja.remove(1);

        System.out.println("Isi daftar belanja: " + daftarBelanja);
        System.out.println("Jumlah akhir item : " + daftarBelanja.size());
        System.out.println();

        // Latihan 2.2 PROGRAM NILAI TERBESAR
        System.out.println("--- 2. Program Nilai Terbesar ---");
        ArrayList<Integer> angka = new ArrayList<>();
        
        angka.add(25);
        angka.add(87);
        angka.add(42);
        angka.add(99);
        angka.add(12);

        int terbesar = angka.get(0); 
        for (int num : angka) {
            if (num > terbesar) {
                terbesar = num;
            }
        }
        
        System.out.println("Data angka    : " + angka);
        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println();

        // Latihan 2.3 PROGRAM FILTER NAMA (HURUF A)
        System.out.println("--- 3. Program Filter Nama (Huruf A) ---");
        ArrayList<String> daftarNama = new ArrayList<>();
        
        daftarNama.add("Adit");
        daftarNama.add("Riduan");
        daftarNama.add("Akmal");
        daftarNama.add("Rehan");
        daftarNama.add("Haykal");
        daftarNama.add("Adrian");
        
        System.out.println("Semua nama: " + daftarNama);
        System.out.print("Nama yang diawali huruf 'A': ");
        
        for (String nama : daftarNama) {
            if (nama.startsWith("A")) {
                System.out.print(nama + " ");
            }
        }
        System.out.println();
        
    }
}
