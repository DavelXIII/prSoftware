package redSocial;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Canal extends Cosas{
	private String nombre;
	private String tematica;
	private String descripcion;
	private List<String> Tags;

	public Canal(String nombre, String tematica, String descripcion) {
		this.Tags = new ArrayList<String>() ;
		this.nombre = nombre;
		this.tematica = tematica;
		this.descripcion = descripcion;
	}
	
	public List<String> getTags() {
		return Tags;
	}
	
	public void añadirListaTags(List<String> tags) {
		Tags.addAll(tags) ;
	}
	
	public void añadirTags(String tags) {
		Tags.add(tags) ;
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
	
	@Override
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		ListIterator<String> iter = Tags.listIterator();
		while(iter.hasNext()) {
			str.append(iter.next().toString());
			str.append(" ");
		}
		return ("Canal: " + nombre + "   " + tematica + "\n" + descripcion + "\n" +  str);
	}
}
