package eu.ensup.rest4client.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import eu.ensup.rest4client.dao.FormationDao;
import eu.ensup.rest4client.domaine.Formation;

@Path("/json/formation")
public class FormationService implements IFormationService {

	private FormationDao formationdao;

	public FormationService() {
		formationdao = new FormationDao();
	}

	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public boolean creationFormation(Formation pFormation) {
		return formationdao.create(pFormation);
	}

	@GET
	@Path("/read")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Formation lireFormation(long idFormation) {
		return formationdao.read(idFormation);
	}

	@GET
	@Path("/readall")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Formation> lireTouteFormation() {

		return formationdao.getAll();
	}

	@POST
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Formation modifierFormation(Formation pFormation, long idFormation) {
		return formationdao.update(pFormation, idFormation);
	}

	@POST
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public boolean supprimerFormation(long idFormation) {
		return formationdao.delete(idFormation);
	}

	public void closeemf() {
		formationdao.closeEM();
	}


}
