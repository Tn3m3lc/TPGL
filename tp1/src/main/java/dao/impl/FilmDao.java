package dao.impl;

import java.sql.*;

import utils.ConnexionBd;
import dao.inte.GeneralDao;
import model.impl.Film;

public class FilmDao implements GeneralDao {

	public void enregistrer(Object o) {
		Film film = (Film)o;
		
		try {
			// init connection + statement
			Connection connect = ConnexionBd.getInstance().creerConnexion("cb454580", "", false);
			DatabaseMetaData dbmd = connect.getMetaData();
			dbmd.getDefaultTransactionIsolation();
			connect.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
			Statement stmt = connect.createStatement();
			
			String query = "INSERT INTO FILM VALUES("+film.getId()+",'"+film.getNom()+"','"+film.getSortie().toString()+"')";
			stmt.executeQuery(query);
			
			// fermeture des objets
			stmt.close();
			connect.close();
			
		} catch (SQLException e) {
			// erreur connexion
			e.printStackTrace();
		}
		
		
	}

	public Object recuperer(String Id) {
		Film film = new Film();
		try {
			// init connection + statement
			Connection connect = ConnexionBd.getInstance().creerConnexion("cb454580", "", false);
			DatabaseMetaData dbmd = connect.getMetaData();
			dbmd.getDefaultTransactionIsolation();
			connect.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
			Statement stmt = connect.createStatement();
			
			// creation requete + recuperation resultat
			String query = "Select IdFilm,Nom,Sortie From Film Where IdFilm = "+Id;
			ResultSet res = stmt.executeQuery(query);
			
			// parse resultat dans une string 
			int columnCount = res.getMetaData().getColumnCount();
			String description = "";
			for(int i=1; i < columnCount+1; i++){
				description += (res.getString(i));
			}
			
			// fermeture des objets
			res.close();
			stmt.close();
			connect.close();
			
			film = new Film(description);
			
		} catch (SQLException e) {
			// erreur connexion
			e.printStackTrace();
		}
		
		return film;
	}

}
