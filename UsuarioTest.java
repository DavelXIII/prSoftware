package redSocial;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	
	public ArrayList<Cosas> usuarios = new ArrayList<>();
	public ArrayList<Cosas> usuarios2 = new ArrayList<>();
	public ArrayList<Cosas> usuarios3 = new ArrayList<>();
	public ArrayList<Cosas> usuarios4 = new ArrayList<>();
	public ArrayList<Cosas> canales = new ArrayList<>();
	public ArrayList<Cosas> listas = new ArrayList<>();
	public ArrayList<Cosas> objetos = new ArrayList<>();
	
	Usuario u1 = new Usuario("u1", "c1", 1);
	Usuario u2 = new Usuario("u2", "c2", 2);
	Usuario u3 = new Usuario("u3", "c3", 3);
	Usuario u4 = new Usuario("u4", "c4", 4);
	Usuario u5 = new Usuario("u5", "c5", 5);
	Usuario u6 = new Usuario("u6", "c6", 6);
	Usuario u7 = new Usuario("u7", "c7", 7);
	Usuario u8 = new Usuario("u8", "c8", 8);
	Usuario u9 = new Usuario("u9", "c9", 9);
	Usuario u10 = new Usuario("u10", "c10", 10);
	Usuario u11 = new Usuario("u11", "c11", 11);
	
	Map<String,ArrayList<Cosas>> mapMini = new HashMap<>();
	Map<String,ArrayList<Cosas>> mapMini2 = new HashMap<>();
	Map<String,ArrayList<Cosas>> mapMini3 = new HashMap<>();
	Map<String,ArrayList<Cosas>> mapMini4 = new HashMap<>();
	Map<String, Map<String ,ArrayList<Cosas>>> mapMaxi = new HashMap<>();
	Map<String, Map<String ,ArrayList<Cosas>>> mapMaxi2 = new HashMap<>();
	Map<String, Map<String ,ArrayList<Cosas>>> mapMaxi3 = new HashMap<>();
	Map<String, Map<String ,ArrayList<Cosas>>> mapMaxi4 = new HashMap<>();
	
	String tag;
	
	
	
	
	
	Set<Cosas> usuariosc = new HashSet<>();
	
	Set<Cosas> usuarios2c = new HashSet<>();
	
	Set<Cosas> usuarios3c = new HashSet<>();
	
	Set<Cosas> usuarios4c = new HashSet<>();

	
	@Before
	void inicializar0() {
		u4.AñadirTagsPropias("tag");
		u5.AñadirTagsPropias("tag");
		u6.AñadirTagsPropias("tag");
		
		usuarios2.add(u3);
		usuarios2.add(u4);
		usuarios2.add(u5);
		usuarios2.add(u6);
		mapMini2.put("Usuarios", usuarios2);
		mapMini2.put("Canales", null);
		mapMini2.put("Listas", null);
		mapMini2.put("Objetos", null);
		mapMaxi2.put("tag", mapMini2);
	}
	
	@Test
	void RecomendarSinTags() {
		 
		 
		 assertEquals(u3.recomendar(mapMaxi2), usuariosc);
	}
	
	@Before
	void Inicializar() {
		u1.AñadirTagsRecomendar("tag");
		u2.AñadirTagsPropias("tag");

		usuarios.add(u1);
		usuarios.add(u2);
		usuarios.add(u2);
		usuarios.add(u2);
		mapMini.put("Usuarios", usuarios);
		mapMini.put("Canales", null);
		mapMini.put("Listas", null);
		mapMini.put("Objetos", null);
		mapMaxi.put("tag", mapMini);
		
		
		
		
		Usuario User =  new Usuario("u2", "c2", 2);
				
		usuarios2c.add(User);
		usuarios2c.add(User);
		usuarios2c.add(User);
		
		
	}
	
	@Test
	void Recomendar3Iguales() {
		 
		 
		 assertEquals(u1.recomendar(mapMaxi), usuarios2c);
	}
	
	@Before
	void Inicializar2() {
		
		u7.AñadirTagsRecomendar("tag");
		u8.AñadirTagsPropias("tag");
		u9.AñadirTagsPropias("tag");
		u10.AñadirTagsPropias("tag");
		
		usuarios3.add(u7);
		usuarios3.add(u8);
		usuarios3.add(u9);
		usuarios3.add(u10);
		mapMini3.put("Usuarios", usuarios3);
		mapMini3.put("Canales", null);
		mapMini3.put("Listas", null);
		mapMini3.put("Objetos", null);
		mapMaxi3.put("tag", mapMini3);
		
		
		
		Usuario User =   new Usuario("u8", "c8", 8);
		Usuario User2 =  new Usuario("u9", "c9", 9);
		Usuario User3 =  new Usuario("u10", "c10", 10);		
		usuarios3c.add(User);
		usuarios3c.add(User2);
		usuarios3c.add(User3);	
		
	}
	@Test
	void Recomendar3Distintos() {
		 
		 
		 assertEquals(u7.recomendar(mapMaxi3), usuarios3c);
	}
	
	
	
	@Before
	void inicializar3() {
		u11.AñadirTagsPropias("tag");
		u11.AñadirTagsRecomendar("tag");
		usuarios4.add(u11);
		mapMini4.put("Usuarios", usuarios4);
		mapMini4.put("Canales", null);
		mapMini4.put("Listas", null);
		mapMini4.put("Objetos", null);
		mapMaxi4.put("tag", mapMini4);
		
		
		
		
	}
	
	@Test
	void RecomendarElMismo() {
		 assertEquals(u11.recomendar(mapMaxi4), usuarios4c);
	}
	
	
}
