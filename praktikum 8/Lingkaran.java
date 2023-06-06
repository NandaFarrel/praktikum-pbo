// Nama: Nanda Farrel Chevalerie
// Nim : 24060121140165
// Deskripsi : implementasi lingkaran sebagai bangundatar

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 *jejari*3.14;
    }
}
