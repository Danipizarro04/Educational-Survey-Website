package es.upm.dit.isst.eDOC.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import es.upm.dit.isst.eDOC.model.Grupo;

public class GrupoDAOImplementation implements GrupoDAO{
	
	private static  GrupoDAOImplementation instancia = null;
	private GrupoDAOImplementation() {
	}
	
	public static GrupoDAOImplementation getInstance() {
		if( null == instancia )
		   instancia = new GrupoDAOImplementation();
		return instancia;
	}
	
	@Override
	public Grupo create (Grupo grupo) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		try {
			session.save(grupo);
		} catch (Exception e) {
			grupo = null;
		}
		session.getTransaction().commit();
		session.close();
		return grupo;
	}
	
	@Override
	public Grupo read(int id) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		Grupo asignatura = session.get(Grupo.class, id);
		session.getTransaction().commit();
		session.close();
		return asignatura;
	}
	@Override
	public Grupo update(Grupo grupo) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.saveOrUpdate(grupo);
		session.getTransaction().commit();
		session.close();
		return grupo;
	}
	
	@Override
	public Grupo delete(Grupo grupo) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.delete(grupo);
		session.getTransaction().commit();
		session.close();
		return grupo;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Grupo> readAll() {
		List<Grupo> grupos = new ArrayList<Grupo>();
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		grupos.addAll(session.createQuery("from Grupo").list());
		session.getTransaction().commit();
		session.close();
		return grupos;
	}
	
}








	
	
	
	
	
	

