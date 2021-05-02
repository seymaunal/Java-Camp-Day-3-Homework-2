package day3homework2;

public class Student extends User {
	
	private int studentNo;
	
	public Student(String firstName, String lastName, String email, String password, int studentNo){
		super(firstName, lastName, email, password);
		this.studentNo = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

}
