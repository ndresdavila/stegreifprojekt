import java.util.Scanner;

public class Zutat {
	//variables
	//protected int nummer;
	protected String name;
	protected float preis;
	protected boolean klassisch = false;
	protected boolean vegan = false;
	protected boolean vegetarisch = false;
	//constructor
	public Zutat(String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch){
		this.name = name;
		this.preis = preis;
		this.klassisch = klassisch;
		this.vegan = vegan;
		this.vegetarisch = vegetarisch;
	}
	//metodos
	public int zubereiten() { //Zeit
		return 0;
	}
	public float berechneHoehe() {
		return 0;
	}
	public String toString() {
		return "";
	}	
	public int getPreis() {
		return 0;
	}
	/*
	 * //Kontroller
	public static void main (String []args) {
		System.out.println("You'll never burger alone - Create your Burger\r\n");
		System.out.println("Mit menu kannst du dir alle zur Verfuegung stehenden Zutaten anzeigen lassen.\r\n"
				 			+ "Mit neuer Burger erstellst du die Name dein Burger.\r\n"
				 			+ "Mit zutat und der jeweiligen Nummer kannst du eine Zutat auswaehlen.\n");
		System.out.println("Bitte deine Eingabe: ");
		
		Scanner lesen = new Scanner(System.in); //Scanner lee lo que se escribe
		String input = ""; // Covert Scanner to String 
		
		String[] brotliste = {"Hamburger (Standard)","Hamburger Sesam","Vegan-Broetchen","Ciabatta"};
		
		String[] liste = new String[18];
		liste[0] = "Hamburger (Standard)";        
		liste[1] = "Hamburger Sesam";
		liste[2] = "Vegan-Broetchen";
		liste[3] = "Ciabatta";
		liste[4] = "Rindfleisch (Original)";
		liste[5] = "Haehnchenfleisch gegrillt";
		liste[6] = "Falafel-Bratling";
		liste[7] = "Gemuese-Bratling";
		liste[8] = "Eisbergsalat";
		liste[9] = "Rucolasalat";
		liste[10] = "Tomate";
		liste[11] = "Salzgurke";
		liste[12] = "Rote Zwiebelringe";
		liste[13] = "Jalapeno-Ringe";
		liste[14] = "Ketchup";
		liste[15] = "Sandwich-Sauce";
		liste[16] = "Chili-Sauce";
		liste[17] = "Honig-Senf-Sauce";
		
		String[] ausgewaehltenZutaten = new String[9];
		
		Burger[] myBurger = new Burger[10];int k=0;
		boolean finished = false;
		boolean hasBread = false;
		boolean foo = false;
		

		while (!(input = lesen.nextLine()).equals("") || finished == false) { // max 10 burger!!!!!!!!
			switch(input) {                                                   // minimo un pan!!!!!!
				case "menu":{
					System.out.println("Zutaten: ");
					
					System.out.println("Broetchensorten: ");
					for (int i=0; i<=3; i++) {
					System.out.println((i) + "." + liste[i]); // i = posicion xd
					}
					System.out.println();
					System.out.println("Bratlinge: ");
					for (int i=4; i<=7; i++) {
						System.out.println((i) + "." + liste[i]);
					}
					System.out.println();
					System.out.println("Salate: ");
					for (int i=8; i<=9; i++) {
						System.out.println((i) + "." + liste[i]);
					}
					System.out.println();
					System.out.println("Gemuese: ");
					for (int i=10; i<=13; i++) {
						System.out.println((i) + "." + liste[i]);
					}
					System.out.println();
					System.out.println("Saucen: ");
					for (int i=14; i<=17; i++) {
						System.out.println((i) + "." + liste[i]);
					}
					break;
				}
				case "neuer Burger":{
					System.out.println("Schreib die Name Ihres Burgers: ");
					//Scan
					Scanner nameLesen = new Scanner(System.in);
					String name = nameLesen.nextLine();
					Scanner nummerLesen = new Scanner(System.in);
					int zutat = 0;
					//Set burger name
					myBurger[k] = new Burger();
					myBurger[k].setName(name);
					//Ende
					System.out.println("Du stellst einen neuen Burger zusammen.\r\n"+"Mit ok kannst du deine Zusammenstellung abschliessen.");
					break;	
				}
				
				case "zutat":{
					//maximal 9 Zutaten pro Burger 
					for (int j = 0;j < 8; j++) {

						
						System.out.println("Bitte gib die Nummer der " + (j+1) + ". Zutat ein: ");
						if(j==0) 
							System.out.println("Waehle erstmal ein Broetchen (0 bis 3) :");
						
						//Case: "ok"
						String ueberprufen = StaticScanner.nextString();
						if (ueberprufen.equals("ok")) {
							k++;
							break;
							int zutatsNummer = Integer.parseInt(ueberprufen);
						}
						//Brot ueberprufen
						do{
							//Kein Brot:	
							System.out.println("Waehle erstmal ein Broetchen (0 bis 3) :");
							
						}while(!((zutatsNummer == 0 || zutatsNummer == 1 || zutatsNummer == 2 || zutatsNummer == 3)) && j==0);
						//Ein Brot
						//2. Zutat,...,9. Zutat eintragen (etwas anderes (auch Brot))
						hasBread = true;//min. ein Brot
						System.out.println(liste[zutatsNummer]);//print
						myBurger[k].setAusgewaehltenZutaten(liste[zutatsNummer],j);//set ausgewaehltenZutaten von Burger
					}
					break;
				}
				//for loop de 1 a maximo 10 if null continue else print
				case "meine Burger":{
					
					for(int l=0;l<=k;l++) {
						
						if(myBurger[l] == null)
							continue;
						
						System.out.println("Name deines Burgers: " + myBurger[l].getName());
						System.out.println("Deine ausgewaehlten Zutaten: ");
						for (int j = 0; j<9; j++) {	
							if (myBurger[l].getAusgewaehltenZutaten()[j] == null) {
								continue;
							}
							System.out.println(myBurger[l].getAusgewaehltenZutaten()[j]);
						}
						System.out.println("------------------------------------------------");		
					}
					break;
				}
				
				case "ok":{//siguiente hamburguesa
					System.out.println("Dein Burger wird aufgenommen. Schreib 'neuer Burger' um eine neue Burger zu bestellen, oder 'bestellen' um die Bestellung abzuschliessen.");
					k++;//next burger
					break;
				}
				
				case "bestellen":{//cerrar
					System.out.println("Ihre Burger werden frisch zubereitet...");
					finished = true;
					break;
				}
				default: System.out.println("Ungueltiger Befehl. Versuchen Sie nochmal.");
			}//switch
			
			if(finished) 
				break;
			
			System.out.println("\n Bitte deine Eingabe: ");
			
		} //while
		
		System.out.println("Ende des Programms.");
	}
	 */
}			