package Arrays;

public class MutiArray {
public static void main(String[] args) {
	int[][] a=new int[3][2]; //3 rows and 2 columns
	System.out.println("Length of the rows are " +a.length); //length can be found using the row numbers only ex: there are 3 rows
	System.out.println("Length of column " +a[0].length);
	a[0][0]=10;
	a[0][1]=11;
	System.out.println(a[0][0]);
	System.out.println(a[0][1]);
	for(int i=0; i<a.length-1;i++)
	{
		for(int j=0; j<a.length-1; j++)
		{
			System.out.println(a[i][j]);
		}
		
	}
	
	
//	int [][] b= {{0,0,0}, {1,1,1}}; //2nd way of declaring 2d array
//	System.out.println(b.length);
//	System.out.println(b[0].length);
}
}
