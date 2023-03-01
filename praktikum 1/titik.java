// Nama: Nanda Farrel Chevalerie
// Nim : 24060121140165

class Titik {
		private double absis;
		private double ordinat;
		static int counterTitik;
		
		Titik(){
			absis =0.0;
			ordinat= 0.0;
			counterTitik ++;
		}	
		
		Titik(double a, double o){
			absis = a;
			ordinat= o;
			counterTitik ++;
		}	
		public void setAbsis (double a) {
			absis = a;
			}
			
		public void setOrdinat (double o) {
			ordinat = o;
			}
		
		public double getAbsis() {
			return absis;
			}
			
		public double getOrdinat() {
			return ordinat;
			}
			
		public static double counterTitik(){
			return counterTitik;
			}
}
