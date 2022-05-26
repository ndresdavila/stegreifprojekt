public class Broetchen extends Zutat {
	//variables
	private int backzeit; // Sekunden
	private int hoehe;    // mm
	//constructor
	public Broetchen(String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch, int zeit, int hoehe){
		super(name, preis, klassisch, vegan, vegetarisch);
		this.backzeit = zeit;
		this.hoehe = hoehe;
	}
	//setters
	public void setBackzeit(int backzeit) {
		this.backzeit = backzeit;
	}	
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	//getters
	public int getBackzeit() {
		return this.backzeit;
	}
	public int getHoehe() {
		return this.hoehe;
	}
	//metodos
	public int zubereiten() {
		return 0;
	}
	public float berechneHoehe() {
		return 0;
	}
	public String toString() {
		return "";
	}
}