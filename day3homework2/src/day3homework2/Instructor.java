package day3homework2;

public class Instructor extends User {
	
	private String branch;

	public Instructor(String firstName, String lastName, String email, String password, String branch) {
		super(firstName, lastName, email, password);
		this.branch = branch;
	}

	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}

