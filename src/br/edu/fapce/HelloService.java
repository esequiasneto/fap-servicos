package br.edu.fapce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
	
import org.json.JSONObject;

@Path("hello")
public class HelloService {

	@GET
	@Path("{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHello (@PathParam("name") String name) {
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", "Hello " + name);
		
		return Response.status(200).entity(jsonObject.toString()).build();
	}
	
}
