package redSocial;

public class Objeto {
	private String nombre;
	private int id;
	
	public Objeto(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
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
