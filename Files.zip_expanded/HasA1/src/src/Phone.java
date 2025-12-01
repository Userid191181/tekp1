package src;

public class Phone {
	private String modelName;
	public String getmodelName()
	{
		return modelName;
	}
	
	public void setModelName(String modelName)
	{
		this.modelName=modelName;
	}
	
	public Phone(String modelName)
	{
		super();
		this.modelName=modelName;
	}	
	private Sim s=new Sim(1234567890);
	public Sim getSim()
	{
		return s;
	}
}
