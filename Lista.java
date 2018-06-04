package redSocial;

import java.util.*;

public class Lista extends Cosas {
	
	private String nombre;
	private List<Objeto> objetos;
	private List<Objeto> Visitantes;
	private List<String> Tags;

	public Lista(String nombre, Collection<Objeto> objetos){
		this.Tags = new ArrayList<>() ;
		this.nombre = nombre;
		this.objetos = new ArrayList<>(objetos);	
	}
	
	public void borrarLista() throws Throwable {
		this.finalize();
	}
	
	
	public void añadirObjeto(Objeto obj) {
		objetos.add(obj);
	}
	
	public void añadirObjeto(Object obj) {
		Objeto objeto = (Objeto) obj;
		objetos.add(objeto);
	}
	
	public boolean equals(Collection<Objeto> lista){
		boolean res = objetos.size() == lista.size() && lista.containsAll(objetos) && objetos.addAll(lista);
		return res;
	}
	
	public int hashCode(){
		int sum = 0;
		ListIterator iter = objetos.listIterator();
		while(iter.hasNext()) {
			sum = sum + iter.next().hashCode();
		}
		return sum;
	}

	public List<String> getTags() {
		return Tags;
	}

	public void añadirListaTags(List<String> tags) {
		this.Tags.addAll(tags) ;
	}
	
	public void añadirTags(String tags) {
		this.Tags.add(tags) ;
	}

}
