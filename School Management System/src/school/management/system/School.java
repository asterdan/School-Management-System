package school.management.system;

import java.util.List;

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	
	public School(List<Teacher> teacher, List<Student> student) {
		super();
		this.teachers = teacher;
		this.students = student;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}


	public List<Teacher> getTeacher() {
		return teachers;
	}


	public void setTeacher(List<Teacher> teacher) {
		this.teachers = teacher;
	}


	public List<Student> getStudent() {
		return students;
	}


	public void setStudent(List<Student> student) {
		this.students = student;
	}


	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}


	public void setTotalMoneyEarned(int totalMoneyEarned) {
		this.totalMoneyEarned = totalMoneyEarned;
	}


	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}


	public void setTotalMoneySpent(int totalMoneySpent) {
		this.totalMoneySpent = totalMoneySpent;
	}
	
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
	
	
	public void removeStudent(int id) {
		for (Student t : this.students) {
			if (id == t.getId()) {
				this.students.remove(t);
			}
		}
	}
	
	public void removeTeacher(int id) {
		for (Teacher s : this.teachers) {
			if (s.getId() == id) {
				this.teachers.remove(s);
			}
		}
	}
	
	
	
	
	

}
