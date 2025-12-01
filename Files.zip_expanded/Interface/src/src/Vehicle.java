package src;
interface Vehicle 
{
	void start();
	void stop();
}
class Car implements Vehicle
{
	String cname;
	Car(String cname)
	{
		this.cname=cname;
	}
	@Override
	public void start() {
		System.out.println("Start of Car" +cname);		
	}
	@Override
	public void stop() {
		System.out.println("Stop of Car" +cname);	
	}	
}
class Cycle implements Vehicle
{
	String cyname;
	Cycle(String cyname)
	{
		this.cyname=cyname;
	}
	@Override
	public void start() {
		System.out.println("Start of Cycle" +cyname);		
	}
	@Override
	public void stop() {
		System.out.println("Stop of Cycle" +cyname);	
	}	}