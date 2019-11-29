package karol_parcial.parcial;

public class Hoja extends Ministerio{
	
	

	public Hoja(String nombre) {
		super(nombre);
	}

	@Override
	public void agregar(Ministerio ministerio) {
		System.out.println("Una hoja, no se puede ingresar.");
		
	}

	@Override
	public void eliminar(Ministerio ministerio) {
		System.out.println("Una hoja, no se eliminan");
		
	}

	@Override
	public void mostrar(int nivel) {
		
		System.out.println("\t\tHOJA: "+nombre+", nivel: " + nivel+", Tam: "+nombre.length());
		
	}

	@Override
	public void calcular(Ministerio ministerio, int ma) {
		
		System.out.println("\t\tHOJA: "+nombre+", # letras: " + nombre.length());
		
	}

}
