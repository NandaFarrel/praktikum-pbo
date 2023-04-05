// Nama: Nanda Farrel Chevalerie
// Nim : 24060121140165
// Deskripsi	: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari=jariJari;
	}
	
	public double hitungKeliling(){
		double keliling=2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari=7;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l=new Lingkaran(jariJari);
		double kelilingLingkaran=l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

//Yang kurang tepat dari program Asersi di atas adalah pertentangan antara syarat dari asersinya dan outputnya tidak bersesuaian
//Alternatif 1: Jika outputnya "jari jari tidak boleh nol!!!" maka syaratnya assert(jariJari!=0)
//Alternatif 2: Jika syaratnya assert(jariJari>0) maka outputnya "jari jari harus lebih dari nol!!!"
