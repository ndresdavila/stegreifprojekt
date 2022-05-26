
public class Gemuese extends Zutat {
	//variables
	private int scheibenDicke;
	private int scheibenAnzahl;
	//comstructor
	public Gemuese(String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch, int zeit, int hoehe) {
		super(name, preis, klassisch, vegan, vegetarisch);
		this.scheibenDicke = hoehe;
		this.scheibenAnzahl = zeit;
	}
	//setters
	public void setScheibenDicke(int scheibenDicke) {
		this.scheibenDicke = scheibenDicke;
	}
	public void setScheibenAnzahl(int scheibenAnzahl) {
		this.scheibenAnzahl = scheibenAnzahl;
	}
	//getters
	public int getScheibenDicke() {
		return this.scheibenDicke;
	}
	public int getScheibenAnzahl() {
		return this.scheibenAnzahl;
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
