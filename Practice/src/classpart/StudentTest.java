package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student(  ); // Student클래스 생성
		student1.studentName = "안연수"; //첫번째 학생 생성
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student(  ); // Student클래스 생성
		student2.studentName = "안승연"; //두번째 학생 생성
		System.out.println(student2.getStudentName());
	}

}
