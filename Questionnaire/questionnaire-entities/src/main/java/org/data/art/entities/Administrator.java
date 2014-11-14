package org.data.art.entities;

import java.util.List;

public class Administrator extends Person{
	private List<Questionnaire> created;
	public List<Questionnaire> getCreated() {
		return created;
	}
	public void setCreated(List<Questionnaire> created) {
		this.created = created;
	}
}
