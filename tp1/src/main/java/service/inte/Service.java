package service.inte;

import java.util.ArrayList;

public interface Service {
	public abstract void sauvegarder(Object o);
	
	public abstract Object extraire(String id);
	
	public abstract ArrayList<Object> lireFichier(String chemin);
	
	public abstract void ecrire(String chemin,Object o);
}
