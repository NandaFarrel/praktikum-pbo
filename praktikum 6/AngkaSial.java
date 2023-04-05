// Nama: Nanda Farrel Chevalerie
// Nim : 24060121140165
// Deskripsi	: Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'

public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as=new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}
		catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

//Tidak dieksekusi karena program stop pada baris sebelumnya yang berisi angka 13
//Dieksekusi karena menghandle proses output "hati-hati memasukkan angka!!!" saat terdapat input 13
