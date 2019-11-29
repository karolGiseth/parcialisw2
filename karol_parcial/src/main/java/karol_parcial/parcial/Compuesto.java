package karol_parcial.parcial;

import java.util.ArrayList;
import java.util.List;

public class Compuesto extends Ministerio {

	private static List<Ministerio> almacenados = new ArrayList<>();

	public Compuesto(String nombre) {
		super(nombre);
	}

	public List<Ministerio> getOficinas() {
		return oficinas;
	}

	@Override
	public void agregar(Ministerio ministerio) {
		// TODO Auto-generated method stub
		oficinas.add(ministerio);
		
		
	}

	@Override
	public void eliminar(Ministerio ministerio) {
		// TODO Auto-generated method stub
		oficinas.add(ministerio);
	}

	
	
	@Override
	public void mostrar(int nivel) {
		// TODO Auto-generated method stub
		System.out.println(nombre + ", el nivel: " + nivel + ", Tamaño nombre: " + nombre.length());
		for (Ministerio ministerios : oficinas) {
			ministerios.mostrar(nivel + 1);
		}
	}

	@Override
	public void calcular(Ministerio ministerio, int ma) {
		int MAX = ma;
		System.out.println("Componente ingresado: " + ministerio.nombre + ", tamaño del nombre: "
				+ ministerio.nombre.length() + "\nLos hijos de mayor tamaño de esta RAMA en su cadena son: ");
		for (int i = 0; i < ministerio.oficinas.size(); i++) {

			if (MAX < ministerio.oficinas.get(i).nombre.length()) {
				MAX = ministerio.oficinas.get(i).nombre.length();
				almacenados.add(ministerio.oficinas.get(i));
				ministerio.oficinas.get(i).calcular(ministerio.oficinas.get(i), MAX);

			}

		}

	}
	
	public static void mostrar() {
		for (Ministerio ministerio2 : almacenados) {
			System.out.println(ministerio2.nombre + "-" + ministerio2.nombre.length());
		}
	}

}
