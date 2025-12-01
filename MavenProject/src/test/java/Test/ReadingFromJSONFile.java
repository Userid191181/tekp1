package Test;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadingFromJSONFile {

	public static void main(String[] args) throws Throwable {
		//Step1: Get the JSON Physical file parse to JSON Java Object using JSONParse class OR Parse JSON physical file in to JAVA object using JSON Parse class
		JSONParser parser=new JSONParser();
		//Object obj= parser.parse(new FileReader("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\jsonCommonData.json"));
		Object obj = parser.parse(new FileReader(""));
		
		//Step2: Transfering data from JAVA obj to JSONObject so that I can capture data using get method. OR converting java object in to JSONObject using downcasting.
		JSONObject map = (JSONObject) obj; //downcasting
		System.out.println(map.get("url"));
		System.out.println(map.get("browser"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
	}
}
