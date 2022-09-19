package com.amandafurtado.label.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

public class Label extends PanacheEntity{
	
	private String labelCode;
	private String labelDescription;

}
