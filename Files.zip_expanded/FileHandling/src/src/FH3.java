package src;

import java.io.File;
import java.io.IOException;

public class FH3 {
public static void main(String[] args) {
	//Create the file //	Write data in the file //	Read data frm the file //	Rename the file //	Delete the file
	
//	String fileName="output.txt";
//	File filecreation=new File(fileName);
//	try {
//		filecreation.createNewFile();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}	
//	
	File createfile = new File("C:\\createfolder");
	boolean create=createfile.mkdir();
	
	if(create)
	{
		System.out.println("folder created");
	}
	else
	{
		System.out.println("file not created");
	}
	
	File oldfolder=new File("C:\\createfolder");
	File newfolder=new File("C:\\updatedcreatefolder");
	boolean updatefolder=oldfolder.renameTo(newfolder);
	if(updatefolder)
	{
		System.out.println("folder is renamed");
	}
	else
		System.out.println("folder is NOT renamed");
	
	
}
}
