package com.amandafurtado.label.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	    
	    @GET
		@Path("{id}")
		public Response findById(@PathParam("id") Long id) {

			Label label = labelService.findById(id);
			
			return Response.ok(label).status(200).build();
		
	    }
	    
	    @POST
	    public Response save(Label label) {
	    	
	    	Label labels = labelService.save(label);
	    	
	    	return Response.ok(labels).status(201).build();
	    }
	    
	    @PUT
	    @Path("{id}")
	    public Response update(@PathParam("id") Long id, Label label) {
	    	
	    	labelService.update(id, label);
	    	
	    	return Response.status(204).build();
	    
	    }
	    
	    @DELETE
	    @Path("{id}")
	    public Response remove(@PathParam("id") Long id) {
	    	
	    	labelService.remove(id);
	    	
	    	return Response.status(204).build();
	    }
	        



}
