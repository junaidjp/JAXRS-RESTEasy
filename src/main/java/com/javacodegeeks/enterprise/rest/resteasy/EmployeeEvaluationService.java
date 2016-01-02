package com.javacodegeeks.enterprise.rest.resteasy;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/RESTEmployeeEvaluation")
public class EmployeeEvaluationService {

	
	@GET
	@Path("/{pathParameter}")
	public Response responseMsg( @PathParam("pathParameter") String pathParameter,
			@DefaultValue("Nothing to say") @QueryParam("employeeId") String queryParameter) {

	String response = null;	
	
	String employeeId = queryParameter;
	
	//Pass this to Hibernate to get back all Employee Details
	if(queryParameter.equalsIgnoreCase("1")) { 
		response = "Danish , Software Developer , Good Work Ethic , Mid level Developer  ,Exceptional Employee";
	}
	else { 
		response = "Mr XYZ , Software Developer , Ok work Ethic , Avergage Employee";
	}
		

		return Response.status(200).entity(response).build();
	}
	
}
