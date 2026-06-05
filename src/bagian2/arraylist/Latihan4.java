
package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan4 {
    public static void main (String[]args){
        ArrayList<String> buah = new ArrayList<>();
        buah.add("apel");
        buah.add("mangga");
        buah.add("jeruk");
        System.out.println("awal :" +buah);
        
        buah.add(1,"anggur"); //sisip di indeks 1
        System.out.println("sisip :" +buah);
        
        buah.set(0,"anggut"); //ganti indeks 0
        System.out.print("ganti" + buah);
        
        buah.remove("jeruk"); //hapus berdasarkan nilai
        System.out.println("hapus :" + buah);
        
        System.out.print("ada apel?: " +buah.contains("apel"));
        System.out.print("jumlah : " +buah.size());
    }
    
    
}
