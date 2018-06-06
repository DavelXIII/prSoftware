package redSocial;

import java.util.*;

public class Objeto implements Cosas  {
	private String nombre;
	private int id;
	private List<Canal> Canales;
	private List<String> Tags ;
	
	public Objeto(String nombre, int id) {
		this.Tags = new ArrayList<String>() ;
		this.nombre = nombre;
		this.id = id;
		Tags = new ArrayList<String>() ;
		this.añadirTag(nombre);
	}

	public void añadirTag(String tags) {
		Tags.add(tags) ;
	}
	
	public void añadirListaTag(List<String> tags) {
		Tags.addAll(tags) ;
	}
	
	public List<String> getTags() {
		return Tags;
	}

	public void borrarObjeto() throws Throwable {
		this.finalize();
	}
	
	@Override
	
	public boolean equals(Object obj){
		boolean res = obj instanceof Objeto;
		Objeto objeto = res ? (Objeto)obj : null;
		return res && objeto.nombre.equalsIgnoreCase(this.nombre);
	}
	
	public int hashCode(){
		return this.nombre.toLowerCase().hashCode();
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		ListIterator<String> iter = Tags.listIterator();
		while(iter.hasNext()) {
			str.append(iter.next().toString());
			str.append(" ");
		}
		return nombre + " " + str;		
	}
}
