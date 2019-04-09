package school.management.system;

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	
	
	public Teacher() {
	}

	public Teacher(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	public void receiveSalary(int salary) {
		this.salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	

}
