package assignment2;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;

public class Searchnonrecursively {

	public static void main(String[] args) {
		File root = new File("c:\\test");

	    try {
	        String[] extensions = {"txt"};
	        boolean recursive = true;


	        Object FileUtils;
			Collection files = ((Object1) FileUtils).listFiles(root, extensions, recursive);

	        for (Iterator iterator = files.iterator(); iterator.hasNext();) {
	            File file = (File) iterator.next();
	            System.out.println(file.getAbsolutePath());
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
