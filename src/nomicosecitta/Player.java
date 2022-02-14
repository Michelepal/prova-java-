package nomicosecitta;
import java.util.Scanner;

 
public class Player {
	
	String nome;
	String oggetto;
	String citta;
	int punteggio;
	Scanner sc = new Scanner(System.in);
	
	public Player(String nome, String oggetto, String citta, int punteggio) {
		
		this.nome = nome;
		this.oggetto = oggetto;
		this.citta = citta;
		this.punteggio = punteggio;
		
	}
	
	String getNome() {
		System.out.println("Inserisci un nome");
		String nome = sc.nextLine();
		this.punteggio += nome.length();
		return nome;
	}
	
	String getOggetto() {
		System.out.println("Inserisci il nome di un oggetto");
		String cosa = sc.nextLine();
		this.punteggio += cosa.length();
		return cosa;
	}
	
	String getCitta() {
		System.out.println("Inserisci il nome di una città");
		String citta = sc.nextLine();
		this.punteggio +=  citta.length();
		return citta;
	}
	

}
