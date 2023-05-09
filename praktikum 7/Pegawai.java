// Nama: Nanda Farrel Chevalerie
// Nim : 24060121140165
// Deskripsi	: File superclass dari Manajer dan Programmmer

public class Pegawai{
	protected String nama;
	protected int gajiPokok = 5000000;
	
	public void setNama(String name){
		nama = name;
	}
	
	public void tampilData(){
		System.out.println("Nama = "+nama+", Gaji pokok : "+gajiPokok);
	}
}
