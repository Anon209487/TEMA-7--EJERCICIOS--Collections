package actividadestema7.Ejercicio5;

public class Serie {
	private String nombre = "";
	private int valoracion = 5;

	public Serie(String nombre) {
		this.nombre = nombre;
	}

	public Serie(String nombre, int valoracion) {
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

	/**
	 * @return the valoracion
	 */
	public int getValoracion() {
		return valoracion;
	}

	/**
	 * @param valoracion the valoracion to set
	 */
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public boolean equals(Object o) {
		boolean res = false;
		Serie nombreComparacion = (Serie) o;
		if (nombre.equals(nombreComparacion.nombre)) {
			res = true;
		}
		return res;
	}

	public String toString() {
		nombre = "nombre: " + nombre + "\n";
		nombre += "valoracion: " + valoracion + "\n";
		return nombre;
	}

}
