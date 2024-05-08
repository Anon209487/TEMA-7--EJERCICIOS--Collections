/**
 * 
 */
package actividadestema7.Ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class Ejercicio5 {

	/**
	 * 
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion = 0;
		List<Serie> series = new ArrayList<Serie>();
		while (opcion != 5) {
			opcion = menu();
			switch (opcion) {
			case 1: {
				anyadirSerie(series);
				break;
			}
			case 2: {
				buscarValoracionSerie(series);
				break;
			}
			case 3: {
				eliminarSerie(series);
				break;
			}
			case 4: {
				ImprimirSeries(series);
				break;
			}
			case 5: {
				System.out.println("salida ");
				break;
			}
			}
		}

	}

	private static void eliminarSerie(List<Serie> series) {
		Iterator<Serie> iter = series.iterator();
		String nombre = "";
		System.out.println("Introduzca un nombre ");
		nombre = extracted().nextLine();
		Serie nuevaSerie = new Serie(nombre);
		while (iter.hasNext()) {
			Serie s = iter.next();
			if (s.equals(nuevaSerie)) {
				iter.remove();
			}
		}
	}

	private static void buscarValoracionSerie(List<Serie> series) {
		String nombre = "";
		System.out.println("Introduzca un nombre ");
		nombre = extracted().nextLine();
		Serie nuevaSerie = new Serie(nombre);
		for (Serie n : series) {
			if ((n.equals(nuevaSerie))) {
				System.out.println("La valoracion es " + n.getValoracion());
			}

		}
	}

	private static int menu() {
		int opcion;
		System.out.println("1 Agregar serie: ");
		System.out.println("2 Buscar serie: ");
		System.out.println("3 Eliminar serie: ");
		System.out.println("4 Listar: ");
		System.out.println("5 Salir: ");
		opcion = extracted().nextInt();
		return opcion;
	}

	private static void anyadirSerie(List<Serie> series) {
		String nombre = "";
		System.out.println("Introduzca un nombre ");
		nombre = extracted().nextLine();
		Serie nuevaSerie = new Serie(nombre);

		if (!series.contains(nuevaSerie)) {
			series.add(nuevaSerie);
		} else {
			System.out.println("El nombre " + nombre + " ya esta en la lista ");
		}
	}

	private static void ImprimirSeries(List<Serie> series) {
		for (Serie n : series) {
			System.out.println("seire " + n);

		}
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
