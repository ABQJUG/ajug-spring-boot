package org.ajug.web.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class SimpleController {
    
    @GET
    public String index(){
    		return "Hello J2EE 7";
    }
    
//    @GET
//    @Path("/snippets")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Snippet snippets(){
//    		return new Snippet("JavaScript: Hello World", "console.log('Hello World');");
//    }

    
//    @GET
//    @Path("/snippets")
//    @Produces(MediaType.APPLICATION_JSON)
//    @SuppressWarnings("serial")
//    public List<Snippet> snippets(){
//    		
//			List<Snippet> snippets = new ArrayList<Snippet>(){{
//    			add(new Snippet("JavaScript: Hello World", "console.log('Hello World');"));
//    			
//    		}};
//    		return snippets;
//    }

}

