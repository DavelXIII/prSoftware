package redSocial;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Principal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
