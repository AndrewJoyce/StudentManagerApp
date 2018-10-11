package ie.gmit.studentmanager;
import java.util.ArrayList;

public class StudentManager {
	
	List<Student> students;
	
	public StudentManager() {
		students = new ArrayList<Student>();
		}
	
	public boolean addStudent(Student student) {
		try {
			return students.add(student);
		}catch(Exception error) {
			error.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteStudent(String studentId) {
		Student student = getStudentById(studentId);
		if(student ! = null) {
			return students.remove(student);
		}else {
			return false;
		}
	}
	
	public Student getStudentById(String studentId) {
		for(Students student: students) {
			if(student.getStudentId().equals(studentId)) {
				return student;
			}
		}
		return null;
	}
	
}





