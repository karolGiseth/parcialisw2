package karol_parcial.parcial;

import java.util.ArrayList;
import java.util.List;

//clase componente
public abstract class Ministerio {
	
	protected String nombre;
	protected List<Ministerio> oficinas = new ArrayList<>();
	
	public Ministerio(String nombre) {
		this.nombre = nombre;
	}
	abstract void agregar(Ministerio ministerio);
	abstract void eliminar(Ministerio ministerio);
	abstract void mostrar(int nivel);
	abstract void calcular(Ministerio ministerio, int tam);

}
