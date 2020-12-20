public class Soru {
	
	public String soruCumlesi; // soru etribütleri oluşturdum 
	public String Asecenek;
	public String Bsecenek;
	public String Csecenek;
	public String Dsecenek;
	public String dogruSecenek;
	
	
	public Soru (String sc, String scnA, String scnB, String scnC, String scnD, String dScn) { 
		this.soruCumlesi = sc;
		this.Asecenek = scnA;
		this.Bsecenek = scnB;
		this.Csecenek = scnC;
		this.Dsecenek = scnD;
		this.dogruSecenek = dScn;
	}
}
