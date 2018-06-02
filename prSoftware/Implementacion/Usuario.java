package redSocial;

import java.util.*;

public class Usuario {
	private String nombreUsuario;
	private int id;
	private String contraseﾃｱa;
	private int puntuacion;
	private String avatar;
	private List<Integer> amigos;
	private int numSeguidores;
	private boolean influencer;
	private List<Canal> canales;
	private List<String> TagsPropias ;
	private List<String> TagsRecomendar ;

	
	public Usuario(String nombreUsuario, String contraseﾃｱa, int id) {

		this.TagsPropias = new ArrayList<String>() ;
		this.TagsRecomendar = new ArrayList<String>() ;
		this.nombreUsuario = nombreUsuario;
		this.contraseﾃｱa = contraseﾃｱa;
		this.id = id;
		this.puntuacion = 0;
		this.avatar = "https://i.ytimg.com/vi/sPEOKxHZZvA/maxresdefault.jpg";
		//this.amigos = new ArrayL
		this.numSeguidores = 0;
		this.influencer = false;
		canales= new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public void convertirInfluencer(int id) {
		influencer = true;
	}
	
	public void borrarUsuario(int id) throws Throwable {
		this.finalize();
	}
	
	public Usuario recomendar(/*datos*/) {
		//prueva.
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
	
	public Map<String, List<Cosas>> realizarBusqueda(String tematica) {
		
	}
}

