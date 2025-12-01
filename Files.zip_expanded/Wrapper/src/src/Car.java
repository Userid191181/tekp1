package src;
//import java.util.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

class CarDetails implements Comparable 
{
	int price;
	String carName;
	public CarDetails(int price, String carName) 
	{
		super();
		this.price=price;
		this.carName=carName;
	}

	public int  compareTo(Object obj)
	{
		CarDetails nb=(CarDetails)obj;
		//		if(this.price==nb.price)
		//			return 0;
		//		if(this.price>nb.price)
		//			return 1;
		//		return -1;
		return this.price-nb.price; //int
		//return this.carName.compareTo(nb.carName);
	}

	@Override
	public String toString() 
	{
		return "CarDetails [price=" +price +", carName="  +carName +"]";
	}
}
public class Car
{
	public static void main(String[] args) 
		{
				CarDetails c1=new CarDetails (300000, "Tata");
				CarDetails c2=new CarDetails (100000, "Nano");
				CarDetails c3=new CarDetails (500000, "Swift");
				CarDetails c4=new CarDetails (200000, "NExon");
		
				CarDetails[] car=new CarDetails[5];
				car[0] = c1;
				car[1] = c1;
				car[2] = c1;
				car[3] = c1;
				car[4] = new CarDetails(700000, "Swift Desire");
				Arrays.sort(car);
						for(CarDetails c :car) 
						{
							System.out.println(c);
						}		}}
