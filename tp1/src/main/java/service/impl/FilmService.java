package service.impl;

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

	public Object lireFichier(String chemin) {
		String description = FileUtils.getInstance().lire(chemin);
		return new Film(description);
	}

	public void ecrire(String chemin, Object o) {
		Film film = (Film)o;
		FileUtils.getInstance().ecrire(chemin,film.toString());
	}


}
