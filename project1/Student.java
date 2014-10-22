package edu.csupomona.cs356.project1;

/**
 * Class that represents a student for the IClicker service.
 * Each student has an ID and an answer to submit to the service.
 * @author Tim
 *
 */
public class Student {

	private final String studentID;
	private String answer;
	
	/**
	 * Constructor for the class which initializes the student ID.
	 * Once set, the student ID cannot be changed.
	 * @param id The ID for the student.
	 */
	public Student(String id) {
		studentID = id;
	}
	
	/**
	 * Sets the answer for the current question for the student.
	 * @param answer The answer to set for the student.
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * Returns the student's ID as a string.
	 * @return The student's ID.
	 */
	public String getID() {
		return studentID;
	}
	
	/**
	 * Returns the student's answer as a String.
	 * @return the student's answer.
	 */
	public String getAnswer() {
		return answer;
	}
	
	/**
	 * Submits the student's answer to the IClicker service.
	 * @param service The service to submit the answer to.
	 */
	void submitAnswer(IClickerService service) {
		service.receiveSubmission(this);
		
	}
}
