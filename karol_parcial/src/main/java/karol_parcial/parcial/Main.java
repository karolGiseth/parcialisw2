package karol_parcial.parcial;

public class Main {

	public static void main(String[] args) {

		iniciar();

	}

	public static void iniciar() {

		Ministerio inicio = new Compuesto("");

		Compuesto oficina1 = new Compuesto("Despacho Ministerio");

		Hoja oficina2 = new Hoja("Oficina Asesora de Comunicaciones");
		Hoja oficina3 = new Hoja("Oficina de Cooperaci�n y asuntos internacionales");
		Hoja oficina4 = new Hoja("Oficina asesora Jur�dica");
		Hoja oficina5 = new Hoja("Oficina de Control Interno");
		Hoja oficina6 = new Hoja("Oficina Asesora de Planeaci�n y Finanzas");
		Hoja oficina7 = new Hoja("Oficina de Tecnolog�a y Sistemas de Informaci�n");
		Hoja oficina8 = new Hoja("Oficina de Innovaci�n Educativa con Uso de Nuevas Tecnolog�as");

		Compuesto oficina9 = new Compuesto("Viceministerio de Educaci�n Preescolar B�sica y Media");
		Compuesto oficina10 = new Compuesto("Viceministerio de Educaci�n  Superior");
		Compuesto oficina11 = new Compuesto("Secretar�a General");

		Compuesto oficina12 = new Compuesto("Direcci�n de Calidad para la Educaci�n Preescolar, B�sica y Media");
		Compuesto oficina13 = new Compuesto("Direcci�n de Fortalecimiento a la Gesti�n Territorial");
		Compuesto oficina14 = new Compuesto("Direcci�n de Cobertura y Equidad");
		Compuesto oficina15 = new Compuesto("Direcci�n de Primera Infancia");

		Compuesto oficina16 = new Compuesto("Direcci�n de Calidad para la Educaci�n Superior");
		Compuesto oficina17 = new Compuesto("Direcci�n de Fomento de la Educaci�n Superior");

		Hoja oficina18 = new Hoja("Subdirecci�n de Referentes y Evaluaci�n de la Calidad Educativa");
		Hoja oficina19 = new Hoja("Subdirecci�n de Fomento de Competencias");
		Hoja oficina20 = new Hoja("Programa todos a Aprender");

		Hoja oficina21 = new Hoja("Subdirecci�n de Monitoreo y Control");
		Hoja oficina22 = new Hoja("Subdirecci�n de Fortalecimineto Institucional");
		Hoja oficina23 = new Hoja("Subdirecci�n de Recursos Humanos del Sector Educativo");

		Hoja oficina24 = new Hoja("Subdirecci�n de Acceso");
		Hoja oficina25 = new Hoja("Subdirecci�n de Permanencia");

		Hoja oficina26 = new Hoja("Subdirecci�n de Cobertura de Primera Infancia");
		Hoja oficina27 = new Hoja("Subdirecci�n de Calidad de Primera Infancia");

		Hoja oficina28 = new Hoja("Subdirecci�n de Aseguramiento de la Calidad de la ES");
		Hoja oficina29 = new Hoja("Subdirecci�n de Inspecci�n y Vigilancia");

		Hoja oficina30 = new Hoja("Subdirecci�n de Apoyo a la Gesti�n de la IES");
		Hoja oficina31 = new Hoja("Subdirecci�n de Desarrollo Sectorial");

		Hoja oficina32 = new Hoja("Unidad de Atenci�n al Ciudadano");
		Hoja oficina33 = new Hoja("Subdirecci�n de Gesti�n Financiera");
		Hoja oficina34 = new Hoja("Subdirecci�n de Desarrollo Organizacional");
		Hoja oficina35 = new Hoja("Subdirecci�n de Talento Humano");
		Hoja oficina36 = new Hoja("Subdirecci�n de Contrataci�n");
		Hoja oficina37 = new Hoja("Subdirecci�n de Gesti�n Administrativa");

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
		
		//COMO SON COMPONENTES SE DEBE INGRESAR UN COMPONENTE, SI ES HOJA NO MOSTRARA PUES NO TENDR� COMPONENTES HIJOS
		//Se debe ingresar de las oficinas 9 a 17, o la oficina 1, ya que son componentes compuestos, el resto de oficinas son hojas, luego no
		//tienen componentes
		//se ingresa 0 ya que es el valor ingresado por burbuja para ir comparando los tama�os del nombre
		inicio.calcular(oficina1, 0);
		
		//muestra una lista con los valores m�s grandes encontrados de menor a mayor
		System.out.println();
		Compuesto.mostrar();
	}

}
