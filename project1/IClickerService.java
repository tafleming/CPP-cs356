package edu.csupomona.cs356.project1;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * Service class for the IClicker. The class can be configured with a question,
 * and then can receive answer submissions from students.
 * @author Tim
 * @see SingleChoiceQuestion
 * @see MultiChoiceQuestion
 */
public class IClickerService {

	private HashMap<String, String> submissions;
	private HashMap<String, Integer> counts;
	private String type;
	private QuestionInterface currentQuestion;
	
	/**
	 * Constructor for the IClickerService class
	 * @param question The question to initialize the service with
	 */
	
	public IClickerService(QuestionInterface question) {
		submissions = new HashMap<String, String>();
		counts = new HashMap<String, Integer>();
		type = question.getQuestionType();
		currentQuestion = question;
	
	}
	
	
	/**
	 * Receives a submission from the student and adds it to the 
	 * hash map of received submissions. The functionality of the hash map
	 * causes old submissions to be overwritten if a student submits again.
	 * @param student The student to receive a submission from.
	 * @see Student
	 */
	public void receiveSubmission(Student student) {
		int value;
		submissions.put(student.getID(), student.getAnswer());
		
		if (counts.containsKey(student.getAnswer())) {
			value = counts.get(student.getAnswer());
			value++;
			counts.put(student.getAnswer(), value);
		} else {
			counts.put(student.getAnswer(), 1);
		}
		
	}
	/**
	 * Displays the results of the submissions.
	 */
	public void printResults() {
		//System.out.println(submissions.toString());
		System.out.print("The answers for the current question: ");
		currentQuestion.displayText();
		System.out.println();
		System.out.println(counts.toString());
		System.out.println();
		System.out.println("The correct answer is " + currentQuestion.getCorrectAnswer());
	}

}
