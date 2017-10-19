import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado =new Scanner (System.in);
	
		List<String> listadoNombres= new ArrayList <String>();
		
		String nombre="";
		
		
		do {
		
			
			System.out.println("Introduce un nombre: ");
			nombre=teclado.next();
			listadoNombres.add(nombre);
			
		
		
		}while(!nombre.equals("/exit"));
		
		for(int i=0; i<listadoNombres.size()-1;i++) {
			
			System.out.println(listadoNombres.get(i));
		}

	}

}
