public class Bratling extends Zutat {
	//variables
	private int bratzeit;
	private int hoehe;
	//constructor
	public Bratling (String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch, int zeit, int hoehe){
		super(name, preis, klassisch, vegan, vegetarisch);
		this.bratzeit = zeit;
		this.hoehe = hoehe;
	}
	//setters
	public void setBratzeit(int bratzeit) {
		this.bratzeit = bratzeit;
	}
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	//getters
	public int getHoehe() {
		return this.hoehe;
	}
	public int getBratzeit() {
		return this.bratzeit;
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