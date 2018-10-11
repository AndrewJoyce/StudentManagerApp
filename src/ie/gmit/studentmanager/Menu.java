package ie.gmit.studentmanager;
import java.util;
import java.util.Scanner;

public class Menu {
	private Scanner userInput;
	private StudentManager stMan;
	private boolean keepRun = true;
	
	public void start() {
		userInput = new Scanner(System.in);
		stMan = new StudentManager();
		
		while(keppRun) {
			//menu options here
			
			int userMenuOption = userInput.nextInt(); // unprotected code
		}
	}
	
	

}

