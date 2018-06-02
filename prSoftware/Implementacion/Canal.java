package redSocial;

import java.util.ArrayList;
import java.util.List;

public class Canal extends Cosas{
	private String nombre;
	private String tematica;
	private String descripcion;
	private List<String> tags;

	
	public Canal(String nombre, String tematica, String descripcion) {
		this.nombre = nombre;
		this.tematica = tematica;
		this.descripcion = descripcion;
	}
	
	public void editarCanal(int id) {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
