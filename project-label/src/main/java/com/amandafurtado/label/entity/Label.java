package com.amandafurtado.label.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Label extends PanacheEntity {

	@Column
	private String labelCode;

	@Column
	private String labelDescription;

}
