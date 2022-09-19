package com.amandafurtado.label.entity;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Label extends PanacheEntity{
	
	private String labelCode;
	private String labelDescription;

}
