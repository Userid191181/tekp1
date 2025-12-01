package src;

public class EncapAssignStudent {

		private int rollnum;
		private String stuname;
		private char grade;

		public void setrollnum(int rollnum){
			this.rollnum=rollnum;}
		public void setstuname(String stuname){
			this.stuname=stuname;}
		public void setgrade(char grade){
			this.grade=grade;}

		public int getrollnum() {
			return rollnum;	}
		public String getstuname(){
			return stuname;}
		public char getgrade(){
			return grade;}

		public static void main(String[] args) {
			EncapAssignStudent e=new EncapAssignStudent();
			e.setrollnum(19);
			e.setstuname("Hari");
			e.setgrade('A');
			System.out.println("Student name is " +e.getstuname());
			System.out.println("Student roll number is " +e.rollnum);
			System.out.println("Student grade is " +e.getgrade());
		}
	
}
