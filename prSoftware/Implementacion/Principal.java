package redSocial;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(new Usuario("Juan", "I like trains", 0, "España"));
		usuarios.add(new Usuario("Pepe", "Pass", 1, "Inglaterra"));
		usuarios.add(new Usuario("Danielo", "Arroz con leche", 2, "Francia"));
		usuarios.add(new Usuario("Agustin", "Palindromo", 3, "Italia"));
		usuarios.add(new Usuario("Mario", "O Joseas o te Josean asin de claro", 4, "Islandia"));
		
		List<Canal> canales = new ArrayList<>();
		canales.add(new Canal("Cine clasico", "Cine", "Descripcion"));
		canales.add(new Canal("Comida rusa", "Cocina", "Descripcion"));
		
		usuarios.get(0).añadirCanal(canales.get(0));
		usuarios.get(1).añadirCanal(canales.get(0));
		usuarios.get(2).añadirCanal(canales.get(1));
		usuarios.get(3).añadirCanal(canales.get(1));
		usuarios.get(4).añadirCanal(canales.get(0));
		
		usuarios.get(0).realizarBusqueda("Cocina");
		usuarios.get(0).obtenerRecomendaciones();
		
	}
}
