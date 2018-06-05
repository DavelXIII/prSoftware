package redSocial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CargaDatos {
	
	public Map<String, List<Cosas>> getMap() {
		return data;
	}
	
	private Map<String,List<Cosas>> data = new HashMap<>();
	
	private void loadFile(String filename) {
		try(Scanner sc = new Scanner(new File(filename))) {
			readFile(sc);
		} catch(FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		}
	}
	
	private void readFile(Scanner sc){
		List<Cosas> values = new ArrayList<>();
		String domainName = null;
		int order = 1;
		int id = 1;
		int counter = 0;
		while(sc.hasNextLine()){
			String newline = sc.nextLine();
			if (newline.isEmpty()) {
			      continue; //Exit this iteration if line starts with space or //
			   }
			try(Scanner scn = new Scanner(newline)){
				scn.useDelimiter("[ ,.;:]+");
				if(order == 1) {
					String name;
					String pass;
					while(scn.hasNext()) {
						name = scn.next();
						if(name.equals("+")) {
							data.put("Usuarios", values);
							order = 2;
						} else {
							pass = scn.next();
							values.add(new Usuario(name, pass, id));
							id++;
						}
					}
				
				} else if(order == 2) {
					values = new ArrayList<>();
					String nombre;
					String tematica;
					StringBuilder descripcion = null;
					while(scn.hasNext()) {
						nombre = scn.next();
						if(nombre.equals("+")) {
							data.put("Canales", values);
							order = 3;
						} else {
							tematica = scn.next();
							while(scn.hasNext()) {
								descripcion.append(scn.next()).append(" ");
							}
							values.add(new Canal(nombre, tematica, descripcion.toString()));
						}
					}
				} else if(order == 3) {
					String nombre;
					List<Cosas> listas = new ArrayList<>();
					List<Objeto> objLista = new ArrayList<>();
					Set<Objeto> objs = new HashSet<>();
					while(scn.hasNext()) {
						nombre = scn.next();
						if(nombre.equals("+")) {
							data.put("Listas", listas);
							List<Cosas> objsList = new ArrayList<>();
							objsList.addAll(objs);
							data.put("Objetos", (List<Cosas>) objsList);
						} else {
							Objeto obj;
							nombre = scn.next();
							while(scn.hasNext()) {
								obj = new Objeto(scn.next(), id);
								objLista.add(obj);
								objs.add(obj);
								id++;
							}
							listas.add(new Lista(nombre, objLista));
						}
					}
				}			
			}
		}
	}
}
