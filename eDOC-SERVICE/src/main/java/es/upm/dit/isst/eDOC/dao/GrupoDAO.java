package es.upm.dit.isst.eDOC.dao;

import java.util.List;
import es.upm.dit.isst.eDOC.model.*;

public interface GrupoDAO {
	
	public Grupo create(Grupo grupo);
	public Grupo read(int id);
	public Grupo update(Grupo grupo);
	public Grupo delete(Grupo grupo);
	public List<Grupo> readAll();
		
}

