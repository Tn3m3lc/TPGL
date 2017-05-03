package facade.impl;

import java.util.ArrayList;

import service.impl.FilmService;
import facade.inte.Facade;

public class FilmFacade implements Facade {

	public void fichierVersBase(String chemin) {
		FilmService fs = new FilmService();
		ArrayList<Object> listFilms = fs.lireFichier(chemin);
		for(Object o : listFilms){
			fs.sauvegarder(o);
		}
	}

	public void baseVersFichier(String chemin, String id) {
		FilmService fs = new FilmService();
		Object f = fs.extraire(id);
		fs.ecrire(chemin, f);
	}

}
