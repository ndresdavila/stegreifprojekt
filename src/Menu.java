
public class Menu {
	Zutat [][] zutatListe = new Zutat [4][3];
	
	public Menu() { 
		
		//Broetchen (name, preis, klassisch, vegan, vegetarisch, zeit, hoehe)
		zutatListe[0][0] = new Broetchen("Hamburger(Standard)", 0.85f, true, false, true, 90, 27);
		zutatListe[0][1] = new Broetchen("Hamburger Sesam", 0.95f, true, false, true, 90, 28);
		zutatListe[0][2] = new Broetchen("Vegan-Broetchen", 0.55f, false, true, false, 240, 44);
		zutatListe[0][3] = new Broetchen("Ciabatta", 0.45f, false, false, false, 330, 41);

		//Bratlinge (name, preis, klassisch, vegan, vegetarisch, zeit, hoehe)
		zutatListe[1][0] = new Bratling("Rindfleisch (Original)", 1.85f, true, false, false, 270, 25);
		zutatListe[1][1] = new Bratling("Haenchenfleisch gegrillt", 1.15f, false, false,  false, 180, 11);
		zutatListe[1][2] = new Bratling("Falafel-Bratling", 1.45f, false, true, false, 210, 21);
		zutatListe[1][3] = new Bratling("Gemuese-Bratling", 1.75f, false, false, true, 240, 25);
		
		//Salate (name, preis, klassisch, vegan, vegetarisch)
		zutatListe[2][0] = new Salat("Eisbergsalat", 0.85f, true, true, false);
		zutatListe[2][1] = new Salat("Rucolasalat", 0.85f, false, true, false);

		//Gemuese (name, preis, klassisch, vegan, vegetarisch, zeit(scheibenAnzahl), hoehe(scheibenDicke))
		zutatListe[3][0] = new Gemuese("Tomate", 0.25f, true, true, false, 3, 3);
		zutatListe[3][1] = new Gemuese("Salzgurke", 0.15f, true, true, false, 4, 2);
		zutatListe[3][2] = new Gemuese("Rote Zwiebelringe", 0.08f, false, true, false, 5, 2);
		zutatListe[3][3] = new Gemuese("Jalapeno-Ringe", 0.08f, false, true, false, 5, 2);
		
		//Saucen (name, preis, klassisch, vegan, vegetarisch, menge, geschmack)
		zutatListe[4][0] = new Sauce("Ketchup", 0.10f, true, true, false, 5, "normal");
		zutatListe[4][1] = new Sauce("Sandwich-Sauce", 0.15f, true, false, true, 10, "normal");
		zutatListe[4][2] = new Sauce("Chili-Sauce", 0.25f, false, true, false, 8, "scharf");
		zutatListe[4][3] = new Sauce("Honig-Senf-Sauce", 0.18f, false, false, true, 8, "suess");	
	}
}
