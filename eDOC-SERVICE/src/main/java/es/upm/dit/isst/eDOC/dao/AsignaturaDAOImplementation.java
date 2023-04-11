package es.upm.dit.isst.eDOC.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import es.upm.dit.isst.eDOC.model.Asignatura;


public class AsignaturaDAOImplementation implements AsignaturaDAO {
	
	private static  AsignaturaDAOImplementation instancia = null;
	private AsignaturaDAOImplementation() {
	}
	
	public static AsignaturaDAOImplementation getInstance() {
		if( null == instancia )
		   instancia = new AsignaturaDAOImplementation();
		return instancia;
	}
	
	@Override
	public Asignatura create (Asignatura asignatura) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		try {
			session.save(asignatura);
		} catch (Exception e) {
			asignatura = null;
		}
		session.getTransaction().commit();
		session.close();
		return asignatura;
	}
	
	@Override
	public Asignatura read(int id) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		Asignatura asignatura = session.get(Asignatura.class, id);
		session.getTransaction().commit();
		session.close();
		return asignatura;
	}
	@Override
	public Asignatura update(Asignatura asignatura) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.saveOrUpdate(asignatura);
		session.getTransaction().commit();
		session.close();
		return asignatura;
	}
	
	@Override
	public Asignatura delete(Asignatura asignatura) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.delete(asignatura);
		session.getTransaction().commit();
		session.close();
		return asignatura;
	}
	
	/*@Override
	public List<Asignatura> delete_asignatura(int id) {
		List<Asignatura> asignaturas = this.readAll();
		for (Asignatura asignatura : this.readAll())
			if (asignatura.getId() == (id))
				asignaturas.remove(asignatura);
		return asignaturas;
	}*/
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Asignatura> readAll() {
		List<Asignatura> asignaturas = new ArrayList<Asignatura>();
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		asignaturas.addAll(session.createQuery("from Asignatura").list());
		session.getTransaction().commit();
		session.close();
		return asignaturas;
	}
	
	

}