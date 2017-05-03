package model.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Film {
	private String Nom;
	private Date Sortie;
	private String Id;
	
	public Film(){
		Id = "";
		Nom = "";
		Sortie = new Date();
	}
	
	public Film(String Description){
		int numAtt = 0;
		String valeur = "";
		
		for(int i = 0 ; i<Description.length();i++){
			char c = Description.charAt(i);
			if(c == ';'){
				setAttribut(numAtt,valeur);
				valeur = "";
				numAtt++;
			}else{
				valeur += c;
			}
		}
		
	}
	
	public String getNom(){
		return Nom;
	}
	
	public Date getSortie(){
		return Sortie;
	}
	
	public String getId(){
		return Id;
	}
	
	public void setNom(String NewNom){
		Nom = NewNom;
	}
	
	public void setSortie(Date NewSortie){
		Sortie = NewSortie;
	}
	
	public void setId(String NewId){
		Id = NewId;
	}
	
	private void setAttribut(int Index,String Valeur){
		switch(Index){
			case 0:
				setId(Valeur);
			break;
			case 1:
				setNom(Valeur);
				break;
			case 2:
				try {
					setSortie(DateFormat.getInstance().parse(Valeur));
				} catch (ParseException e) {
					// format invalide
					e.printStackTrace();
				}
				break;
		}
	}
	@Override
	public String toString(){
		return Id+";"+Nom+";"+Sortie.toString();
	}
	
	

}
