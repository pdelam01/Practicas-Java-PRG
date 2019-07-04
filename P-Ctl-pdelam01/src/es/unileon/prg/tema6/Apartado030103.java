package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instrucciin "switch".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion switch";
	}

	/**
	 * Instruccion switch - Ejercicio1.
	 *
	 * Modificar el metodo  para que al introducir un calificacion numerica  por teclado(1-10) se muestre 
	 * la calificacion de forma textual (1-4 -> Insuficiente , 5 -> Suficiente, 6 -> Bien, 
	 * 7-8 -> Notable, 9 -> Sobresaliente, 10 -> Matricula)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int a;
		System.out.println("Introduzca una calificación del 1 al 10");
		a=Teclado.readInteger();
		switch(a){
			case 1:
			case 2:
			case 3:
			case 4:
			
				System.out.println("Insuficiente");
				break;
			
			case 5: System.out.println("Suficiente");
				break;
			case 6: System.out.println("Bien");
				break;
			case 7:
			case 8:
			
				System.out.println("Notable");
				break;
			
			case 9: System.out.println("Sobresaliente");
				break;
			case 10: System.out.println("Matricula");
				break;

			default: System.out.println("Esa cifra no se corresponde con un número entre el 1-10");

		}

        // Fin modificacion
	}


	/**
	 * Instruccion switch - Ejercicio2.
	 *
	 * Modificar el metodo  para que retorne el numero de anillos que tiene un digito entero 
	 * introducido por el teclado. Se definen los anillos de un digito como el numero de circulos
	 * que tiene un digito. Ej.: 0 -> 1 anillo, 2 -> 0 anillos, 8 -> 2 anillos, etc.).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int a;
		System.out.println("Introduzca un numero del -9 al 9");
		a=Teclado.readInteger();
		switch(a){
			case 0:
			case 6:
			case -6:
			case 9:
			case -9:
			
				System.out.println("Tiene un anillo");
				break;
			
			case 1:
			case -1:
			case 2:
			case -2:
			case 3:
			case -3:
			case 4:
			case -4:
			case 5:
			case -5:
			case 7:
			case -7:
			
				System.out.println("No tiene ningún anillo");
				break;
			
			case 8:
			case -8:
			
				System.out.println("Tiene dos anillos");
				break;
			
			default: System.out.println("Debe introducir un número entero de un dígito");
		}

		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio3.
	 *
	 * Modificar el metodo ejercicio3() del Apartado030103, utilizando una sentencia switch, 
	 * para que realice la misma funcionalidad que el metodo ejercicio4() del Apartado030102.
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		int a,b,c,suma,mult,div;
		System.out.println("Introduzca un número: ");
		a=Teclado.readInteger();
		System.out.println("Introduzca un segundo número: ");
		b=Teclado.readInteger();
		System.out.println("Pulse (1) si quiere sumarlos");
		System.out.println("Pulse (2) si quiere multiplicarlos");
		System.out.println("Pulse (3) si quiere ver si son o no divisibles");
		c=Teclado.readInteger();

		switch(c){
			case 1: suma=a+b;
				System.out.println("El resultado de la suma de " +a+ " y " +b+" es: " +suma);
				break;

			case 2: mult=a*b;
				System.out.println("El resultado de la multiplicación entre "+a+ " y "+b+" es: "+mult);
				break;

			case 3: if(a%b==0){
						System.out.println("El número "+a+" es divisible por "+b);
					}
					if(b%a==0){
						System.out.println("El número "+b+" es divisible por "+a);
					}
					if(a%b!=0 && b%a!=0){
						System.out.println("Los números "+a+" y "+b+" no son divisibles");
					}
					break;

			default:
				System.out.println("Introduzca un 1, 2 o 3");
		}







		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio4.
	 *
	 * Modificar el metodo ejercicio4() del Apartado030103  para que al introducir una cadena de caracteres 
	 * por teclado  se indique si el primer caracter de la cadena es una vocal escrita en minusculas, 
	 * si es una vocal escrita en mayusculas o si es otro tipo de caracter.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		String a;
		char nombre;
		System.out.println("Introduzca una palabra ");
		a=Teclado.readString();
		nombre = a.charAt(0);

		switch(nombre){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		{
			System.out.println("La cadena de caracteres '"+a+"' empieza por minúscula: "+nombre);
			break;
		}

		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		{
			System.out.println("La cadena de caracteres '"+a+"' empieza por mayúscula: "+nombre);
			break;
		}
		default:
			System.out.println("Debe introducir una cadena de caracteres que comience por una vocal!");
		}
		


		
		// Fin modificacion
		
	}
}
