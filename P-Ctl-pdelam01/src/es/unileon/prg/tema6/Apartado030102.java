package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instruccion "if-else".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion if-else";
	}

	/**
	 * Instruccion if-else - Ejercicio1.
	 *
	 * </br>
	 *
	 * Realizar las modificaciones necesarias para que al ejecutar el metodo se ofrezca 
	 * al usuario la posibilidad de obtener el area o el perimetro del rectangulo.
	 * 
	 */
	public void ejercicio01() {
		cabecera("01","");

		Rectangulo rectangulo=new Rectangulo(10,5);
		System.out.println("Introduce una opcion (1 -Area, 2 -Perimetro):");
		// Inicio modificacion
        
        int a;
        a=Teclado.readInteger();
        if(a==1){
        	long h = rectangulo.getArea();
        	rectangulo.getArea();
        	System.out.println("El área del rectángulo es: " +h);
        }else{
        	if(a==2){
        		long d = rectangulo.getPerimetro();
        		rectangulo.getPerimetro();
        		System.out.println("El perímetro del rectángulo es: " +d);
        	}
        }
		
		// Fin modificacion
	}

	/**
	 * Instruccion if-else - Ejercicio2.
	 *
	 *  Realizar las modificaciones necesarias para que al ejecutar el metodo  se ofrezca al 
	 *  usuario la posibilidad de introducir un anio por el teclado y se le diga si es un anio bisiesto o no.
	 *  Un anio es bisiesto si es multiplo de 400 o si es multiplo de 4 sin serlo de 100
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");
		// Inicio modificacion
		int a;
		System.out.println("Introduzca un año: ");
		a=Teclado.readInteger();

		if ((a % 400 == 0) || ((a % 100 != 0) && (a % 4 == 0))){
    		System.out.println("El año es bisiesto");
    		}else{
    			System.out.println("El año no es bisiesto");
    		}

		
		// Fin modificacion
	}

	/**
	 * Instruccion if-else - Ejercicio3.
	 *
	 * Se pide
	 * 
	 * <ul>
	 * <li> Quitar los comentarios indicados y compilar  el metodo 03.
	 * <li> Identificar los errores de compilacion.
	 * <li> Explicar en el fichero LEEME.TXT los errores existentes.
	 * <li> Implementar el metodo int compareTo(NumeroEntero n) de la clase NumeroEntero de forma que:
	 * <ul>
	 * <li>	retorne -1 si el valor del NumeroEntero sobre el que se ejecuta el metodo  
	 * 		es menor que  el valor del numero n.
	 * <li> retorne 0 si el valor de los dos objetos NumeroEntero son iguales.
	 * <li> retorne 1 si el valor del NumeroEntero sobre el que se ejecuta el metodo  
	 * 		es mayor que  el valor del numero n.
	 * </ul>
	 * <li> Modificar el  metodo realizando las comparaciones entre los numeros usando  el metodo compareTo.
	 * <li> Compilar y ejecutar el metodo y analizar los resultados obtenidos.
	 * </ul>
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "");

        //Inicio modificacions
		
        NumeroEntero n1 = new NumeroEntero(10);
        NumeroEntero n2 = new NumeroEntero(10);
        
        
        if (n1.compareTo(n2)==1){
        	 System.out.println("N1-> "+n1);
             System.out.println("N1 es mayor que N2");
        }else{
         	if (n1.compareTo(n2)==-1) {
            	System.out.println("N1 -> "+n1);
            	System.out.println("N1 es menor que N2");
        	}else{
           		System.out.println("N1 y N2 son iguales -> N1 ->"+n1+" N2 -> "+n2);
				}
		}
		// Fin modificacion*/
		
	}

	/**
	 * Instruccion if-else - Ejercicio4.
	 *
	 * </br>
	 *
	 * 
	 * Modificar el metodo para que al ejecutarlo se le pida al usuario que introduzca dos numeros 
	 * y a continuacion se le ofrezcan las siguientes opciones:
	 * <ul>
	 * <li>	1 - Sumar: Se mostrara por pantalla la suma de los numeros
	 * <li> 2 - Multiplicar:Se mostrara por pantalla la multiplicacion de los dos numeros
	 * <li> 3 - Divisores:	Se mostrara por pantalla: si el primero es divisor del segundo, si el segundo es divisor del primero o si ninguno es divisor del otro.
	 *  		Si no introduce ninguna de las opciones se mostrara el mensaje : Opcion incorrecta
	 *  </ul>
	 *  	 
	 */
	public void ejercicio04() {
		cabecera("04", "");

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

		if(c==1){
			suma=a+b;
			System.out.println("El resultado de la suma de " +a+ " y " +b+" es: " +suma);
		}else{
			if(c==2){
				mult=a*b;
				System.out.println("El resultado de la multiplicación entre "+a+ " y "+b+" es: "+mult);
			}else{
				if(c==3){
					if(a%b==0){
						System.out.println("El número "+a+" es divisible por "+b);
					}else{
						if(b%a==0){
							System.out.println("El número "+b+" es divisible por "+a);
						}else{
							System.out.println("Los números "+a+" y "+b+" no son divisibles");
						}
					}
				}
			}
		}    




		// Fin modificacion
	}

	/**
	 * Instruccion if-else - Ejercicio5.
	 *
	 * Crear una clase denominada Ecuacion2Grado que tenga como atributos los coeficientes de 
	 * una ecuacion de segundo grado (a,b,c)  (ax2 +bx +c=0). Definir e implementar los siguientes metodos
	 * <ul>
	 * <li>	Un constructor que reciba los tres coeficientes de la ecuacion que se va a crear (a,b,c)
	 * <li>	Tres metodos get para cada uno de sus atributos.
	 * <li> Un metodo numeroDeSoluciones que retorne el numero de  soluciones de la ecuacion.
	 * <li> El metodo String toString() que retorne un String representativo de la ecuacion indicando el numero de soluciones que tiene 
	 * 		y el valor para cada una de las soluciones que tenga.
	 * </ul>
	 * 
	 * Probar la clase realizando las modificaciones necesarias y ejecutando el metodo ejercicio5().
	 * 
	 */
	public void ejercicio05() {
		cabecera("05","");

		int a=2, b=-3, c=-4; //Modificar los valores para realizar pruebas o leerlos por teclado
		
		EcuacionSegundoGrado ecuacion=new EcuacionSegundoGrado(a,b,c);
		// Inicio modificacion
		System.out.println(ecuacion);





        // Fin modificacion
	}

	/**
	 * Instruccion if-else - Ejercicio6.
	 *
	 * Modificar el metodo  para que al ejecutarlo se le pida al usuario que introduzca tres numeros  
	 * y se indique cual es el mayor de los tres. Tambien se informara si hay dos o tres numeros iguales
	 * y cuales son. 
	 *
	 */
	public void ejercicio06() {
		cabecera("06", "");

		// Inicio modificacion
		int a,b,c,big;
		System.out.println("Introduzca un número: ");
		a=Teclado.readInteger();
		System.out.println("Introduzca un segundo número: ");
		b=Teclado.readInteger();
		System.out.println("Introduzca un tercer número: ");
		c=Teclado.readInteger();

		big=a;
		if(a==b && (a==c) && (b==c)){
			System.out.println("Los tres números ("+a+", "+b+", "+c+") son iguales");
		}else{
			if(big<b){
			big=b;
			}else{
				if(big<c){
				big=c;
				}else{
					if(a==b){
						System.out.println("El primer número y el segundo son iguales");
					}else{
						if(a==c){
							System.out.println("El primer número y el tercero son iguales");
						}else{
							if(b==c){
								System.out.println("El segundo número y el tercero son iguales");
							}
						}
					}
				}
			}System.out.println("El mayor número de entre los introducidos ("+a+", "+b+", "+c+") es el: "+big);
		}
	
		// Fin modificacion
	}
}
