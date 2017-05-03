import java.util.Scanner;

import facade.impl.FilmFacade;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("0 : Fichier Vers Base / 1 : Base vers Fichier \n");
		String str = sc.nextLine();
		FilmFacade ff = new FilmFacade();
		String chemin = "ressources/films.csv";
		if(str.equals("0")){
			ff.fichierVersBase(chemin);
			
		}else if(str.equals("1")){
			ff.baseVersFichier("ressources/nvfilms.csv", "0");
		}
	}

}
