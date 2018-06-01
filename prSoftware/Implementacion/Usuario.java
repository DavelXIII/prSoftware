package redSocial;

import java.util.*;

public class Usuario {
	private String nombreUsuario;
	private int id;
	private String contraseña;
	private int puntuacion;
	private String avatar;
	private List<Integer> amigos;
	private int numSeguidores;
	private boolean influencer;
	
	
	public Usuario(String nombreUsuario, String contraseña, int id) {
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.id = id;
		this.puntuacion = 0;
		this.avatar = "https://i.ytimg.com/vi/sPEOKxHZZvA/maxresdefault.jpg";
		//this.amigos = new ArrayL
		this.numSeguidores = 0;
		this.influencer = false;
		
		
	}
	
	public void convertirInfluencer(int id) {
		influencer = true;
	}
	
	public void borrarUsuario(int id) throws Throwable {
		this.finalize();
	}
	
	public Usuario recomendar(/*datos*/) {
		return null;
	}
	
	public void banearUsuario(int id) throws Throwable {
		borrarUsuario(id);
	}
	
	public void agregarAmigo(int id) {
		amigos.add(id);
	}
	
	public void eliminarAmigo(int id) {
		amigos.remove(id);
	}
	
	public void realizarBusqueda(String tematica) {
		
	}
}
