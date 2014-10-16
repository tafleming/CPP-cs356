package edu.csupomona.cs356.project1;

import java.util.HashMap;
import java.util.ArrayList;
public class IClickerService {

	private HashMap<String, String[]> submissions;
	private ArrayList answers;
	private String type;
	
	public IClickerService(Question question) {
		submissions = new HashMap<String, String[]>();
		answers = new ArrayList();
		
	}
	
	private void getQuestionType(Question question) {
		type = question.getQuestionType();
	}
	
	public void getAnswers(String[] possibleAnswers) {
		for (int i = 0; i < possibleAnswers.length; i++) {
			answers.add(possibleAnswers[i]);
		}
	}
	
	public void getAnswers(String answer) {
		answers.add(answer);
		
	}
	public void receiveSubmission(Student student) {
		submissions.put(student.getID(), student.getAnswer());
		
	}

}
