package src;

public class InheritanceEmpDriver {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.name="Hari";
		m.sal=3000.30;
		m.dept="IT";
		System.out.println("Name of emp is "+m.name);
		System.out.println("Emp salary is " +m.sal);
		System.out.println("Dept is " +m.dept);
	}

}
