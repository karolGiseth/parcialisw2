package karol_parcial.parcial;

public class Main {

	public static void main(String[] args) {

		iniciar();

	}

	public static void iniciar() {

		Ministerio inicio = new Compuesto("");

		Compuesto oficina1 = new Compuesto("Despacho Ministerio");

		Hoja oficina2 = new Hoja("Oficina Asesora de Comunicaciones");
		Hoja oficina3 = new Hoja("Oficina de Cooperación y asuntos internacionales");
		Hoja oficina4 = new Hoja("Oficina asesora Jurídica");
		Hoja oficina5 = new Hoja("Oficina de Control Interno");
		Hoja oficina6 = new Hoja("Oficina Asesora de Planeación y Finanzas");
		Hoja oficina7 = new Hoja("Oficina de Tecnología y Sistemas de Información");
		Hoja oficina8 = new Hoja("Oficina de Innovación Educativa con Uso de Nuevas Tecnologías");

		Compuesto oficina9 = new Compuesto("Viceministerio de Educación Preescolar Básica y Media");
		Compuesto oficina10 = new Compuesto("Viceministerio de Educación  Superior");
		Compuesto oficina11 = new Compuesto("Secretaría General");

		Compuesto oficina12 = new Compuesto("Dirección de Calidad para la Educación Preescolar, Básica y Media");
		Compuesto oficina13 = new Compuesto("Dirección de Fortalecimiento a la Gestión Territorial");
		Compuesto oficina14 = new Compuesto("Dirección de Cobertura y Equidad");
		Compuesto oficina15 = new Compuesto("Dirección de Primera Infancia");

		Compuesto oficina16 = new Compuesto("Dirección de Calidad para la Educación Superior");
		Compuesto oficina17 = new Compuesto("Dirección de Fomento de la Educación Superior");

		Hoja oficina18 = new Hoja("Subdirección de Referentes y Evaluación de la Calidad Educativa");
		Hoja oficina19 = new Hoja("Subdirección de Fomento de Competencias");
		Hoja oficina20 = new Hoja("Programa todos a Aprender");

		Hoja oficina21 = new Hoja("Subdirección de Monitoreo y Control");
		Hoja oficina22 = new Hoja("Subdirección de Fortalecimineto Institucional");
		Hoja oficina23 = new Hoja("Subdirección de Recursos Humanos del Sector Educativo");

		Hoja oficina24 = new Hoja("Subdirección de Acceso");
		Hoja oficina25 = new Hoja("Subdirección de Permanencia");

		Hoja oficina26 = new Hoja("Subdirección de Cobertura de Primera Infancia");
		Hoja oficina27 = new Hoja("Subdirección de Calidad de Primera Infancia");

		Hoja oficina28 = new Hoja("Subdirección de Aseguramiento de la Calidad de la ES");
		Hoja oficina29 = new Hoja("Subdirección de Inspección y Vigilancia");

		Hoja oficina30 = new Hoja("Subdirección de Apoyo a la Gestión de la IES");
		Hoja oficina31 = new Hoja("Subdirección de Desarrollo Sectorial");

		Hoja oficina32 = new Hoja("Unidad de Atención al Ciudadano");
		Hoja oficina33 = new Hoja("Subdirección de Gestión Financiera");
		Hoja oficina34 = new Hoja("Subdirección de Desarrollo Organizacional");
		Hoja oficina35 = new Hoja("Subdirección de Talento Humano");
		Hoja oficina36 = new Hoja("Subdirección de Contratación");
		Hoja oficina37 = new Hoja("Subdirección de Gestión Administrativa");

		inicio.agregar(oficina1);
		oficina1.agregar(oficina2);
		oficina1.agregar(oficina3);
		oficina1.agregar(oficina4);
		oficina1.agregar(oficina5);
		oficina1.agregar(oficina6);
		oficina1.agregar(oficina7);
		oficina1.agregar(oficina8);
		oficina1.agregar(oficina9);
		oficina1.agregar(oficina10);
		oficina1.agregar(oficina11);
		oficina9.agregar(oficina12);
		oficina9.agregar(oficina13);
		oficina9.agregar(oficina14);
		oficina9.agregar(oficina15);
		oficina10.agregar(oficina16);
		oficina10.agregar(oficina17);
		oficina12.agregar(oficina18);
		oficina12.agregar(oficina19);
		oficina12.agregar(oficina20);
		oficina13.agregar(oficina21);
		oficina13.agregar(oficina22);
		oficina13.agregar(oficina23);
		oficina14.agregar(oficina24);
		oficina14.agregar(oficina25);
		oficina15.agregar(oficina26);
		oficina15.agregar(oficina27);
		oficina16.agregar(oficina28);
		oficina16.agregar(oficina29);
		oficina17.agregar(oficina30);
		oficina17.agregar(oficina31);
		oficina11.agregar(oficina32);
		oficina11.agregar(oficina33);
		oficina11.agregar(oficina34);
		oficina11.agregar(oficina35);
		oficina11.agregar(oficina36);
		oficina11.agregar(oficina37);

		inicio.mostrar(0);

		System.out.println("\nPARCIAL\n");
		
		//COMO SON COMPONENTES SE DEBE INGRESAR UN COMPONENTE, SI ES HOJA NO MOSTRARA PUES NO TENDRÁ COMPONENTES HIJOS
		//Se debe ingresar de las oficinas 9 a 17, o la oficina 1, ya que son componentes compuestos, el resto de oficinas son hojas, luego no
		//tienen componentes
		//se ingresa 0 ya que es el valor ingresado por burbuja para ir comparando los tamaños del nombre
		inicio.calcular(oficina1, 0);
		
		//muestra una lista con los valores más grandes encontrados de menor a mayor
		System.out.println();
		Compuesto.mostrar();
	}

}
