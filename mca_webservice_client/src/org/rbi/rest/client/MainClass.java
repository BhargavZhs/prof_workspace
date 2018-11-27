package org.rbi.rest.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



public class MainClass {

//	public MainClass() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		
		try {
			Client c = new Client();
//			WebResource r = c.resource("https://api.data.gov.in/resource/6f25cce4-6da3-4b67-9ed8-3bd9340d3a6d?api-key=579b464db66ec23bdd000001b6ec942fe894406d56beedf50b525b13&format=json&offset=0&limit=10");
			WebResource r = c.resource("https://api.data.gov.in/resource/6f25cce4-6da3-4b67-9ed8-3bd9340d3a6d?api-key=579b464db66ec23bdd000001b6ec942fe894406d56beedf50b525b13&format=json&offset=0&limit=10");
			ClientResponse response = r.accept("application/json")
	                   .get(ClientResponse.class);
			String response1 = r.toString();
			System.out.println(response1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	
		
//		Client client = ClientBuilder.newClient( new ClientConfig().register( LoggingFilter.class ) );
//		WebTarget webTarget = client.target("http://localhost:8080/JerseyDemos/rest").path("employees");
//		 
//		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_XML);
//		Response response = invocationBuilder.get();
	
	}
}
