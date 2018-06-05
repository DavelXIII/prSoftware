package redSocial;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		List<Usuario> usuarios = new ArrayList<>();
		InputStream is = new InputStream() {
			
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		usuarios.add(new Usuario("Juan", "I like trains", 0, "España"));
		usuarios.add(new Usuario("Pepe", "Pass", 1, "Inglaterra"));
		usuarios.add(new Usuario("Danielo", "Arroz con leche", 2, "Francia"));
		usuarios.add(new Usuario("Agustin", "Palindromo", 3, "Italia"));
		usuarios.add(new Usuario("Mario", "O Joseas o te Josean asin de claro", 4, "Islandia"));
		
		List<Canal> canales = new ArrayList<>();
		canales.add(new Canal("Cine clasico", "Cine", "Descripcion"));
		canales.add(new Canal("Comida rusa", "Cocina", "Descripcion"));
		
		String e, b ;
		boolean rtr = false ;
		Usuario User = new Usuario("User", "User", 1);
		Map<String, ArrayList<Cosas>> Map = null ;
		RedSocial List = new RedSocial(Map);
		while(true) {
			switch(e =System.in.toString()) {
				case "canal" :
					System.out.println("Introduzca el canal a visitar");
					b = System.out.toString() ;
					break ;
				case "finalizar" :
					rtr = true ;
					break ;
				case "recomendar" :
					User.recomendar(List.getMapRed());
				case "Buscar" :
					System.out.println("Introduzca la palabra que desea buscar");
					b = System.out.toString() ;
					User.realizarBusqueda(b, List.getMapRed());
			}
			if(rtr) {
				break ;
			}
		}

	}
		
	}
}