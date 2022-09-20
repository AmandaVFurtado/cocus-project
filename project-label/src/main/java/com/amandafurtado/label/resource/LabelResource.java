package com.amandafurtado.label.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.amandafurtado.label.entity.Label;
import com.amandafurtado.label.service.LabelService;

@Path("/label")
@Produces(value = MediaType.APPLICATION_JSON)
@Consumes(value = MediaType.APPLICATION_JSON)
public class LabelResource {

	    @Inject
	    LabelService labelService;

	    @GET
	    
	    public Response ListLabels() {
	    	
	        List<Label> labels = labelService.listLabel();
	        
	        return Response.ok(labels).build();
	    }
	    
	    public Response save(Label label) {
	    	
	    	Label labels = labelService.save(label);
	    	
	    	return Response.ok(labels).status(201).build();
	    }
	        



}
