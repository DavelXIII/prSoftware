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

public class CargaDatos extends Cosas {
	
	private Map<String, List<Cosas>> map;
	private String filename = "datos.txt";
	
	public CargaDatos() {
		map = new HashMap<>();
	}
	
	public void loadFile(String filename) {
		try(Scanner sc = new Scanner(new File(filename))) {
			readFile(sc);
		} catch(FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		}
	}
	
	private void readFile(Scanner sc){
		List<Cosas> values = new ArrayList<>();
		String domainName = null;
		int counter = 0;
		while(sc.hasNextLine()){
			String newline = sc.nextLine();
			if (newline.isEmpty()) {
			      continue; //Exit this iteration if line starts with space or //
			   }
			try(Scanner scn = new Scanner(newline)){
				scn.useDelimiter("[ ,.;:]+");
				switch(scn.next().toLowerCase()) {
				case "Canales":
					domainName = scn.next();
					break;
				case "Usuarios":
					while(scn.hasNext()) {
						values.add(scn.next());
					}
					break;
				case "Objetos":
					while(scn.hasNext()) {
						adjacents.add(new Tuple(domainName, scn.next()));
					}
					break;
				case "Listas":
					this.constraint = scn.next();
					while(scn.hasNext()) {
						constraints.add(new Tuple(domainName, scn.next()));
					}
					break;
				}
				counter++;

				if(counter == 4) {
					domains.put(domainName, new HashSet<String>());
					Set<String> aux1 = domains.get(domainName);
					aux1.addAll(values);
					
					counter = 0;
					//System.out.println("Domain: " + domainName + "\nValues:" +  values.toString() + "\nAdjacents: " + adjacents + "\nConstraint: " + this.constraint + "\nScope: " + constraints.toString() + "\n");
				}
			}
		}
	}
}
