package edu.csupomona.cs356.project1;

import java.util.Random;
/**
 * Main class to run the program. The main method creates a question, initializes
 * a number of students and randomly assigns them IDs and answers, and submits the students 
 * to the IClicker Service. The service then displays the results of the submissions. 
 * @author Tim
 *
 */
public class SimulationDriver {
	
	private static final int size = 20;
	private static final String text = "Which animated Disney movie was released in 1991?";
	private static final String[] answers = {"Aladdin", "The Lion King", "Beauty and the Beast", "The Little Mermaid", "Pocahontas"};
	
	private static void createStudents(Student[] students) {
		
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			students[i] = new Student(String.valueOf(rand.nextInt(100000) + 100000));
			students[i].setAnswer(answers[rand.nextInt(answers.length)]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Student[] students = new Student[size];
		QuestionInterface newQuestion = new SingleChoiceQuestion(text, answers[2]);
		createStudents(students);
		IClickerService service = new  IClickerService(newQuestion);
		
		for (int i = 0; i < size; i++) {
			service.receiveSubmission(students[i]);
		}
		
		service.printResults();
	}
}
