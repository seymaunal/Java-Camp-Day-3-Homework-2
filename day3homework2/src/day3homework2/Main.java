package day3homework2;

public class Main {

	public static void main(String[] args) {
		 
		Student student = new Student("Seyma","Unal","1seymaunal@gmail.com","a1b2c3",162211012 );

		Instructor instructor=new Instructor("Engin","Demirog","engin123@gmail.com","123","C#,Java");
		
		UserManager userManager=new UserManager();
		userManager.add(student);
		userManager.delete(student);
		userManager.update(student);
		
		
		StudentManager studentManager= new StudentManager();
		studentManager.login(student);
		
		InstructorManager instructorManager =new InstructorManager();
		instructorManager.login(instructor);
	}

}
