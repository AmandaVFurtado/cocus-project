package com.amandafurtado.label.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
//@Table(name = "labels")
public class Label extends PanacheEntity {

//	@Column(name = "Label_Code")
	private String labelCode;

//	@Column(name = "Label_Description")
	private String labelDescription;
	
	public Long getId() {
		return id;
	}

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
