
package bagian1.array;


public class Latihan2 {
    public static void main(String[]args){
        int[]nilai = {80,75,90,60,85};
        
        //for biasa punya akses ke indeks
        System.out.println("== menggunakanfor==");
        for (int i  = 0;i<nilai.length;i++){
            System.out.println("index" +i+"="+nilai[i]);
        }
        
        //for-each lebih ringkas,tanpa indeks
        System.out.println("== menggunakan for-each ==");
        int total = 0;
        for (int n : nilai){
            total +=n;
            
        }
        double rata = (double) total/nilai.length;
        System.out.println("total :" +total);
        System.out.println("Rata-Rata :" + rata);
        
        System.out.println("\nMenentukan Suhu Harian");
        System.out.println("=================================");

        // Nomor 1
        double[] suhuHarian = {19.5, 20.0, 21.2, 22.9, 23.1, 24.3};
        double tertinggi = suhuHarian[0];
        double terendah = suhuHarian[0];

        for (double suhu : suhuHarian) {
            if (suhu > tertinggi) {
                tertinggi = suhu;
            }
            if (suhu < terendah) {
                terendah = suhu;
            }
        }
        System.out.println("Suhu Tertinggi: " + tertinggi);
        System.out.println("Suhu Terendah : " + terendah);

        // Nomor 2
        System.out.println("\nHari dengan lebih dari 5 huruf:");
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "sabtu","minggu"};
        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println("- " + hari);
            }
        }
        
        // Nomor 3
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;

        for (int num : angka) {
            if (num % 2 == 0) {
                jumlahGenap++;
            }
        }
        System.out.println("\nBanyak angka genap: " + jumlahGenap);
    }
}
