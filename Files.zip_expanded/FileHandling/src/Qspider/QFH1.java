package Qspider;

import java.io.File;
import java.io.IOException;

public class QFH1 {
public static void main(String[] args) throws IOException {

File f1=new File("laptop1.txt");
//System.out.println(f.mkdir());	
File f2=new File("mobile1.txt");
System.out.println(f2.createNewFile());
//System.out.println(f2.exists());
}
}
