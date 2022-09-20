package com.amandafurtado.label.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Label extends PanacheEntity {

	@Column(name = "Label Code")
	private String labelCode;

	@Column(name = "Label Description")
	private String labelDescription;

	public String getLabelCode() {
		return labelCode;
	}

	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	public String getLabelDescription() {
		return labelDescription;
	}

	public void setLabelDescription(String labelDescription) {
		this.labelDescription = labelDescription;
	}

}
