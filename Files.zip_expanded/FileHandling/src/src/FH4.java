package src;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FH4 {


public static void main(String[] args) {
		
			File oldfolder=new File("C:\\createfolder");  
			boolean createfol=oldfolder.mkdir();
			if(createfol)
			{
				System.out.println("newfol created");
			}
			else 
				System.out.println("new fol not created");
	
			File newfol=new File("C:\\updatedcreatefolder");
			boolean newf=oldfolder.renameTo(newfol);
//			if(newf)
//			{
//				System.out.println("new f updated");
//			}
//			else
//				System.out.println("update not done");
	
			
}		  
}