package src;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Create a Folder //	Check if a folder exists //	Rename a folder //	delete a folder // //	-----



public class FH2 
{
		public static void main(String[] args) {

			 // Specify the path for the new folder	            
	        File folder = new File("C:\\MyNewFolder");

	        // Create the directory
	        boolean created = folder.mkdir(); // Creates a single directory
	        // Use folder.mkdirs(); to create parent directories if they don't exist

	        if (created) {
	            System.out.println("Folder created successfully: " + folder.getAbsolutePath());
	        } else {
	            System.out.println("Failed to create folder or it already exists: " + folder.getAbsolutePath());
	        }

	
			
	}
}