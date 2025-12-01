package Qspider;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class QFH3 {
public static void main(String[] args) throws IOException {
//	//Creating folder
//	File f=new File("Home3");
//	f.mkdir();
//	//Creating new text file
//	File f1=new File("Home4.txt");
//	
//	//Creating new text file inside the folder "Home3".
//	File f2=new File("C:\\Users\\Naresh\\eclipse-workspace\\FileHandling\\Home3\\Home3.txt");
//	
//	//writing the data into the file.
//	FileWriter fw= new FileWriter(f2);
//	fw.write("helo this is not possible sitting at home");
//	fw.flush(); //converts steam into data and stores in the file
//	fw.close(); //after using the file closing the file.
	
	//reading the data from the file
	FileReader fr=new FileReader("C:\\Users\\Naresh\\eclipse-workspace\\FileHandling\\Home3\\Home3.txt");
	int ch=fr.read();//Reading ASCII value
	while(ch>=0)
	{
		System.out.print((char)ch);//downcasting frmo int to char
		ch=fr.read();		
	}
	fr.close();	
}}
