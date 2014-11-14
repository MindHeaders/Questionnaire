package org.data.art.entities;

import java.util.List;

public class User extends Person{
	private List<Questionnaire> started;
	private List<Questionnaire> completed;
	public List<Questionnaire> getStarted() {
		return started;
	}
	public void setStarted(List<Questionnaire> started) {
		this.started = started;
	}
	public List<Questionnaire> getCompleted() {
		return completed;
	}
	public void setCompleted(List<Questionnaire> completed) {
		this.completed = completed;
	}
	
}
