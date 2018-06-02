package redSocial;

import java.util.*;

public class Objeto extends Cosas  {
	private String nombre;
	private int id;
	private List<Canal> Canales;
	
	public Objeto(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
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
}
