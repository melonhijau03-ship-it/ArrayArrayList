
package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan3 {
    public static void main(String[]args){
    //membuat arraylist kosong yang menampung string
    ArrayList<String>mahasiswa = new ArrayList<>();
    
    //add() menambah elemen di akhir
    mahasiswa.add("andi");
    mahasiswa.add("budi");
    mahasiswa.add("citra");
    
    System.out.println("isi list : " + mahasiswa);
    System.out.println("jumlah : " + mahasiswa.size());
    System.out.println("index 1 : " + mahasiswa.get(1));
    
    }
}
