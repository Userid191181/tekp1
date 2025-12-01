package Qspider;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class QFH2 {
public static void main(String[] args) throws IOException {
	File f=new File("qspider.txt");
//	FileWriter fw=new FileWriter(f);
//	fw.write("hello1234567890"); //converts data in to sream (set of binary values)
//	fw.flush(); //converts streamin to data and it stores in to the file
//	fw.close(); // after using the file we need to close the file
	
	//reading the file
	FileReader fw1=new FileReader(f);
	int c=fw1.read(); //this will ASCCII values and return integer type
	while(c>=0)
	{
		System.out.print((char)c); //downcasting from int to char
		c=fw1.read();
	}
	fw1.close();
		
}
}
