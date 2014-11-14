package org.data.art.entities;

import java.util.List;

public class Questionnaire {
	private int id;
	private String name;
	private String description;
	private boolean isPublished;
	private boolean isModifiable;
	private List<Question> questions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPublished() {
		return isPublished;
	}
	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public boolean isModifiable() {
		return isModifiable;
	}
	public void setModifiable(boolean isModifiable) {
		this.isModifiable = isModifiable;
	}
}
