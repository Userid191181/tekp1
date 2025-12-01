package Test;

import java.util.Random;
import java.util.stream.DoubleStream;

public class RandomNumber {

public static void main(String[] args) {

int n=5; //generates random characters of length 5
String Alphanum= "ABCED12345abcde"; //considers this data only to generate the random alphanum characgters
StringBuilder sb=new StringBuilder(n);
		for(int i=0; i<n; i++)
		{
		int id=(int)(Alphanum.length()* Math.random());
		sb.append(Alphanum.charAt(id));
		}
System.out.println(sb);

}

}
