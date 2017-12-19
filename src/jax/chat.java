package jax;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
@Path("/mem")
@Produces("application/json")

public class chat {
	    private static Map<Integer, String> memoire = new HashMap<>();
		@GET
		public Map<Integer, String> getValue() {
		return memoire;
		}
}

