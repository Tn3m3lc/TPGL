package service.inte;

public interface Service {
	public abstract void sauvegarder(Object o);
	
	public abstract Object extraire(String id);
	
	public abstract Object lireFichier(String chemin);
	
	public abstract void ecrire(String chemin,Object o);
}
