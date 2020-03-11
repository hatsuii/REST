package eu.ensup.rest3jj.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import eu.ensup.rest3jj.domaine.Track;

@Path("/json/chansonBB")
public class JSONservice {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInfo() {
		Track piste = new Track();
		piste.setAuteur("Los cuales de la sinaloa");
		piste.setTitre("Negro y azul");
		return piste;
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJson(Track track) {

		String result = "Piste sauvee: " + track;
		return Response.status(200).entity(result).build();
	}
}
