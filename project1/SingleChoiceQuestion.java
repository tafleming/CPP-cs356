package edu.csupomona.cs356.project1;

import java.util.ArrayList;

public class SingleChoiceQuestion implements QuestionInterface {

	private String questionText;
	private ArrayList<String> candidateAnswers;
	private String type;
	private String correctAnswer;
	/**
	 * Constructor for the class.
	 * @param text The question text
	 * @param answer The correct answer for the question.
	 */
	public SingleChoiceQuestion(String text, String answer) {
		questionText = text;
		candidateAnswers = new ArrayList<String>();
		type = "single";
		correctAnswer = answer;
	}
	
	@Override
	public String getCorrectAnswer() {
		return correctAnswer;
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
