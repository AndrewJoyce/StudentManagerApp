package ie.gmit.studentmanager;

public class StudentManager {
	//set initial capacity constant for the array. Before you create
	//array you need to know the size.
	private static final int INITIAL_CAPACITY = 10;
	//creates array to hold student objects
	private Student[] students = null;
	//constructor - instantiate students array
	public StudentManager() {
		students = new Student[INITIAL_CAPACITY];
		}
	//creates method you may need to stub them out
	//stub meaning a mock implementation
	//checks if student added
	public boolean addStudent(Student student) {
		return false;
	}
	//checks for student id
	public boolean deleteStudent(String studentId) {
		return false;
	}
	//finds students by first name 
	public Student[] getStudentByFirstName(String firstName) {
		return null;
	}
	//total number of students in array
	public int findTotalStudents() {
		return -1;
	}
	
}

// test git commit repo..
