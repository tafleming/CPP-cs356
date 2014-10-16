package edu.csupomona.cs356.project1;

public class Student {

	private String studentID;
	private String[] answer;
	
	public Student(String id) {
		studentID = id;
	}
	
	public void setID(String id) {
		studentID = id;
	}
	
	public void setAnswer(String[] answer) {
		this.answer = answer;
	}
	public String getID() {
		return studentID;
	}
	
	public String[] getAnswer() {
		return answer;
	}
	
	void submitAnswer(IClickerService service) {
		service.receiveSubmission(this);
		
	}
}
