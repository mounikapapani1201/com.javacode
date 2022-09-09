package oOpsconcepts;

public class consTrructor {

	int empid;
	String empname;
	int salary;
	int depno;

	consTrructor(int id, String name, int sal, int dno) {
		empid = id;
		empname = name;
		salary = sal;
		depno= dno;

	}

	public void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(depno);
	}

	public static void main(String[] args) {
		consTrructor emp = new consTrructor(101, "raj", 10000, 12);
		emp.display();

	}
}