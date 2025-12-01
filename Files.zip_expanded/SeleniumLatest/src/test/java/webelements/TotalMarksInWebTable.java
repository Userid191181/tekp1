package webelements;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;

public class TotalMarksInWebTable {
public static void main(String[] args) throws InterruptedException {
//Adding the total of the Table and it with Total amt shown in the webpage.
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("file:///C:/OLDDATA/BackUPCDrive/SELENIUM/QSpider-Selenium/table.html"); 
//        WebElement table = driver.findElement(By.xpath("//table"));
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//        int sum = 0;
//       System.out.println(rows.size());
//        for (int i=1; i<rows.size() - 1; i++)
//        {
//            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
//            String marksText = cells.get(2).getText();
//            int marks = Integer.parseInt(marksText);
//            sum = sum+marks;
//        }
//        String str = driver.findElement(By.xpath("//tr[7]/td[3]")).getText();
//        int total = Integer.parseInt(str);
//    
//        System.out.println("Calculated Marks is" + sum);
//        System.out.println("Total is" + total);
//
//        if (sum == total) 
//        {
//            System.out.println("Total matches sum");
//        } else 
//        {
//            System.out.println("Total does not match");
//        }
	
	WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("file:///C:/OLDDATA/BackUPCDrive/SELENIUM/QSpider-Selenium/table.html");
  List<WebElement> marks = driver.findElements(By.xpath("//tr/td[3]"));
  int sum=0;
  for(int i=0; i<marks.size()-1;i++)
  {
	  WebElement m=marks.get(i);
	 // System.out.println(m.getText());
	 int m1= Integer.parseInt(m.getText());	  
	  
	  sum=sum+m1;
  }
  System.out.println("Added numbers in each row " +sum);
  
  String t1 = driver.findElement(By.xpath("//tr[7]/td[3]")).getText();
  int tt=Integer.parseInt(t1);
  System.out.println("Total calculated is " +tt);
  
  if(sum==tt)
  {
	  System.out.println("Total amount and added amount are same");
  }
  else
  {
	  System.out.println("Total amount and added amount are not same");
  }
//  for(WebElement m:marks)
//  {
//	  System.out.println(m.getText());
//  } 
    }
}
