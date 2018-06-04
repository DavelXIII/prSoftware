package redSocial;

public class Publicacion {
	private String tipo;
	
	public Publicacion(String tipo) {
		this.tipo = tipo;
	}
	
	public void borrarPublicacion() throws Throwable {
		this.finalize();
	}
	
	public void editarPublicacion() {
		
	}
}
