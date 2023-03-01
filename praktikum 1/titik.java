// Nama: Nanda Farrel Chevalerie
// Nim : 24060121140165

class Titik {
		int absis;
		int ordinat;
		static int counterTitik;
		
		Titik(){
			absis =0.0;
			ordinat= 0.0;
			counterTitik ++;
		}	
		
		Titik(int a, int o){
			absis = a;
			ordinat= o;
			counterTitik ++;
		}	
		void setAbsis (int a) {
			absis = a;
			}
			
		void setOrdinat (int o) {
			ordinat = o;
			}
		
		int getAbsis() {
			return absis;
			}
			
		int getOrdinat() {
			return ordinat;
			}
			
		static int counterTitik(){
			return counterTitik;
			}
}
