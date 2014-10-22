package edu.csupomona.cs356.project1;
/**
 * Interface for the questions used in the IClicker service.
 * The methods here are applicable to any kind of question, single
 * or multi choice. 
 * @author Tim
 *
 */
public interface QuestionInterface {
	
	/**
	 * Adds a possible answer to the candidate answers.
	 */
	public abstract void addPossibleAnswer(String answer);
	
	/**
	 * Returns the type (single, multi) of the question.
	 */
	public abstract String getQuestionType();
	
	/**
	 * Outputs the question text to the console.
	 */
	public abstract void displayText();
	
	/**
	 * Returns the total number of possible answers.
	 */
	public abstract int getNumberOfAnswers();
	
	/**
	 * Returns the correct answer(s) as a string. 
	 */
	public abstract String getCorrectAnswer();

}