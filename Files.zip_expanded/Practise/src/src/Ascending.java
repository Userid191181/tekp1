package src;

public class Ascending {
	public static void main(String[] args) {
		int []a= {3,1,8,90,38,22};
		int temp=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
		    {
		    	if(a[j]<a[i])	
		    	{
		    	temp=a[i];
		        a[i]=a[j];
		        a[j]=temp;
		    	}
		    }
		    System.out.println(a[i]);
		}
	}

}
