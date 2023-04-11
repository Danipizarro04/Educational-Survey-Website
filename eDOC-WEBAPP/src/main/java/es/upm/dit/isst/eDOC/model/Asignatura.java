package es.upm.dit.isst.eDOC.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

import java.io.Serializable;



public class Asignatura implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String name;
	private String acronimo;
	private int curso;
	private int semestre;
	private int usuarios_matriculados;

	
    private List<Usuario> usuarios;
    
    private List<Grupo> grupos;
	
	public void addUsuario (Usuario usuario){
        if(this.usuarios == null){
        	this.usuarios = new ArrayList<Usuario>();
        }
        this.usuarios.add(usuario);
    }
	
	public Asignatura(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcronimo() {
		return acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getUsuarios_matriculados() {
		return usuarios_matriculados;
	}

	public void setUsuarios_matriculados(int usuarios_matriculados) {
		this.usuarios_matriculados = usuarios_matriculados;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acronimo == null) ? 0 : acronimo.hashCode());
		result = prime * result + curso;
		result = prime * result + ((grupos == null) ? 0 : grupos.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + semestre;
		result = prime * result + ((usuarios == null) ? 0 : usuarios.hashCode());
		result = prime * result + usuarios_matriculados;
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
		Asignatura other = (Asignatura) obj;
		if (acronimo == null) {
			if (other.acronimo != null)
				return false;
		} else if (!acronimo.equals(other.acronimo))
			return false;
		if (curso != other.curso)
			return false;
		if (grupos == null) {
			if (other.grupos != null)
				return false;
		} else if (!grupos.equals(other.grupos))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (semestre != other.semestre)
			return false;
		if (usuarios == null) {
			if (other.usuarios != null)
				return false;
		} else if (!usuarios.equals(other.usuarios))
			return false;
		if (usuarios_matriculados != other.usuarios_matriculados)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", name=" + name + ", acronimo=" + acronimo + ", curso=" + curso + ", semestre="
				+ semestre + ", usuarios_matriculados=" + usuarios_matriculados + ", usuarios=" + usuarios + ", grupos="
				+ grupos + "]";
	}

}