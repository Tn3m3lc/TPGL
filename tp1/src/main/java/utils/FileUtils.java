package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileUtils {
	
	private static FileUtils Instance = null;
	
	private FileUtils(){
		
	}
	
	public static FileUtils getInstance(){
		if(Instance == null){
			Instance = new FileUtils();
		}
		return Instance;
	}
	
	public String lire(String chemin){
		String data = "";
		try {
			BufferedReader ficTexte = new BufferedReader(new FileReader(new File(chemin)));
			String ligne;
			while ((ligne=ficTexte.readLine())!=null){
				data+=ligne;
			}
			
			ficTexte.close();
			
		} catch (IOException e) {
			// fichier non trouver
			e.printStackTrace();
		}
		
		return data;
	}
	
	public void ecrire(String chemin, String data){
		try {
			BufferedWriter ficTexte = new BufferedWriter(new FileWriter(new File(chemin)));
			
			ficTexte.write(data);
			
			ficTexte.close();
		} catch (IOException e) {
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}

	}

}
