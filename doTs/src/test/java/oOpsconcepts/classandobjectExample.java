package oOpsconcepts;

public class classandobjectExample {
	int empid;
	String empname;
	int salary;
	int depno;

	public void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(depno);
	}

	public static void main(String[] args) {

		classandobjectExample emp1 = new classandobjectExample();
		emp1.empid = 101;
		emp1.empname = "mouni";
		emp1.salary = 50000;
		emp1.depno = 10;
		emp1.display();

		classandobjectExample emp2 = new classandobjectExample();
		emp2.empid = 102;
		emp2.empname = "deepu";
		emp2.salary = 5000;
		emp2.depno = 11;
		emp2.display();

	}

}
