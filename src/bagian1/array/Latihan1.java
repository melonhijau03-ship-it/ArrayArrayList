
package bagian1.array;


public class Latihan1 {
    public static void main(String[]args){
        //cara 1 deklarasi terus isi per indeks
        int[]nilai = new int [5];
        nilai[0]=80;
        nilai[1]=75;
        nilai[2]=90;
        nilai[3]=60;
        nilai[4]=85;
        
        //cara 2 langsung diisi saat di buat
        String[] nama = {"andi","budi","citra"};
        
        System.out.println("nilai pertama :" + nilai[0]);
        System.out.println("nilai ketiga :" + nilai[2]);
        System.out.println("mahasiswa ke-2 :" + nama[1]);
        System.out.println("jumlah nilai :" + nilai.length);   
        
    }
    
}
