package actividadestema7;

public class Nombre {
	private String nombre = "";

	public Nombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean equals(Object o) {
		boolean res = false;
		Nombre nombreComparacion = (Nombre) o;
		if (nombre.equals(nombreComparacion.nombre)) {
			res = true;
		}
		return res;
	}

	public String toString() {
		nombre = "nombre: " + nombre + "\n";

		return nombre;
	}
}
