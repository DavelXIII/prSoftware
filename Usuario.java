package redSocial;

import java.util.*;



public class Usuario implements Cosas {
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
		this.AñadirTagsRecomendar(nombreUsuario);
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
	
	public void AñadirListaTagsRecomendar(List<String> tagsRecomendar) {
		TagsRecomendar.addAll(tagsRecomendar) ;
	}
	public void AñadirTagsRecomendar(String tags) {
		TagsRecomendar.add(tags) ;
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
	
	public void recomendar(Map<String, Map<String, ArrayList<Cosas>>> MapReducido) {
		Random R = new Random() ;
		int i ;
		String Tag1, Tag2, Tag3 ;
		Usuario User ;
		List<Cosas> L = new ArrayList<Cosas>() ;
		i = R.nextInt(TagsRecomendar.size()) ;
		Tag1 = TagsRecomendar.get(i) ;
		i = R.nextInt(TagsRecomendar.size()) ;
		Tag2 = TagsRecomendar.get(i) ;
		i = R.nextInt(TagsRecomendar.size()) ;
		Tag3 = TagsRecomendar.get(i) ;
		
		L = DevolverUsuarios(Tag1,MapReducido) ;
		i = R.nextInt(L.size()) ;
		User = (Usuario) L.get(i) ;
		User.toString() ;
		
		L = DevolverUsuarios(Tag1,MapReducido) ;
		i = R.nextInt(L.size()) ;
		User = (Usuario) L.get(i) ;
		User.toString() ;
		
		L = DevolverUsuarios(Tag1,MapReducido) ;
		i = R.nextInt(L.size()) ;
		User = (Usuario) L.get(i) ;
		User.toString() ;
		
	}
	
	public void agregarAmigo(int id) {
		amigos.add(id);
	}
	
	public void eliminarAmigo(int id) {
		amigos.remove(id);
	}
	
	public List<Cosas> DevolverUsuarios(String Palabra, Map<String, Map<String, ArrayList<Cosas>>> MapReducido) {
		
		Map<String, ArrayList<Cosas>> M ;
		List<Cosas> Usuarios = new ArrayList<Cosas>() ;
		M = MapReducido.get(Palabra)  ;
		Usuarios = M.get("Usuarios") ;
		return Usuarios ;
		
	}
	
	private void realizarBusqueda(String Tag, Map<String, Map<String ,ArrayList<Cosas>>> MapReducido){
		Map<String, ArrayList<Cosas>> M ;
		M = MapReducido.get(Tag) ;
		
		List<Cosas> U = new ArrayList<Cosas>() ;
		U = M.get("Usuarios") ;
		ListIterator<Cosas> UIT = U.listIterator() ;
		
		List<Cosas> C = new ArrayList<Cosas>() ;
		C = M.get("Canales") ;
		ListIterator<Cosas> CIT = C.listIterator() ;
		
		List<Cosas> L = new ArrayList<Cosas>() ;
		L = M.get("Listas") ;
		ListIterator<Cosas> LIT = L.listIterator() ;
		
		List<Cosas> O = new ArrayList<Cosas>() ;
		O = M.get("Objetos") ;
		ListIterator<Cosas> OIT = O.listIterator() ;
		
		while(UIT.hasNext() || CIT.hasNext() || LIT.hasNext() || OIT.hasNext()){
			if(UIT.hasNext()) {
				((Usuario) UIT.next()).toString() ;
			}
			
			if(CIT.hasNext()) {
				((Canal) UIT.next()).toString() ;
			}
			
			if(LIT.hasNext()) {
				((Lista) UIT.next()).toString() ;
			}
			
			if(OIT.hasNext()) {
				((Objeto) UIT.next()).toString() ;
			}
			
		}

	}
	
	@Override
	
	public String toString() {
		String res = null;
		StringBuilder str = new StringBuilder();
		ListIterator<Canal> iter = canales.listIterator();
		while(iter.hasNext()) {
			str.append(iter.next().toString());
			str.append(", ");
		}
		if(influencer) {
			res = nombreUsuario + " " + id + "\nInfluencer" + str;	
		} else {
			res = nombreUsuario + " " + id + "\n" + puntuacion + str;
		}
		return null;
	}
}