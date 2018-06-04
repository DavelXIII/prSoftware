package redSocial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RedSocial {
	private CargaDatos Datos ;
	private Map<String, ArrayList<Cosas>> Map ;
	private Map<String, Map<String, ArrayList<Cosas>>> MapRed ;
	
	public RedSocial() {
		Datos = new CargaDatos() ;
		Map = new HashMap<String, ArrayList<Cosas>>() ;
		MapRed = Reducir() ;
	}

	public Map<String, ArrayList<Cosas>> getMap() {
		return Map;
	}

	public void setMap(Map<String, List<Cosas>> map) {
		Map = Map;
	}

	public Map<String, Map<String, ArrayList<Cosas>>> getMapRed() {
		return MapRed;
	}
	
	private Map<String, Map<String, ArrayList<Cosas>>> Reducir(){
		List<String> Ttags = allTags() ;
		Map<String, Map<String, ArrayList<Cosas>>> MapReducido = new HashMap<String,Map<String, ArrayList<Cosas>>>() ;
		Map<String, ArrayList<Cosas>> MapApo ;
		List<Cosas> Resultados ;
		List<Cosas> Apollo2 = new ArrayList<Cosas>() ;
;
		
		for(int i = 0 ; i < Ttags.size() ; i++) {
			MapApo = new HashMap<String, ArrayList<Cosas>>() ;
			Resultados = new ArrayList<Cosas>() ;
			Apollo2 = Map.get("Usuarios") ;
			for(int j  = 0; i < Apollo2.size() ; i++ ) {
				if(((Usuario) Apollo2.get(j)).getTagsPropias().contains(Ttags.get(i))){
					Resultados.add(Apollo2.get(j)) ;
				}
			}
			MapApo.put("Usuarios", (ArrayList<Cosas>) Resultados) ;
			
			Resultados = new ArrayList<Cosas>() ;
			Apollo2 = Map.get("Canales") ;
			for(int j  = 0; i < Apollo2.size() ; i++ ) {
				if(((Canal) Apollo2.get(j)).getTags().contains(Ttags.get(i))){
					Resultados.add(Apollo2.get(j)) ;
				}
			}
			MapApo.put("Canales", (ArrayList<Cosas>) Resultados) ;
			
			Resultados = new ArrayList<Cosas>() ;
			Apollo2 = Map.get("Listas") ;
			for(int j  = 0; i < Apollo2.size() ; i++ ) {
				if(((Lista) Apollo2.get(j)).getTags().contains(Ttags.get(i))){
					Resultados.add(Apollo2.get(j)) ;
				}
			}
			MapApo.put("Listas", (ArrayList<Cosas>) Resultados) ;
			
			Resultados = new ArrayList<Cosas>() ;
			Apollo2 = Map.get("Objetos") ;
			for(int j  = 0; i < Apollo2.size() ; i++ ) {
				if(((Objeto) Apollo2.get(j)).getTags().contains(Ttags.get(i))){
					Resultados.add(Apollo2.get(j)) ;
				}
			}
			MapApo.put("Objetos", (ArrayList<Cosas>) Resultados) ;
			
			MapReducido.put(Ttags.get(i), MapApo) ;
		}
	
		return MapReducido ;
	}
	
	private List<String> allTags(){
		List<String> Apollo = new ArrayList<String>() ;
		List<Cosas> Apollo2 = new ArrayList<Cosas>() ;
		Cosas Cosa ;
		Apollo2 = Map.get("Usuarios") ;
		for(int i  = 0; i < Apollo2.size() ; i++ ) {
			Cosa = Apollo2.get(i);
			Apollo.addAll(((Usuario) Cosa).getTagsPropias()) ;
		}
		Apollo2 = Map.get("Canales") ;
		for(int i  = 0; i < Apollo2.size() ; i++ ) {
			Cosa = Apollo2.get(i);
			Apollo.addAll(((Canal) Cosa).getTags()) ;
		}
		Apollo2 = Map.get("Listas") ;
		for(int i  = 0; i < Apollo2.size() ; i++ ) {
			Cosa = Apollo2.get(i);
			Apollo.addAll(((Lista) Cosa).getTags()) ;
		}
		Apollo2 = Map.get("Objetos") ;
		for(int i  = 0; i < Apollo2.size() ; i++ ) {
			Cosa = Apollo2.get(i);
			Apollo.addAll(((Objeto) Cosa).getTags()) ;
		}
		
		return Apollo;
	}
}
