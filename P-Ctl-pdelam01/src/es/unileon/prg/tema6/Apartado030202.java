package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "while".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030202 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion while";
	}

	/**
	 * Instruccion while - Ejercicio1.
	 *
	 * Programar el codigo que lea 10 numeros enteros por teclado y diga cual es el mayor 
	 * y el menor de todos ellos (similar al ejercicio05() de la clase Apartado030201 pero 
	 * utilizando la sentencia while)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int i,big,min,n,a;
		i=1;
		n=10;
		big=0;
		min=big;
		while(i<=10){
			i++;
			System.out.println("Introduzca un número: ");
			a=Teclado.readInteger();
			if(a>big){
				big=a;
			}

			if(a<min){
				min=a;
			}
		}
		System.out.println("El mayor de los números es: "+big+" y el menor es: "+min);
		
		
					
        // Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio2.
	 *
	 * Programar el  codigo que lea numeros enteros hasta que el usuario introduzca un valor igual 
	 * a cero  o hasta que el usuario introduzca dos veces seguidas el mismo numero.
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int a,b;
		a=1;
		b=0;

		while((a!=b) && (a!=0)){
			b=a;

			System.out.println("Introduzca un número: ");
			a=Teclado.readInteger();
		}
	
		
		// Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio3.
	 *
	 * Programar el codigo  que sume los numeros pares por un lado y los impares por otro  entre
	 * dos numeros enteros introducidos por el usuario.
	 * 
	 * Nota: similar al ejercicio06() de la clase Apartado030201 pero utilizando la sentencia while
	 * y sin suponer que el primer numero es siempre par)
	 * 
	 * Nota : Los numeros enteros se manejaran como objetos la clase NumeroEntero
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		int i,num1,num2,sumaPar,sumaImpar,a;
		System.out.println("Introduzca un número: ");
		num1=Teclado.readInteger();
		System.out.println("Introduzca un segundo número: ");
		num2=Teclado.readInteger();
		sumaPar=0;
		sumaImpar=0;
		a=num1;
		if(num1<num2){
			while(a<=num2){
				if(a%2==0){
					sumaPar=(sumaPar+a);
				}else{
					sumaImpar=(sumaImpar+a);
				}
				a++;
			}
		System.out.println("La suma de los números pares es: "+sumaPar);
		System.out.println("La suma de los números impares es: "+sumaImpar);
		}else{
			System.out.println("El primer número ha de ser menor que el segundo!");
		}





		// Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio4.
	 *
	 * Programar el codigo  que calcule la media, de una serie de numeros introducidos por teclado. 
	 * La serie acaba cuando se introduce el tercer 5. Los 5 introducidos se procesaran como numeros 
	 * de la serie, es decir, intervendran a la hora de calcular los valores pedidos.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int a,contador=0,acumulador=0,contador1=0;
		double media=0;

		while(contador<3){
			System.out.println("Introduzca un número: ");
			a=Teclado.readInteger();
			acumulador=acumulador+a;
			contador1=contador1+1;
			media=(double)acumulador/contador1;
			if(a==5){
			contador=contador+1;
			}
		}
		System.out.println("La media es: "+media);




		// Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio5.
	 *
	 * Modificar la clase NumeroEntero definiendo e implementando los siguientes metodos
	 * <ul>
	 * <li> int numeroDigitos():  retornara el numero de digitos del  numero.
	 * <li>	int inverso(): retornara el inverso del numero (Ej.: 23 -> 32)
	 * <li>	booleam  esCapicua(): retorna si el numero es o no capicua.
	 * </ul>
	 * 
	 * Probar los nuevos metodos de la clase numero en el metodo ejercicio05.
	 *
	 */
	public void ejercicio05() {
		cabecera("05","");

		// Inicio modificacion
		int n;

		System.out.println("Introduzca un número: ");
		n=Teclado.readInteger();

		NumeroEntero num = new NumeroEntero(n);

		int digitos = num.numeroDigitos();
		int inverso = num.inverso();

		System.out.println("El número introducido es el: "+n);
		System.out.println("El número "+n+" tiene un total de "+digitos+" dígitos");
		System.out.println("El número "+n+" al revés es: "+inverso);

		if(num.esCapicua()){
			System.out.println("Es capicua");
		}else{
			System.out.println("No es capicua");
		}





        // Fin modificacion
        
	}

	/**
	 * Instruccion while - Ejercicio6.
	 * 
	 * Teniendo en cuenta el siguiente diagrama de clases del enunciado de la practica
	 * 
	 * <ul>
	 * <li> La clase Partido representa partidos de tenis en los que intervienen dos jugadores
	 * <li> Cada jugador tiene un nombre y una puntuacion en el ranking de la ATP
	 * </ul>
	 * 
	 * Se pide:
	 * 
	 * <ul>
	 * <li>	Consultar el codigo de las clase Partido y Jugador
	 * <li>	Implementar el metodo jugar de la clase Partido
	 * <li>	Simulara que se juega el partido entre los dos jugadores generando el ganador de forma aleatoria
	 * <li>	El jugador con mayor puntuacion en la ATP tendra mayor posibilidad de ganar.
	 * <li> El ganador del partido aumentara en 1 punto su puntuacion en el ranking.
	 * <li>	Nota 1:
	 * <ul>	Una  forma de generar el ganador puede ser:
	 * <li>	
	 * <li>	resultado1= Math.random() * puntos_jugador1;
	 * <li> resultado2= Math.random() * puntos_jugador2;
	 * <li>  el que tenga mayor resultado ganara el partido
	 * </ul>
	 * <li>Nota 2:
	 * <ul>
	 * <li>Hay que tener en cuenta que el resultado puede ser empate, en este caso se volveran a generar resultados hasta que exista un ganador.
	 * <li>
	 * </ul>
	 * </ul>
	 *
	 */
	
	public void ejercicio06() {
		cabecera("06", "");
		
		Jugador j1=new Jugador("Federer",4);
        Jugador j2=new Jugador("Nadal",9);
        
        
        System.out.println("Los Jugadores del Partido son " + j1.getNombre() + " y "+j2.getNombre());
        
        Partido partido=new Partido(j1,j2);
        partido.jugar();
        
        System.out.println("El ganador es: "+ partido.ganador().getNombre());
	}
}
