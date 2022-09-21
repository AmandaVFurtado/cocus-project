package com.amandafurtado.label.service;

import java.util.List;
import java.util.Optional;

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
	public Label findById(Long id) {

		Label label = findById(id);
		return label;
	}
	
	@Transactional
	public Label save(Label label) {
		Label labels = new Label();
		labels.setLabelCode(labels.getLabelCode());
		labels.setLabelDescription(labels.getLabelDescription());
		
		labels.persist();
		return labels;
	}
	
	@Transactional
	public void update(Long id, Label label) {
		
		Label labels = new Label();
		
		Optional<Label> labelOp = label.findByIdOptional(id);
		
		if (labelOp.isEmpty()) {
			throw new NullPointerException("Label not found");
		}
		labels = labelOp.get();
		labels.setLabelCode(label.getLabelCode());
		labels.setLabelDescription(label.getLabelDescription());
		
		labels.persist();
	}
	
	@Transactional
	public void remove(Long id) {
		
		Optional<Label> labelOp = Label.findByIdOptional(id);
		
		if(labelOp.isEmpty()) {
			throw new NullPointerException("Label not found");
		}
		
		Label label = labelOp.get();
		
		label.delete();
	}
		
	
	

}
