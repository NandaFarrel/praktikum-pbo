// Nama: Nanda Farrel Chevalerie
// Nim : 24060121140165
// Deskripsi : representasi dari objek bujur sangkar, turunan kelas poligon

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{ 
	private double panjangSisi; 
  
	public BujurSangkar(double panjangSisi){ 
		this.jumlahSisi = 4; 
		this.panjangSisi = panjangSisi; 
	} 
  
	public double hitungLuas(){ 
		return panjangSisi * panjangSisi; 
	} 
  
	public double getPanjangSisi(){ 
		return this.panjangSisi; 
	} 
}
