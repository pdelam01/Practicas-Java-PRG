package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales
 * y de repeticion anidadas.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030204 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Sentencias anidadas";
	}

	/**
	 * Sentencias anidadas - Ejercicio1.
	 *
	 * Programar el codigo que muestre todos los numeros perfectos comprendidos 
	 * entre dos numeros n1 y n2 introducidos por teclado
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int num1,num2,m,div=1,suma=0,suma2=0,i;

		System.out.println("Introduzca un número: ");
		num1=Teclado.readInteger();
		System.out.println("Introduzca un segundo número: ");
		num2=Teclado.readInteger();

			for (i=num1;i<num2;i++){
					if(i%div==0){
						suma=suma+div;
						div++;
					}
			}
				if(div==suma){
					System.out.println("El número "+i+" es perfecto");
				}else{
					System.out.println("El número "+i+" no es perfecto");
				}


		if(num1==num2){
			for(m=1;m<num1;m++){
				if(num1%m==0){
					suma2=suma2+m;
				}
			}

			if(suma2==num1){
				System.out.println("El número "+num1+" es un número perfecto");
			}else{
				System.out.println("El número "+num1+" no es un número perfecto");
			}
		}



        // Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio2.
	 *
	 * Un banco quiere implementar una aplicacion para detectar cheques falsificados. 
	 * Un cheque es falso si en su numero (compuesto por 10 digitos) hay: 3 o mas ceros seguidos 
	 * y/o cuatro o mas numeros distintos de cero seguidos.
	 * 
	 * Completar la clase Cheque para que detecte los cheques falsos.
	 * 
	 * Probar la clase Cheque  sobre el metodo ejercicio02() de la clase Apartado030204.
	 * 
	 */
	public void ejercicio02() {
		cabecera("02", "");

		Cheque cheque=null;
		
		//Modificar el numero de cheque para probar
		//cheque=new Cheque("1000988887");    
        cheque=new Cheque("1010098888");
        //cheque=new Cheque("1009808880");   
        
       
         if (cheque.esFalso()== true)
        	 System.out.println("El cheque es falso");
         else
             System.out.println("El cheque no es falso");
	}

	/**
	 * Sentencias anidadas  - Ejercicio3.
	 *
	 * Programar el codigo que genere dado un tamanio (entero) introducido por teclado los siguientes dibujos:
	 * 
	 * Ejemplo de ejecucion  
	 * 
	 * Introduce el tamanio: 4
	 * 	Triangulo
	 * 	*
	 * 	**
	 * 	***
	 * 	****
	 *
	 * 	Cuadrado Relleno
	 * 	****
	 * 	****
	 * 	****
	 *  ****
	 *  
	 *  Cuadrado vacio
	 *  ****
	 *  *  *
	 *  *  *
	 *  ****
	 * 
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		int lineas,cuenta=0;
		System.out.println("Introduzca el número de líneas que desea: ");
		lineas=Teclado.readInteger();

		//Triangulo
		System.out.println("\nTriangulo");
		for(int k=0;k<lineas+1;k++){
			for (int l=0;l<k;l++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// Cuadrado relleno
		System.out.println("\nCuadrado Relleno");
		for(int i=0;i<lineas;i++){
			for(int j=0;j<lineas;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//Cuadrado vacio
		System.out.println("\n Cuadrado vacio");
		for(int i=1; i<=lineas;i++){
			for(int j=1; j<=lineas;j++){
				if((i==1) || (j==1) || (i==lineas) || (j==lineas)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio4.
	 *
	 * 
	 * Programar el codigo que plantee un pequenio juego al usuario.
	 * <ul>
	 * <li>	El ordenador pensara un numero entre 1 y 100 (generar un numero aleatorio)
	 * <li>	El usuario dispondra de 5 intentos para acertar el numero.
	 * <li>	Por cada intento el ordenador indicara si el numero buscado es menor o mayor 
	 * 		 al introducido y se el usuario ha acertado.
	 * <li> Cuando se acierte el numero correcto debera mostrarse cuantos ensayos han sido 
	 * 		necesarios hasta llegar a la solucion.
	 * <li>	Una vez hecho esto debera preguntar si se desea empezar de nuevo con otro numero o 
	 * 		si desea terminar el juego.
	 *</ul>
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int intentos=0,opcion=0;
		int num=0;
		int a;
		int aleatorio=(int)(Math.random()*100+1);
		do{
			for (int i=0;i<=4;i++){
				System.out.println("Intenta adivinar crack!");
				intentos++;
				System.out.println("Ingrese un número: ");
				num=Teclado.readInteger();

				if(aleatorio>num){
					System.out.println("Estás por debajo del número\n");
				}else{ 
					if(aleatorio<num){
						System.out.println("Estás por arriba del número\n");
					}else{
						System.out.println("Enhorabuena! Acertaste el número!\n");
						break;
					}
				}
			}
			if(aleatorio==num){
				System.out.println("Intentos realizos: "+intentos);
			}else{
				if(aleatorio!=num){
					System.out.println("Intentos realizados "+intentos+". Lo siento! Ese es el tope!");
				}
			}
			System.out.println("¿Quiere volver a jugar? Pulse (1) para continuar, pulse (2) para salir");
			opcion=Teclado.readInteger();
		}
		while(opcion!=2);

		// Fin modificacion
	}
}
