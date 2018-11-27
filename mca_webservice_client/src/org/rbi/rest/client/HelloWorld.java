package org.rbi.rest.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.UriBuilder;

import org.rbi.rest.modal.NonXBRL;

public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	@Path("/helloworld")
	public class helloWorld {
	 
	   // Specifies that the method processes HTTP GET requests 
	   @GET
	   @Produces("application/json")
	   public String sayHello() {
	      
		   /*JSONArray uriArray = new JSONArray();
	        for (NonXBRL bookmarkEntity : getBookmarks()) {
	            UriBuilder ub = uriInfo.getAbsolutePathBuilder();
	            URI bookmarkUri = ub.
	                    path(bookmarkEntity.getBookmarkEntityPK().getBmid()).
	                    build();
	            uriArray.put(bookmarkUri.toASCIIString());
	        }
	        return uriArray;*/
		   
		   return "Hello World!";
	   }
	}
}
