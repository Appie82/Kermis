package kermis_ap;

import java.util.Scanner;

public class Kassa {
	boolean open = true;

	Scanner scanner = new Scanner(System.in);

	void kassadraaien() {
		int aantalAttracties = 5;

		//			Botsauto  bs1 = new Botsauto();		// zo maak je een botsauto aan van het type botsauto
		//			Attractie bs2 = new Botsauto();		// zo maak je een botsauto aan van het type attractie (de manier voor de array)
		//			Spin      sp1 = new Spin();
		//			
		//			System.out.println(bs1.entree);
		//			System.out.println(sp1.entree);
		//			
		Attractie[] attracties = new Attractie[aantalAttracties];

		// wat staat er in de array van attracties?? -> null, dus nog niet gevuld met attracties.
		for (int i = 0; i < attracties.length; i++) {
			//System.out.println(attracties[i]);
		}
	
		
		attracties[0] = new Botsauto();
		attracties[1] = new Spin();
		attracties[2] = new Hawaii();
		attracties[3] = new Spiegelpaleis();
		attracties[4] = new Ladderklim();
		// wat staat er in de array van attracties?? -> ????
		while(open){
			System.out.println("Zeg het maar, wat mag het zijn. Botsauto's = 1, Spin = 2, Hawaii = 3, Spiegelpaleis = 4, Ladderklimmen = 5");
			while(open){
				System.out.println("Welk kaartje wil je kopen");
				int invoer = scanner.nextInt();
				
				
				if(invoer == 9){
					open = false;
				}
				if(invoer ==1){
					System.out.println("Je wilt in de botsauto's. Hoeveel kaartjes wil je?");
					int aantalKaartjes = scanner.nextInt();
					attracties[0].aantalKaartjes += aantalKaartjes;
					System.out.println("Je wilt " + aantalKaartjes + " kaartjes voor de botsauto's. Dat wordt dan" + aantalKaartjes * attracties[0].entree);

				}
				if(invoer ==2){
					System.out.println("Je wilt in de spin. Hoeveel kaartjes wil je?");
					int aantalKaartjes = scanner.nextInt();
					attracties[1].aantalKaartjes += aantalKaartjes;
					System.out.println("Je wilt " + aantalKaartjes + " kaartjes voor de spin. Dat wordt dan" + attracties[1].entree);
				}
				if(invoer ==3){
					System.out.println("Je wilt in de Hawaii. Hoeveel kaartjes wil je?");
					int aantalKaartjes = scanner.nextInt();
					attracties[2].aantalKaartjes += aantalKaartjes;
					System.out.println("Je wilt " + aantalKaartjes + " kaartjes voor de Hawaii. Dat wordt dan" + attracties[2].entree);
				}
				if(invoer ==4){
					System.out.println("Je wilt in het Spiegelpaleis. Hoeveel kaartjes wil je?");
					int aantalKaartjes = scanner.nextInt();
					attracties[3].aantalKaartjes += aantalKaartjes;
					System.out.println("Je wilt " + aantalKaartjes + " kaartjes voor het Spiegelpaleis. Dat wordt dan" + attracties[3].entree);
				}
				if(invoer ==5){
					System.out.println("Je wilt in de Ladderklim. Hoeveel kaartjes wil je?");
					int aantalKlim = scanner.nextInt();
					attracties[4].aantalKaartjes += aantalKlim;
					if (aantalKlim < 1){
						System.out.println("Je kunt niet minder dan 1 kaartje kopen.");
						aantalKlim = 1;
					}
					 
					System.out.println("Je wilt " + aantalKlim + " kaartjes voor de ladderklim. Dat wordt dan" + aantalKlim * attracties[4].entree);

					System.out.println("Heeft de klimmer de top bereikt? 1 voor ja en 2 voor nee");
					int klim = scanner.nextInt();
					//System.out.println(klim);
					int klimGehaald = 0;
					switch (klim){
					case 1: 
						System.out.println("Gefeliciteerd, je hebt het gehaald. Je wint: " + Ladderklim.ladderWinst+ " euro");
						klimGehaald++;
						System.out.println("Het aantal winnaars van vandaag: " +klimGehaald);
						break;
					case 2: 
						System.out.println("Jammer, probeer het nog een keer");
						break;
					}







					for (int i = 0; i < attracties.length; i++) {
						System.out.println("Attractienaam: " + attracties[i].naam);
						System.out.println("Entreeprijs: " + attracties[i].entree);
						System.out.println("Aantal kaartjes verkocht: " + attracties[i].aantalKaartjes);
						System.out.println(" ");
					}
				}
			}
		}
	}
}
