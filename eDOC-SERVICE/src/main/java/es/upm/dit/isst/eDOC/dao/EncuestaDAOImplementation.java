package es.upm.dit.isst.eDOC.dao;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.eDOC.model.Asignatura;
import es.upm.dit.isst.eDOC.model.Encuesta;
import es.upm.dit.isst.eDOC.model.Grupo;


public class EncuestaDAOImplementation implements EncuestaDAO {
	private static  EncuestaDAOImplementation instancia = null;
	private EncuestaDAOImplementation() {
	}
	
	public static EncuestaDAOImplementation getInstance() {
		if( null == instancia )
		   instancia = new EncuestaDAOImplementation();
		return instancia;
	}
	
	@Override
	public Encuesta create(Encuesta encuesta) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		try {
			session.save(encuesta);
		} catch (Exception e) {
			encuesta = null;
		}
		session.getTransaction().commit();
		session.close();
		return encuesta;
	}
	
	@Override
	public Encuesta read(int id) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		Encuesta encuesta = session.get(Encuesta.class, id);
		session.getTransaction().commit();
		session.close();
		return encuesta;
	}
	@Override
	public Encuesta update(Encuesta encuesta) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.saveOrUpdate(encuesta);
		session.getTransaction().commit();
		session.close();
		return encuesta;
	}
	
	@Override
	public Encuesta delete(Encuesta encuesta) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.delete(encuesta);
		session.getTransaction().commit();
		session.close();
		return encuesta;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Encuesta> readAll() {
		List<Encuesta> encuestas = new ArrayList<Encuesta>();
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		encuestas.addAll(session.createQuery("from Encuesta").list());
		session.getTransaction().commit();
		session.close();
		return encuestas;
	}

	
	@Override
	public List<Encuesta> readAll(int id) {
		List<Encuesta> res = new ArrayList<Encuesta>();
		for (Encuesta encuesta : this.readAll())
			if (encuesta.getAsignatura().getId() == (id))
				res.add(encuesta);
		return res;
	}
	
	/*
	 * public List<Encuesta> readAllAsignatura(Asignatura asignatura) {
	 * List<Encuesta> res = new ArrayList<Encuesta>(); for (Encuesta encuesta :
	 * this.readAll()) if (encuesta.getAsignatura() == (asignatura))
	 * res.add(encuesta); return res; }
	 */
	
	/*
	@Override
	public List<Encuesta> readAll_grupo(Grupo grupo) {
		List<Encuesta> res = new ArrayList<Encuesta>();
		for (Encuesta encuesta : this.readAll())
			if (encuesta.getGrupo() == (grupo))
				res.add(encuesta);
		return res;
	}
	
	*/

}
