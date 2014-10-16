package edu.csupomona.cs356.project1;

public class Question {
	
	private String questionText;
	protected String[] correctAnswer;
	protected String[] possibleAnswers;
	
	protected String type;
	
	public Question(String text, String[] choices, String answer) {
		questionText = text;
		possibleAnswers = choices;
		
	}
	public String[] getCorrectAnswers() {
		return correctAnswer;
		
	}

	
	
	public void setCorrectAnswer(String[] answers) {
		correctAnswer = answers;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void disp() {
		System.out.println(correctAnswer[0]);
		//System.out.println(incorrectAnswer[0]);
	}
	
	public String getQuestionType() {
		return type;
	}
}
