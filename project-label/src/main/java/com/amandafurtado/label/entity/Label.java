package com.amandafurtado.label.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
//@Table(name = "labels2")
public class Label extends PanacheEntity {

	@NotBlank(message = "Code may not be blank")
//	@Column(name = "Label_Code")
	private String labelCode;

	@NotBlank(message = "Description may not be blank")
//	@Column(name = "Label_Description")
	private String labelDescription;
	
	public Long getId() {
		return id;
	}
	
	public void setLabelCode(Long id) {
		this.id = id;
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
