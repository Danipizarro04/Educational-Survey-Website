package es.upm.dit.isst.eDOC.dao;
import java.util.List;

import es.upm.dit.isst.eDOC.model.*;


public interface AsignaturaDAO {
	
	public Asignatura create(Asignatura asignatura);
	public Asignatura read(int id);
	public Asignatura update(Asignatura asignatura);
	public Asignatura delete(Asignatura asignatura);
	public List<Asignatura> readAll();
	//public List<Asignatura> delete_asignatura(int id);
}