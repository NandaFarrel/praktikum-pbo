// Nama: Nanda Farrel Chevalerie
// Nim : 24060121140165
// Deskripsi	: File subclass Pegawai

public class Programmer extends Pegawai{
	protected int bonus = 450000;
	
	public Programmer(String name){
		nama = name;
	}
	
	public void tampilData(){
		System.out.println("Nama = "+nama+", Gaji pokok : "+gajiPokok+", Bonus : "+bonus);
	}
}
