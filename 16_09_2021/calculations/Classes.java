package calculations;

public class Classes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setPerson("shivam", 23, 65);
		p1.DispPerson();

		Employee e1 = new Employee();
		e1.setEmp("sagar", 23, 68, 30000);
		e1.DispEmp();
	}
}

class Person {
	String strName;
	int age;
	float wt;

	public void setPerson(String nm, int ag, float wt) {
		this.strName = nm;
		this.age = ag;
		this.wt = wt;
	}

	public void DispPerson() {
		System.out.println(this.strName + " " + this.age + " " + this.wt);
	}
}

class Employee extends Person {
	int salary;

	public void setEmp(String nm, int ag, float wt, int sl) {
		this.setPerson(nm, ag, wt);
		this.salary = sl;
	}

	public void DispEmp() {
		this.DispPerson();
		System.out.println(salary);
	}
}
