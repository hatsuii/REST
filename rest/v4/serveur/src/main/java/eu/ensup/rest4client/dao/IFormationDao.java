package eu.ensup.rest4client.dao;

import java.util.List;

import eu.ensup.rest4client.domaine.Formation;

public interface IFormationDao {

	// CRUD

	public boolean create(Formation pFormation);

	public Formation read(long idFormation);

	public List<Formation> getAll();

	public Formation update(Formation pFormation, long idFormation);

	public boolean delete(long idFormation);
}
