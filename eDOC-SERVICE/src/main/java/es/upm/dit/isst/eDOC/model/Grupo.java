package es.upm.dit.isst.eDOC.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
 

@Entity
public class Grupo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	@JoinTable(
			name = "rel_usuarios_grupos",
			joinColumns = @JoinColumn(name = "FK_GRUPO", nullable = false),
			inverseJoinColumns = @JoinColumn(name="FK_USUARIOS", nullable = false)
				)
	
	@ManyToMany
    private List<Usuario> usuarios;
	
	@JoinTable(
			name = "rel_grupos_asignaturas",
			joinColumns = @JoinColumn(name = "FK_GRUPO", nullable = false),
			inverseJoinColumns = @JoinColumn(name="FK_ASIGNATURA", nullable = false)
			)
	@ManyToMany
    private List<Asignatura> asignaturas;
	
	public void addUsuario (Usuario usuario){
        if(this.usuarios == null){
        	this.usuarios = new ArrayList<Usuario>();
        }
        this.usuarios.add(usuario);
    }
	
	public Grupo(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}*/

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asignaturas == null) ? 0 : asignaturas.hashCode());
		result = prime * result + id;
		result = prime * result + ((usuarios == null) ? 0 : usuarios.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		if (asignaturas == null) {
			if (other.asignaturas != null)
				return false;
		} else if (!asignaturas.equals(other.asignaturas))
			return false;
		if (id != other.id)
			return false;
		if (usuarios == null) {
			if (other.usuarios != null)
				return false;
		} else if (!usuarios.equals(other.usuarios))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", usuarios=" + usuarios + ", asignaturas=" + asignaturas + "]";
	}

	
	
	
}


	
	
	
	