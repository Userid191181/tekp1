package src;

public class EncapAssign {
private int accnum;
private String acchold;
private double balance;
//Encapsulation: create a class BankAccount with private fields account number, account holder name and balance. 
//Provide methods to deposit, withdraw and check balance.
public void setaccnum(int accnum){
	this.accnum=accnum;}
public void setacchold(String acchold){
	this.acchold=acchold;}
public void setbal(double balance){
	this.balance=balance;}

public int getaccnum() {
	return accnum;	}
public String getacchold(){
	return acchold;}
public double getbalance(){
	return balance;}

public static void main(String[] args) {
	EncapAssign e=new EncapAssign();
	e.setaccnum(123456789);
	e.setacchold("Hari");
	e.setbal(10000.50);
	System.out.println("Acc holder name is " +e.getacchold());
	System.out.println("Acc holder account number is " +e.accnum);
	System.out.println("Acc holder balance is " +e.getbalance());
}
}
