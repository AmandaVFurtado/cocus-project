package com.amandafurtado.label.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import com.amandafurtado.label.entity.Label;

//para que a classe seja injetada direto no Resource sem a necessidade de ser instanciada//
@ApplicationScoped
public class LabelService {
	
	public List<Label> listLabel() {
		return Label.listAll();
	}
	
	@Transactional
	public Label save(Label label) {
		Label labels = new Label();
		labels.setLabelCode(labels.getLabelCode());
		labels.setLabelDescription(labels.getLabelDescription());
		
		labels.persist();
		return labels;
	}
	
	

}
