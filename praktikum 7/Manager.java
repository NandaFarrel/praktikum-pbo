// Nama: Nanda Farrel Chevalerie
// Nim : 24060121140165
// Deskripsi	: File subclass dari Pegawai

public class Manajer extends Pegawai{
	protected int tunjangan = 700000;
	
	public Manajer(String name){
		nama = name;
	}
	
	public void tampilData(){
		System.out.println("Nama = "+nama+", Gaji pokok : "+gajiPokok+", Tunjangan : "+tunjangan);
	}
}
