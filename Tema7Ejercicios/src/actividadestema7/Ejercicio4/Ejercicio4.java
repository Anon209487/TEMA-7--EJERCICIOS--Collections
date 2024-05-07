/**
 * 
 */
package actividadestema7.Ejercicio4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class Ejercicio4 {

	/**
	 * 
	 */
	public Ejercicio4() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int intentos = 0;
		String nombre = "";
		List<Nombre> nombres = new ArrayList<Nombre>();
		while (intentos < 5) {
			System.out.println("Introduzca un nombre ");
			nombre = extracted().nextLine();
			Nombre nuevoNombre = new Nombre(nombre);
			if (!nombres.contains(nuevoNombre)) {
				nombres.add(nuevoNombre);
				intentos++;
			} else {
				System.out.println("El nombre " + nombre + " ya esta en la lista ");
			}

		}
		Collections.reverse(nombres);
		intentos = 5;
		for (Nombre n : nombres) {
			System.out.println("numero :" + intentos + " " + n);
			intentos--;
		}

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
