package SeleniumLocators;

public class Test8 
{
public static void main(String[] args)
{
					 int[] a={4,2,4,7,9,3,8,7};
				
				     for(int i=0; i<a.length;i++)
				     {
				         for(int j=i+1; j<a.length; j++)
				         {
				             if(a[i]==a[j])
				             {
				             System.out.println(a[i]);
				             }
				         }
				
				     }

 }
 }

