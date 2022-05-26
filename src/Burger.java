public class Burger{
	//variables
	//private Zutat[] zutaten = new Zutat[9];
	private String name;
	private float preis;
	boolean vegan, vegetarisch;
	private boolean klassisch;
	private String geschmack = "normal";
	String ausgewaehltenZutaten[] = new String[9];
	//constructor
	public Burger(String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch, String[] ausgewaehltenZutaten){
		this.name = name;
		this.preis = preis;
		this.vegan = vegan;
		this.vegetarisch = vegetarisch;
		this.klassisch = klassisch;
		this.ausgewaehltenZutaten = ausgewaehltenZutaten;
	}
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setPreis(float preis) {
		this.preis = preis;
	}
}