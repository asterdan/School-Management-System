package school.management.system;

public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	
	

	public Student() {
	}

	public Student(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public Student(int id, String name, int grade, int feesPaid, int feesTotal) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = feesPaid;
		this.feesTotal = feesTotal;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public void setGrade(int grade)
	{
		this.grade = grade;
	}
	


	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
	
	public void payFees(int fees)
	{
	   this.feesPaid += fees;
	   School.updateTotalMoneyEarned(feesPaid);
	}
	
	
	public int getRemainingFees() {
		return this.feesTotal - this.feesPaid;
	}
	
	
	

}
