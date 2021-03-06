package utils;
import java.sql.*;

public class ConnexionBd {
	
	private static ConnexionBd Instance = null;
	private String utilisateur = "cb454580";
	private String password = "cb454580";
	private boolean exterieur = false;
	
	private ConnexionBd(){
		
	}
	
	public static ConnexionBd getInstance(){
		if(Instance == null){
			Instance = new ConnexionBd();
		}
		return Instance;
	}
	
	public Connection creerConnexion() throws SQLException{
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Bloc catch généré automatiquement
				e.printStackTrace();
			}
			if(!exterieur){
				return DriverManager.getConnection("jdbc:oracle:thin:@butor:1521:ensb2016",utilisateur,password);
			}else{
				return DriverManager.getConnection("jdbc:oracle:thin:@ufrsciencestech.u-bourgogne.fr:25561:ensb2016",utilisateur,password);
			}
	}
	
}
