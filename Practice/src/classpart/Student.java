package classpart;

public class Student {				// class : 클래스를 만드는 예약어, Student : 클래스 이름
	
	// 멤버변수
	int studentId;				//학번			
	String studentName;			//학생 이름
	int grade;					//학년
	String address;				//사는곳
	
	//코딩컨벤션 클래스 이름은 대문자로 시작하자
	
	// 학생 이름과 주소 출력하는 메서드 만들기
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); 	//이름, 주소 출력
	}
	
	public String getStudentName() { 						//학생의 이름을 반환하는 메서드
		
		return studentName ;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		//System.out.println(studentAhn.getStudentName( ));
	}
	
	
}





