package school.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<Student>();
		List<Teacher> teachers = new ArrayList<Teacher>();
		School school = new School(teachers,students);
		Scanner input = new Scanner(System.in);
		char c = 'a';
		while (c != 'q') {
			System.out.println("1.Add Student");
			System.out.println("2.Add Teacher");
			System.out.println("3.Pay Student Fees");
			System.out.println("4.Pay Teacher Salary");
			System.out.println("5.See total money earned!");
			
			char i = input.next().charAt(0);
			
			switch(i) {
			case '1':
				Student s = new Student();
				System.out.println("Enter student id:");
				s.setId(input.nextInt());
				System.out.println("Enter student name:");
				s.setName(input.next());
				System.out.println("Enter student grade:");
				s.setGrade(input.nextInt());
				school.addStudent(s);
				System.out.println("Student added!");
				break;
			case '2':
				Teacher t = new Teacher();
				System.out.println("Enter teacher id:");
				t.setId(input.nextInt());
				System.out.println("Enter teacher name:");
				t.setName(input.next());
				System.out.println("Enter teacher salary:");
				t.setSalary(input.nextInt());
				school.addTeacher(t);
				System.out.println("Teacher added!");
				break;

			case '3':
				for (Student st : school.getStudent()) {
					st.payFees(5000);
				}
				System.out.println("Student payed the fees!");
				break;

			case '4':
				for (Teacher tt : school.getTeacher()) {
					tt.receiveSalary(tt.getSalary());
				}
				System.out.println("Teachers salary payed!");
				break;
			case '5':
				System.out.println(school.getTotalMoneyEarned());
				break;
			}
			
			System.out.println("Do you want to continue:");
			c = input.next().charAt(0);
			
	     }
	}

}
