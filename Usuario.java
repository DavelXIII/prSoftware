package redSocial;

import java.util.*;



public class Usuario extends Cosas {
	private String nombreUsuario;
	private int id;
	private String contraseña;
	private int puntuacion;
	private String avatar;
	private List<Integer> amigos;
	

	private int numSeguidores;
	private List<Canal> canales ;
	private boolean influencer;
	private List<String> TagsPropias ;
	private List<String> TagsRecomendar ;

	
	public Usuario(String nombreUsuario, String contraseña, int id) {

		this.TagsPropias = new ArrayList<String>() ;
		this.TagsRecomendar = new ArrayList<String>() ;
		this.canales = new ArrayList<Canal>() ;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.id = id;
		this.puntuacion = 0;
		this.avatar = "https://i.ytimg.com/vi/sPEOKxHZZvA/maxresdefault.jpg";
		//this.amigos = new ArrayL
		this.numSeguidores = 0;
		this.influencer = false;
	}
	
	public List<String> getTagsPropias() {
		return TagsPropias;
	}
	
	public void AñadirTagsPropias(String tagsPropias) {
		TagsPropias.add(tagsPropias) ;
	}
	
	public void AñadirListaTagsPropias(List<String> TagsPropias) {
		TagsPropias.addAll(TagsPropias) ;
	}
	
	public List<String> getTagsRecomendar() {
		return TagsRecomendar;
	}
	
	public void setTagsRecomendar(List<String> tagsRecomendar) {
		TagsRecomendar = tagsRecomendar;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void convertirInfluencer(int id) {
		influencer = true;
	}
	
	public void borrarUsuario() throws Throwable {
		this.finalize();
	}
	
	public List<Integer> recomendar(/*datos*/) {

		return null;
	}
	
	public void agregarAmigo(int id) {
		amigos.add(id);
	}
	
	public void eliminarAmigo(int id) {
		amigos.remove(id);
	}
	
	public Map<String, List<Cosas>> realizarBusqueda(String tematica) {
		return null;
		
	}
}
