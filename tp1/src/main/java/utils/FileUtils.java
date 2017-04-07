package utils;


public class FileUtils {
	
	private static FileUtils Instance = null;
	
	private FileUtils(){
		try{
			
			
		}catch (Exception e){
			System.err.print(e);
			System.err.print("Lecture");
		}
		
	}
	
	public static FileUtils getInstance(){
		if(Instance == null){
			Instance = new FileUtils();
		}
		return Instance;
	}
	
	public String lire(String chemin){
		return "";
	}
	
	public void ecrire(String chemin, String data){
		
	}

}
