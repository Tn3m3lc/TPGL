package dao.inte;
import service.inte.Service;

public interface GeneralDao {

	public abstract void enregistrer(Object o);
	
	public abstract Object recuperer();
}
