package dao.inte;
import service.inte.Service;
import utils.ConnexionBd;

public interface GeneralDao {

	public abstract void enregistrer(Object o);
	
	public abstract Object recuperer(String Id);
}
