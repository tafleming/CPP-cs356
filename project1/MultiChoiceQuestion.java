package edu.csupomona.cs356.project1;

import java.util.ArrayList;

/**
 * Class for a multi-choice question, which has more than one possible correct 
 * answer.
 * @author Tim
 *
 */
public class MultiChoiceQuestion implements QuestionInterface {

	private String questionText;
	private ArrayList<String> candidateAnswers;
	private String type;
	private String[] correctAnswers;
	
	/**
	 * Constructor for the class
	 * @param text The question text.
	 * @param answer An array containing the correct answers.
	 */
	public MultiChoiceQuestion(String text, String[] answer) {
		questionText = text;
		candidateAnswers = new ArrayList<String>();
		type = "single";
		correctAnswers = answer;
	}
	
	@Override
	public String getCorrectAnswer() {
		String theAnswers = "";
		for (int i = 0; i < correctAnswers.length; i++) {
			theAnswers.concat(correctAnswers[i]);
		}
		return theAnswers;
	}
	
	@Override
	public void addPossibleAnswer(String answer) {
		candidateAnswers.add(answer);
		
	}
	
	@Override
	public int getNumberOfAnswers() {
		return candidateAnswers.size();
	}
	
	@Override
	public String getQuestionType() {
		return type;
	}
	
	@Override
	public void displayText() {
		System.out.println(questionText);
		
	}

	
	
	
}
	

