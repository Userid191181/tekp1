package OOPS;

public class FacebookUser {
	String uid;
	String pwd;
	
	FacebookUser(String uid, String pwd)
	{
		this.uid=uid; //this is used to refer to the current variable for the String created in line 4
		this.pwd=pwd; //this is used to refer to the current variable for the String created in line 5
	}	
	
	//create emp with emid and empname with argsconstructor
	public static void main(String[] args) {
		FacebookUser f=new FacebookUser("Samff", "Sam@12300");
			System.out.println("User id is " +f.uid);
			System.out.println("User pwd is " +f.pwd);
	}

}
