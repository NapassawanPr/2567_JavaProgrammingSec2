
public class TestStudents {

	public static void main(String[] args) {
		//Create two Student objects
		Student student1 = new Student();
		Student student2 = new Student();
				
		//Set student details
		student1.setStudentDetails("Siriyakorn", new double[] {85.0,78.0,92.5});
		student2.setStudentDetails("Sumsoo", new double[] {68.0,66.5});
				
		//Display student details
		System.out.println("Student 1 Details:");
		student1.displayStudentDetails();	
		
		System.out.println("\nStudent 2 Details:");
		student2.displayStudentDetails();
		
	}//end of main()
			



}