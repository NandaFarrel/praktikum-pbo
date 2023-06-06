// Nama: Nanda Farrel Chevalerie
// Nim : 24060121140165
// Deskripsi : Implementasi lambda pada Hashmap

import java.util.HashMap; 
import java.util.Map; 
 
public class LambdaHashmap{ 
    public static void main(String[] args){ 
        Map<String, String> mahasiswaMap = new HashMap<>(); 
        mahasiswaMap.put("24060121140165", "Nanda Farrel Chevalerie"); 
 
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama)); 
    } 
}
