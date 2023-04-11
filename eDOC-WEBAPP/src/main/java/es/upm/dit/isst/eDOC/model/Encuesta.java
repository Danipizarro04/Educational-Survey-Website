package es.upm.dit.isst.eDOC.model;

import java.io.Serializable;
import javax.persistence.*;


public class Encuesta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private boolean entregada;
	
	
	private Asignatura asignatura;
	
	
	private Grupo Grupo;
	
	
	private double Respuesta_Test1;
	
	private double Respuesta_Test2;
	
	private double Respuesta_Test3;
	
	private double Respuesta_Test4;
	
	private double Respuesta_Test5;
	
	private double Respuesta_Test6;
	
	private double Respuesta_Test7;
	
	private double Respuesta_Test8;
	
	private double Respuesta_Test9;
	
	private double Respuesta_Test10;
	
	private double Respuesta_Test11;
	
	private double Respuesta_Test12;
	
	private double Respuesta_Test13;
	
	private double Respuesta_Test14;
	
	private double Respuesta_Test15;
	
	private double Respuesta_Test16;
	
	private double Respuesta_Test17;
	
	private double Respuesta_Test18;
	
	private double Respuesta_Test19;
	
	private double Respuesta_Test20;
	
	private double Respuesta_Test21;
	
	private double Respuesta_Test22;
	
	private double Respuesta_Test23;
	
	private double Respuesta_Test24;
	
	//media de una encuesta
	private double media_Encuesta;
	
	//preguntas 1 y 2
	private double media_Documentacion;
	
	//pregunta 3, 4, 5 y 6
	private double media_Evaluacion;
	
	//pregunta 7,8,9,10,11 y 12
	private double media_Estudiante;

	//pregunta 13 y 14
	private double media_Clases;

	//pregunta 15 hasta la 23
	private double media_Profesorado;
	
	//pregunta 24
	private double media_Satisfaccion;
	
	
	@Lob
	private String Respuesta_Texto;
	
	public Encuesta() {
	}

	@Override
	public String toString() {
		return "Encuesta [id=" + id + ", entregada=" + entregada + ", Asignatura=" + asignatura + ", Grupo=" + Grupo
				+ ", Respuesta_Test1=" + Respuesta_Test1 + ", Respuesta_Test2=" + Respuesta_Test2 + ", Respuesta_Test3="
				+ Respuesta_Test3 + ", Respuesta_Test4=" + Respuesta_Test4 + ", Respuesta_Test5=" + Respuesta_Test5
				+ ", Respuesta_Test6=" + Respuesta_Test6 + ", Respuesta_Test7=" + Respuesta_Test7 + ", Respuesta_Test8="
				+ Respuesta_Test8 + ", Respuesta_Test9=" + Respuesta_Test9 + ", Respuesta_Test10=" + Respuesta_Test10
				+ ", Respuesta_Test11=" + Respuesta_Test11 + ", Respuesta_Test12=" + Respuesta_Test12
				+ ", Respuesta_Test13=" + Respuesta_Test13 + ", Respuesta_Test14=" + Respuesta_Test14
				+ ", Respuesta_Test15=" + Respuesta_Test15 + ", Respuesta_Test16=" + Respuesta_Test16
				+ ", Respuesta_Test17=" + Respuesta_Test17 + ", Respuesta_Test18=" + Respuesta_Test18
				+ ", Respuesta_Test19=" + Respuesta_Test19 + ", Respuesta_Test20=" + Respuesta_Test20
				+ ", Respuesta_Test21=" + Respuesta_Test21 + ", Respuesta_Test22=" + Respuesta_Test22
				+ ", Respuesta_Test23=" + Respuesta_Test23 + ", Respuesta_Test24=" + Respuesta_Test24
				+ ", media_Encuesta=" + media_Encuesta + ", media_Documentacion=" + media_Documentacion
				+ ", media_Evaluacion=" + media_Evaluacion + ", media_Estudiante=" + media_Estudiante
				+ ", media_Clases=" + media_Clases + ", media_Profesorado=" + media_Profesorado
				+ ", media_Satisfaccion=" + media_Satisfaccion + ", Respuesta_Texto=" + Respuesta_Texto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asignatura == null) ? 0 : asignatura.hashCode());
		result = prime * result + ((Grupo == null) ? 0 : Grupo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Respuesta_Test1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test10);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test11);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test12);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test13);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test14);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test15);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test16);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test17);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test18);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test19);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test20);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test21);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test22);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test23);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test24);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test5);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test6);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test7);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test8);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test9);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Respuesta_Texto == null) ? 0 : Respuesta_Texto.hashCode());
		result = prime * result + (entregada ? 1231 : 1237);
		result = prime * result + id;
		temp = Double.doubleToLongBits(media_Clases);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Documentacion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Encuesta);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Estudiante);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Evaluacion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Profesorado);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Satisfaccion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Encuesta other = (Encuesta) obj;
		if (asignatura == null) {
			if (other.asignatura != null)
				return false;
		} else if (!asignatura.equals(other.asignatura))
			return false;
		if (Grupo == null) {
			if (other.Grupo != null)
				return false;
		} else if (!Grupo.equals(other.Grupo))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test1) != Double.doubleToLongBits(other.Respuesta_Test1))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test10) != Double.doubleToLongBits(other.Respuesta_Test10))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test11) != Double.doubleToLongBits(other.Respuesta_Test11))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test12) != Double.doubleToLongBits(other.Respuesta_Test12))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test13) != Double.doubleToLongBits(other.Respuesta_Test13))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test14) != Double.doubleToLongBits(other.Respuesta_Test14))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test15) != Double.doubleToLongBits(other.Respuesta_Test15))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test16) != Double.doubleToLongBits(other.Respuesta_Test16))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test17) != Double.doubleToLongBits(other.Respuesta_Test17))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test18) != Double.doubleToLongBits(other.Respuesta_Test18))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test19) != Double.doubleToLongBits(other.Respuesta_Test19))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test2) != Double.doubleToLongBits(other.Respuesta_Test2))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test20) != Double.doubleToLongBits(other.Respuesta_Test20))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test21) != Double.doubleToLongBits(other.Respuesta_Test21))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test22) != Double.doubleToLongBits(other.Respuesta_Test22))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test23) != Double.doubleToLongBits(other.Respuesta_Test23))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test24) != Double.doubleToLongBits(other.Respuesta_Test24))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test3) != Double.doubleToLongBits(other.Respuesta_Test3))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test4) != Double.doubleToLongBits(other.Respuesta_Test4))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test5) != Double.doubleToLongBits(other.Respuesta_Test5))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test6) != Double.doubleToLongBits(other.Respuesta_Test6))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test7) != Double.doubleToLongBits(other.Respuesta_Test7))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test8) != Double.doubleToLongBits(other.Respuesta_Test8))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test9) != Double.doubleToLongBits(other.Respuesta_Test9))
			return false;
		if (Respuesta_Texto == null) {
			if (other.Respuesta_Texto != null)
				return false;
		} else if (!Respuesta_Texto.equals(other.Respuesta_Texto))
			return false;
		if (entregada != other.entregada)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(media_Clases) != Double.doubleToLongBits(other.media_Clases))
			return false;
		if (Double.doubleToLongBits(media_Documentacion) != Double.doubleToLongBits(other.media_Documentacion))
			return false;
		if (Double.doubleToLongBits(media_Encuesta) != Double.doubleToLongBits(other.media_Encuesta))
			return false;
		if (Double.doubleToLongBits(media_Estudiante) != Double.doubleToLongBits(other.media_Estudiante))
			return false;
		if (Double.doubleToLongBits(media_Evaluacion) != Double.doubleToLongBits(other.media_Evaluacion))
			return false;
		if (Double.doubleToLongBits(media_Profesorado) != Double.doubleToLongBits(other.media_Profesorado))
			return false;
		if (Double.doubleToLongBits(media_Satisfaccion) != Double.doubleToLongBits(other.media_Satisfaccion))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEntregada() {
		return entregada;
	}

	public void setEntregada(boolean entregada) {
		this.entregada = entregada;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Grupo getGrupo() {
		return Grupo;
	}

	public void setGrupo(Grupo grupo) {
		Grupo = grupo;
	}

	public double getRespuesta_Test1() {
		return Respuesta_Test1;
	}

	public void setRespuesta_Test1(double respuesta_Test1) {
		Respuesta_Test1 = respuesta_Test1;
	}

	public double getRespuesta_Test2() {
		return Respuesta_Test2;
	}

	public void setRespuesta_Test2(double respuesta_Test2) {
		Respuesta_Test2 = respuesta_Test2;
	}

	public double getRespuesta_Test3() {
		return Respuesta_Test3;
	}

	public void setRespuesta_Test3(double respuesta_Test3) {
		Respuesta_Test3 = respuesta_Test3;
	}

	public double getRespuesta_Test4() {
		return Respuesta_Test4;
	}

	public void setRespuesta_Test4(double respuesta_Test4) {
		Respuesta_Test4 = respuesta_Test4;
	}

	public double getRespuesta_Test5() {
		return Respuesta_Test5;
	}

	public void setRespuesta_Test5(double respuesta_Test5) {
		Respuesta_Test5 = respuesta_Test5;
	}

	public double getRespuesta_Test6() {
		return Respuesta_Test6;
	}

	public void setRespuesta_Test6(double respuesta_Test6) {
		Respuesta_Test6 = respuesta_Test6;
	}

	public double getRespuesta_Test7() {
		return Respuesta_Test7;
	}

	public void setRespuesta_Test7(double respuesta_Test7) {
		Respuesta_Test7 = respuesta_Test7;
	}

	public double getRespuesta_Test8() {
		return Respuesta_Test8;
	}

	public void setRespuesta_Test8(double respuesta_Test8) {
		Respuesta_Test8 = respuesta_Test8;
	}

	public double getRespuesta_Test9() {
		return Respuesta_Test9;
	}

	public void setRespuesta_Test9(double respuesta_Test9) {
		Respuesta_Test9 = respuesta_Test9;
	}

	public double getRespuesta_Test10() {
		return Respuesta_Test10;
	}

	public void setRespuesta_Test10(double respuesta_Test10) {
		Respuesta_Test10 = respuesta_Test10;
	}

	public double getRespuesta_Test11() {
		return Respuesta_Test11;
	}

	public void setRespuesta_Test11(double respuesta_Test11) {
		Respuesta_Test11 = respuesta_Test11;
	}

	public double getRespuesta_Test12() {
		return Respuesta_Test12;
	}

	public void setRespuesta_Test12(double respuesta_Test12) {
		Respuesta_Test12 = respuesta_Test12;
	}

	public double getRespuesta_Test13() {
		return Respuesta_Test13;
	}

	public void setRespuesta_Test13(double respuesta_Test13) {
		Respuesta_Test13 = respuesta_Test13;
	}

	public double getRespuesta_Test14() {
		return Respuesta_Test14;
	}

	public void setRespuesta_Test14(double respuesta_Test14) {
		Respuesta_Test14 = respuesta_Test14;
	}

	public double getRespuesta_Test15() {
		return Respuesta_Test15;
	}

	public void setRespuesta_Test15(double respuesta_Test15) {
		Respuesta_Test15 = respuesta_Test15;
	}

	public double getRespuesta_Test16() {
		return Respuesta_Test16;
	}

	public void setRespuesta_Test16(double respuesta_Test16) {
		Respuesta_Test16 = respuesta_Test16;
	}

	public double getRespuesta_Test17() {
		return Respuesta_Test17;
	}

	public void setRespuesta_Test17(double respuesta_Test17) {
		Respuesta_Test17 = respuesta_Test17;
	}

	public double getRespuesta_Test18() {
		return Respuesta_Test18;
	}

	public void setRespuesta_Test18(double respuesta_Test18) {
		Respuesta_Test18 = respuesta_Test18;
	}

	public double getRespuesta_Test19() {
		return Respuesta_Test19;
	}

	public void setRespuesta_Test19(double respuesta_Test19) {
		Respuesta_Test19 = respuesta_Test19;
	}

	public double getRespuesta_Test20() {
		return Respuesta_Test20;
	}

	public void setRespuesta_Test20(double respuesta_Test20) {
		Respuesta_Test20 = respuesta_Test20;
	}

	public double getRespuesta_Test21() {
		return Respuesta_Test21;
	}

	public void setRespuesta_Test21(double respuesta_Test21) {
		Respuesta_Test21 = respuesta_Test21;
	}

	public double getRespuesta_Test22() {
		return Respuesta_Test22;
	}

	public void setRespuesta_Test22(double respuesta_Test22) {
		Respuesta_Test22 = respuesta_Test22;
	}

	public double getRespuesta_Test23() {
		return Respuesta_Test23;
	}

	public void setRespuesta_Test23(double respuesta_Test23) {
		Respuesta_Test23 = respuesta_Test23;
	}

	public double getRespuesta_Test24() {
		return Respuesta_Test24;
	}

	public void setRespuesta_Test24(double respuesta_Test24) {
		Respuesta_Test24 = respuesta_Test24;
	}

	public double getMedia_Encuesta() {
		return media_Encuesta;
	}

	public void setMedia_Encuesta(double media_Encuesta) {
		this.media_Encuesta = media_Encuesta;
	}

	public double getMedia_Documentacion() {
		return media_Documentacion;
	}

	public void setMedia_Documentacion(double media_Documentacion) {
		this.media_Documentacion = media_Documentacion;
	}

	public double getMedia_Evaluacion() {
		return media_Evaluacion;
	}

	public void setMedia_Evaluacion(double media_Evaluacion) {
		this.media_Evaluacion = media_Evaluacion;
	}

	public double getMedia_Estudiante() {
		return media_Estudiante;
	}

	public void setMedia_Estudiante(double media_Estudiante) {
		this.media_Estudiante = media_Estudiante;
	}

	public double getMedia_Clases() {
		return media_Clases;
	}

	public void setMedia_Clases(double media_Clases) {
		this.media_Clases = media_Clases;
	}

	public double getMedia_Profesorado() {
		return media_Profesorado;
	}

	public void setMedia_Profesorado(double media_Profesorado) {
		this.media_Profesorado = media_Profesorado;
	}

	public double getMedia_Satisfaccion() {
		return media_Satisfaccion;
	}

	public void setMedia_Satisfaccion(double media_Satisfaccion) {
		this.media_Satisfaccion = media_Satisfaccion;
	}

	public String getRespuesta_Texto() {
		return Respuesta_Texto;
	}

	public void setRespuesta_Texto(String respuesta_Texto) {
		Respuesta_Texto = respuesta_Texto;
	}

}