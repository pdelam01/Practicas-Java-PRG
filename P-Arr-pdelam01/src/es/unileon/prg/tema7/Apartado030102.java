package es.unileon.prg.tema7;
/**
 * Clase con los ejercicios correspondientes a arrays de tipos basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	@Override
	protected String obtenerPractica(){
		return "P-ARR";
	}

	@Override
	protected String obtenerBloque() {
		return "Arrays de tipos basicos";
	}

	/**
	 * Arrays de tipos basicos - Ejercicio1.
	 *
	 * Completar el metodo para crear y rellenar un vector de cien posiciones
	 * que contenga los primeros cien numeros pares. Una vez creada, se debera
	 * mostrar el contenido del vector por pantalla.
	 */
	public void ejercicio01() {
		cabecera("01", "Generar vector con los 100 primeros numeros pares");

		// Inicio modificacion
		int [] numerosPares;
		int count=0;
		numerosPares=new int [200];

		for (int i=0; i<numerosPares.length; i++){
			if(i%2==0){
				count ++;
				numerosPares[i]=i;
				System.out.println("Numero pares: "+numerosPares[i]);
			}
		}

		System.out.println("Contador: "+count);





        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio2.
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Explicar en el fichero LEEME.TXT el porque de los resultados
	 * <li> Modificar el odigo a fin de evitar la excepcion producida
	 * </ul>
	 */
	public void ejercicio02() {
		cabecera("02","Mostrar vector por pantalla");

		// Inicio modificacion
		int[] arrayEnteros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(" { ");
		//Lo igualamos a 0 y quitamos el =
		for(int i=0 ; i < arrayEnteros.length ; i++) {
			System.out.print(" "+arrayEnteros[i]+",");
		}
		System.out.println(" } ");
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio3.
	 *
	 * Completar el metodo para crear una matriz que contenga la tabla de
	 * multiplicar del numero 8. Una vez creada, se debera mostrar el
	 * contenido del vector por pantalla.
	 */
	public void ejercicio03() {
		cabecera("03", "Tabla de multiplicar del ocho");

		// Inicio modificacion
		int[] multiplos8;
		multiplos8=new int [11];
		int result=0;

		for(int j=1; j<multiplos8.length; j++){
			multiplos8[j]=j;
			if(multiplos8[j]==10){
				System.out.print("["+multiplos8[j]+"]\t");
			}else{
				System.out.print("[ "+multiplos8[j]+"]\t");
			}
		}

		System.out.println();
		for(int j=1; j<multiplos8.length; j++){
			System.out.print("[ 8]\t");
		}

		System.out.println();
		for (int i=1; i<multiplos8.length; i++){
			result=8*i;
			if(result==8){
				System.out.print("[ "+result+"]\t");
			}else{
				System.out.print("["+result+"]\t");
			}
	
		}
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio4.
	 *
	 * Se pide completar el metodo para mostrar por pantalla el tablero
	 * indicado en el enunciado de la practica.
	 */
	public void ejercicio04() {
		cabecera("04", "BonoLotoADA");

		// Inicio modificacion
		System.out.println("Loterías y Apuestas de el Estado - Bonoloto");
		System.out.println();

		int[] apuestas;
		apuestas=new int [50];
		int count=1;

		do{
			System.out.println("Apuesta: "+count);
			for(int i=0; i<apuestas.length; i++){
				apuestas[i]=i;
				if(apuestas[i]==9 || apuestas[i]==19 || apuestas[i]==29 || apuestas[i]==39 || apuestas[i]==49){
					if(apuestas[i]<10){
						System.out.println("[ "+apuestas[i]+"]");
					}else{
						System.out.println("["+apuestas[i]+"]");
					}
				}else{
					if(apuestas[i]<10){
						System.out.print("[ "+apuestas[i]+"]");
					}else{
						System.out.print("["+apuestas[i]+"]");
					}
				}
			}
			System.out.println();
			count ++;
		}
		while(count<4);
		// Fin modificacion

	}
}
