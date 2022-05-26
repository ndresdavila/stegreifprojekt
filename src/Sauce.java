public class Sauce extends Zutat {
	//variables
	int menge; //ml
	String geschmack;	
	//constructor
	public Sauce(String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch, int menge, String geschmack) {
		super(name, preis, klassisch, vegan, vegetarisch);
		this.menge = menge;
		this.geschmack = geschmack;
	}	
	//setters
	public void setMenge(int menge) {
		this.menge = menge;
	}
	public void setGeschmack(String geschmack) {
		this.geschmack = geschmack;
	}
	//getters
	public int getMenge() {
		return this.menge;
	}
	public String getGeschmack() {
		return this.geschmack;	
	}
	//metodos
	public int zubereiten() {
		return 0;
	}
	public String toString() {
		return "";
	}
}