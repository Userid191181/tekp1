package src;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FH1 {
//	Create a Folder //	Check if a folder exists //	Rename a folder //	delete a folder // //	-----
//	Create the file //	Write data in the file //	Rad data frm the file //	Rename the file //	Delete the file

	//Creating the folder	
	
	public static void main(String[] args) {
		File foldername=new File("C:\\newFolder");
		boolean created=foldername.mkdir();
		
		if(created)
		{
			System.out.println("folder created");
		}
		else
			System.out.println("foder not created");
		
		File oldfolder=new File("C:\\newFolder");
		File newfolder=new File("C:\\UPDATEDFolder");
		
		boolean rename=oldfolder.renameTo(newfolder);
		if(rename)
		{
			System.out.println("renamed");
		}
		else
		{
			System.out.println("notrenamed");
		}
		
		if(newfolder.exists())
		{
			newfolder.delete();
			System.out.println("folder deleted");
		}
		else
		{
			System.out.println("folder not deleted");
		}
	}
}
