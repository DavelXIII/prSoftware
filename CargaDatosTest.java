package redSocial;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.UIManager.LookAndFeelInfo;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CargaDatosTest {
	
	private Map<String,List<Cosas>> data = new HashMap<>();
	
	private Map<String,List<Cosas>> data2 = new HashMap<>();
	
	
	@Before
	void inicializarManual() {
		
		List<Cosas> values = new ArrayList<>();
		Map<String,List<Cosas>> data = new HashMap<>();
		
		values.add(new Usuario("User1", "123", 1));
		values.add(new Usuario("User2", "123", 2));
		values.add(new Usuario("User3", "234", 3));
		
		data.put("Usuarios", values);
		
		values = new ArrayList<>();
		
		
		values.add(new Canal("literatura1", "literatura", "Esto es genial"));
		
		values.add(new Canal("juegos2", "videojuegos", "Todo aqui"));
		
		data.put("Canales", values);
		
		List<Cosas> listas = new ArrayList<>();
		List<Objeto> objLista = new ArrayList<>();
		Set<Objeto> objs = new HashSet<>();
		
		Objeto obj;
		
		obj = new Objeto("obj1", 4);
		objLista.add(obj);
		objs.add(obj);
		
		obj = new Objeto("obj2", 5);
		objLista.add(obj);
		objs.add(obj);
		
		obj = new Objeto("obj3", 6);
		objLista.add(obj);
		objs.add(obj);
		
		obj = new Objeto("obj4", 7);
		objLista.add(obj);
		objs.add(obj);
		
		listas.add(new Lista("lista1", objLista));
		
		objLista = new ArrayList<>();
		
		obj = new Objeto("obj5", 8);
		objLista.add(obj);
		objs.add(obj);
		
		obj = new Objeto("obj6", 9);
		objLista.add(obj);
		objs.add(obj);
		
		obj = new Objeto("obj7", 10);
		objLista.add(obj);
		objs.add(obj);
		
		obj = new Objeto("obj8", 11);
		objLista.add(obj);
		objs.add(obj);
		
		listas.add(new Lista("lista2", objLista));
		
		List<Cosas> objsList = new ArrayList<>();
		objsList.addAll(objs);
		
		data.put("Listas", listas);
		data.put("Objetos", (List<Cosas>) objsList);
	}
	
	
	
	@Test
	void CargaDatosContenido(){
		Map<String,List<Cosas>> aux = new HashMap<>();

		CargaDatos cd = new CargaDatos();
		
		cd.loadFile("redsocial");
		aux=cd.getMap();
		
		assertEquals(aux, data);
	}
	
	@Before
	void InicializarVacio() {
		List<Cosas> values2 = new ArrayList<>();
		  
		data2.put("Usuarios", values2);
		data2.put("Canales", values2);
		  
		List<Cosas> listas = new ArrayList<>();
		data2.put("Listas", listas);
		  
		List<Cosas> objsList = new ArrayList<>();
		data2.put("Objetos", (List<Cosas>) objsList);
	}
	
	
	
	  @Test 
	  public void ArchivoEstaVacio() {
		  Map<String,List<Cosas>> aux2 = new HashMap<>();

		  CargaDatos cd = new CargaDatos();
		  
		  cd.loadFile("test");
		  aux2 = cd.getMap();
		  
		 
		  
		  assertEquals(aux2, data2);
		  
		  /*
		  List<Cosas> vacio = new ArrayList<>();
		  assertEquals(aux.get("Usuarios"), vacio);
		  assertEquals(aux.get("Canales"), vacio);
		  assertEquals(aux.get("Listas"), vacio);
		  assertEquals(aux.get("Objetos"), vacio);
		  */
		  
		  
		  
	  }
	
}
