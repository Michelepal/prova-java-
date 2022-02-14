package nomicosecitta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Player player1 = new Player(null, null, null, 0);
		Player player2 = new Player(null, null, null, 0);
		
		player1.getNome();
		player1.getOggetto();
		player1.getCitta();
		
		player2.getNome();
		player2.getOggetto();
		player2.getCitta();
		
		int p1punteggio = player1.punteggio;
		int p2punteggio = player2.punteggio;
		
		if (p1punteggio > p2punteggio) {
			
			System.out.println(p1punteggio + " - Vince Player1");
		} else {
			
			System.out.println(p2punteggio + " - Vince Player2");
		}
		
		/*
		 * System.out.println("Inserisci un nome"); String nome = sc.nextLine(); int
		 * punteggionome = nome.length(); System.out.println(nome);
		 * System.out.println(punteggionome);
		 * System.out.println("Inserisci il nome di un oggetto"); String cosa =
		 * sc.nextLine(); int punteggiocosa = cosa.length(); System.out.println(cosa);
		 * System.out.println(punteggiocosa);
		 * System.out.println("Inserisci il nome di una citt�"); String citta =
		 * sc.nextLine(); int punteggiocitta = citta.length();
		 * System.out.println(citta); System.out.println(punteggiocitta);
		 */
		sc.close();
	}

}
