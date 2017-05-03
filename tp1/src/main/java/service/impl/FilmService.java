package service.impl;

import java.util.ArrayList;

import service.inte.Service;
import utils.FileUtils;
import model.impl.Film;
import dao.impl.FilmDao;

public class FilmService implements Service {

	public void sauvegarder(Object o) {
		FilmDao dao = new FilmDao();
		dao.enregistrer(o);
	}

	public Object extraire(String id) {
		FilmDao dao = new FilmDao();
		return dao.recuperer(id);
	}

	public ArrayList<Object> lireFichier(String chemin) {
		String description = FileUtils.getInstance().lire(chemin);
		String[] listeFilms = description.split("\n");
		ArrayList<Object> arrayList = new ArrayList<Object>();
		for(int i=0;i<listeFilms.length;i++){
			Film f = new Film(listeFilms[i]);
			arrayList.add(f);
		}
		return arrayList;
	}

	public void ecrire(String chemin, Object o) {
		Film film = (Film)o;
		FileUtils.getInstance().ecrire(chemin,film.toString());
	}

}
