package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "do-while".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030203 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion do-while";
	}

	/**
	 * Instruccion do-while - Ejercicio1.
	 *
	 * Programar el codigo que ofrezca un menu de opciones al usuario  hasta que seleccione la opcion salir.
	 * 
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int i,a;
		do {
			System.out.println("\nSeleccione una opcion: ");
			System.out.println("(1) Si quiere ver un mensaje");
			System.out.println("(2) Si quiere ver otro mensaje");
			System.out.println("(3) Si quiere salir");
			a=Teclado.readInteger();
			if (a==1){
				System.out.println("\nBuenas tardes!");
			}else{
				if (a==2){
					System.out.println("\nBuenos días!");
				}
			}
		}
		while (a!=3);
		


		
        // Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio2.
	 *
	 * Programar el  codigo que lea numeros enteros hasta que el usuario introduzca un valor igual a cero 
	 * o hasta que el usuario introduzca dos veces seguidas el mismo numero.
	 * 
	 * Similar al  ejercicio02() de la clase Apartado030202 pero empleando la sentencia do-while).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int a,b;
		a=1;
		b=0;

		do{ 
			b=a;

			System.out.println("Introduzca un número: ");
			a=Teclado.readInteger();
		}
		while((a!=b) && (a!=0));
		



		// Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio3.
	 *
	 * Programar el codigo que lea la base y la altura de un numero indeterminado de rectangulos y
	 * cree los correspondientes objetos de tipo Rectangulo. Para cada rectangulo el programa mostrara 
	 * por pantalla su area y si es un cuadrado o un rectangulo. El programa terminara cuando alguno 
	 * de los lados del cuadrilatero sea menor o igual que  0.
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion

		int base=0,altura=0;

		do{
				System.out.println("Introduzca la base del rectángulo: ");
				base=Teclado.readInteger();
				System.out.println("Introduzca la altura del rectángulo: ");
				altura=Teclado.readInteger();
				//llamamos a la clase Rectangulo
				Rectangulo rectangulo=new Rectangulo(base,altura);
				//llama a la funcion getArea en rectangulo (que es Rectangulo)
				long areas = rectangulo.getArea();
        		System.out.println("El area es: "+areas);
        		//llamamos a funcion esUnCuadrado en rectangulo (Rectangulo)
        		boolean cuadrado = rectangulo.esUnCuadrado();
        		System.out.println("Es un cuadrado: "+cuadrado);
			
		}
		while((base>0) && (altura>0));




		// Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio4.
	 *
	 * Programar el codigo que dado un numero entero introducido por teclado indique si es o no perfecto.
	 * Un numero entero es perfecto si es igual a la suma de los sus divisores positivos menores que el.
	 * Ejemplos
	 * <ul>
	 * <li>6 es perfecto porque
	 * <ul>
	 * <li>	Sus divisores menores que el  son 1, 2, 3  y
	 * <li> 1 + 2 + 3 = 6;
	 * </ul>
	 * <li> 8 no es perfecto porque
	 * <ul>
	 * <li>	Sus divisores menores que el son 1, 2,4  y
	 * <li> 1 + 2 + 4  !=  8;
	 * </ul>
	 * </ul>
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int num,i,suma=0;
		System.out.println("Introduzca un número: ");
		num=Teclado.readInteger();

		do{
			for(i=1;i<num;i++){
				if(num%i==0){
					suma=suma+i;
					System.out.println("Los divisores del número "+num+" son: "+i);
				}
			}

			if(suma==num){
				System.out.println("El número "+num+" es un número perfecto");
			}else{
				System.out.println("El número "+num+" no es un número perfecto");
			}
		}
		while(num<0);



		// Fin modificacion
	}
}
