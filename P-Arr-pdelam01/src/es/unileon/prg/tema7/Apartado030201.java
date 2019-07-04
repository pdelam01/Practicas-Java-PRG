package es.unileon.prg.tema7;
/**
 * Clase con los ejercicios correspondientes a arrays: arrays de tipos no
 * basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030201 extends Apartado {

	@Override
	protected String obtenerPractica(){
		return "P-ARR";
	}

	@Override
	protected String obtenerBloque() {
		return "Arrays de tipos no basicos";
	}

    private static int NUM_PERSONAS = 10;
    private Persona[] personas;

	/**
	 * Arrays de tipos no basicos - Ejercicio1.
	 *
	 * Tomando como referencia la clase Persona, incluida en el directorio /src,
	 * se pide programar el codigo que permite disponer un vector de 10 posiciones
	 * con  el siguiente contenido:
	 *
     *    Posicion 0 = [Pedro, 913779900]
     *    Posicion 1 = null
     *    Posicion 2 = null
     *    Posicion 3 = null
     *    Posicion 4 = [Juan, 915453322]
     *    Posicion 5 = null
     *    Posicion 6 = null
     *    Posicion 7 = [Luis, 629674532]
     *    Posicion 8 = null
     *    Posicion 9 = [Pepe, 913778800]
	 */
	public void ejercicio01 () throws NullPointerException {
		
		cabecera("01","Crear vector de tipos no basicos");

		// Inicio modificacion
		personas = new Persona[NUM_PERSONAS];

		Persona personaPedro = new Persona ("Pedro","913779900");
		Persona personaJuan = new Persona ("Juan","915453322");
		Persona personaLuis = new Persona ("Luis","629674532");
		Persona personaPepe = new Persona ("Pepe","913778800");

		personas[0]=personaPedro;
		personas[4]=personaJuan;
		personas[7]=personaLuis;
		personas[9]=personaPepe;

        // Fin modificacion
	}

	/**
	 * Arrays de tipos no basicos - Ejercicio2.
	 *
	 * Se pide modificar el contenido de la clase Persona y del metodo ejercicio02()
	 * de la clase Apartado030201 a fin de mostrar por pantalla los NOMBRES contenidos
	 * en el vector creado en el ejercicio anterior. La informacion se mostrara utilizando
	 * una sentencia for
	 */
	public void ejercicio02() {
		cabecera("02", "Mostrar contenido de vector de tipos no basicos");

		ejercicio01();
		// Inicio modificacion

		//Lo realizamos con for, para evitar el sobreuso de "System.out.println();"
		for(int i=0;i<personas.length;i++){

			//validamos que el contenido no sea null
			if(personas[i]!=null)
				System.out.println("Posicion "+i+" = "+personas[i].obtenerNombre());
		}
		//Imprimimos los nombres unicamente

        // Fin modificacion
	}


	/**
	 * Arrays de tipos no basicos - Ejercicio3.
	 *
	 * Tomando como referencia la clase Persona, incluida en el directorio /src, se
	 * pide programar el codigo que permite disponer un matriz de 2X2 el siguiente
	 * contenido:
	 *
     *    Posicion 0,0 = [Luis, 629674532]
     *    Posicion 0,1 = null
     *    Posicion 1,0 = null
     *    Posicion 1,1 = [Pepe, 913778800]
	 *
	 * La matriz debera crearse usando inicializadores. Una vez creada, se mostraran
	 * por pantalla los NOMBRES contenido en el mismo.
	 */
	public void ejercicio03() {
		cabecera("03", "Crear y mostrar contenido de matriz de tipos no basicos");

		// Inicio modificacion
		ejercicio01();

		Persona [][] personaMatriz;
		personaMatriz = new Persona [2][2];
		personaMatriz[0][0]=personas[7];
		personaMatriz[1][1]=personas[9];

		System.out.println("Posicion 0,0 = "+personaMatriz[0][0].obtenerNombre());
        System.out.println("Posicion 0,1 = "+personaMatriz[0][1]);
        System.out.println("Posicion 1,0 = "+personaMatriz[1][0]);
        System.out.println("Posicion 1,1 = "+personaMatriz[1][1].obtenerNombre());
		// Fin modificacion
	}

}
