package test3_wdhl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;


public class fFiles {

	public static void createFiles(String baseDir, int subDirs){
		File f = new File(baseDir+"\\hallo.txt");
		File newFile = new File(baseDir+"\\sub\\");
		FileWriter w = null;
		try {
			w = new FileWriter(f);
			w.write("Hallo Welt!");
			newFile.mkdir();
			
			w.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		int i = 1;
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(i++, newFile.getAbsoluteFile().toString());
		if(subDirs > 0){
			createFiles(newFile.getAbsolutePath(),subDirs-1);
		}
		printFileNames(ht);
	}
	public static void printFileNames(Hashtable<Integer,String> ht){
		for(int i = 1;i<ht.size();i++){
			System.out.println(ht.get(i));
		}
	}
	
	public static void main(String []args){
		createFiles("C:\\Users\\Dominic\\Documents",5);
	}
}
