import java.util.*;
/*
public class ZutatenListe {

	public static void main (String []args) {
		
		System.out.println("You�ll never burger alone - Create your Burger\r\n");
		System.out.println("Mit �menu� kannst du dir alle zur Verf�gung stehenden Zutaten anzeigen lassen.\r\n"
				 			+ "Mit �neuer Burger� erstellst du die Name dein Burger.\r\n"
				 			+ "Mit �zutat� und der jeweiligen Nummer kannst du eine Zutat ausw�hlen.\n");
		System.out.println("Bitte deine Eingabe: ");
			
		Scanner lesen = new Scanner(System.in); //Scanner lee lo que se escribe
		String input = ""; // Convertir Scanner a String 
		
		String[] liste = new String[18];
		liste[0] = "Hamburger (Standard)";        //el 0!!!!!!!!!
		liste[1] = "Hamburger Sesam";
		liste[2] = "Vegan-Br�tchen";
		liste[3] = "Ciabatta";
		liste[4] = "Rindfleisch (Original)";
		liste[5] = "H�hnchenfleisch gegrillt";
		liste[6] = "Falafel-Bratling";
		liste[7] = "Gem�se-Bratling";
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
		
		String[] ausgew�hltenZutaten = new String[9]; 
		//Burger sendZutat = new Burger(ausgew�hltenZutaten);
		
		Burger nameBurger = new Burger("");
		boolean finished = false;
		
		while (!(input = lesen.nextLine()).equals("") || finished == false) { 	// max 10 burger!!!!!!!!
			switch(input) {
				case "menu":{
					System.out.println("Zutaten: ");
					
					System.out.println("Br�tchensorten: ");
					for (int i=0; i<=3; i++) {
					System.out.println((i) + "." + liste[i]); // i = posici�n xd
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
					System.out.println("Gem�se: ");
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
					Scanner nameLesen = new Scanner(System.in);
					String name = nameLesen.nextLine();
					nameBurger = new Burger(name);
					
					System.out.println("Du stellst einen neuen Burger zusammen.\r\n"
							+ "Mit �ok� kannst du deine Zusammenstellung abschlie�en.");
					break;	
				}
				case "zutat":{
					int counter = 1;
			
					for (int j = 0; j < ausgew�hltenZutaten.length; j++) {       
						System.out.println("Bitte gib die Nummer der " + j+1 + ". Zutat ein: ");
						String �berprufen = StaticScanner.nextString();
						if (�berprufen.equals("ok")) {                          //comparar un String
							System.out.println("Dein Burger wird aufgenommen.");
							break;
						}   // condici�n de error?????????
						int zutatsNummer = Integer.parseInt(�berprufen);
						System.out.println(liste[zutatsNummer]);
						ausgew�hltenZutaten[j] = liste [zutatsNummer]; 
						counter++;	
					}
					
				break;
				}
				case "ok":{
					System.out.println("Dein Burger wird aufgenommen.");
					//enviar el pedido???
					break;
				}
				case "meine Burger":{
					System.out.println("Name deines Burgers: " + nameBurger.returnName());
					System.out.println("Deine ausgew�hlten Zutaten: ");
					for (int j = 0; j<ausgew�hltenZutaten.length; j++) {	
						if (ausgew�hltenZutaten[j] == null) {
							continue;
						}
						System.out.println(ausgew�hltenZutaten[j]);
					}
					break;
				}
				case "bestellen":{
					System.out.println("Ihre Burger werden frisch zubereitet...");
					finished = true;
					break;
				}
				default: System.out.println("Ung�ltiger Befehl. Versuchen Sie nochmal.");
			} //switch
			if(finished) {
				break;
			}
			System.out.println();
			System.out.println("Bitte deine Eingabe: ");
		} //while
	System.out.println("Ende des Programms.");
	}
}
*/