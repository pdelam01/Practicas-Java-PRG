package es.unileon.prg.tema6;

/**
 * 
 * 
 * Definicion de la clase Partido
 *   
 * @author PRG
 * @version (1.0)
 *
 */

public class Partido
{
    
	/**
	 * Jugador 1 del partido
	 * 
	 */
    private Jugador _jugador1;
    /**
	 * Jugador 2 del partido
	 * 
	 */
    private Jugador _jugador2;
    /**
	 * Ganador del partido. Si su su valor es null todavia no se ha jugado el partido
	 * 
	 */
    private Jugador _ganador;
    
    
    
    /**
	 * Constructor de la clase. Crea un partido con los jugadores introducidos
	 * 
	 * @param jugador1
	 * @param jugador2
	 *           
	 */
    public Partido(Jugador jugador1, Jugador jugador2)
    {
    	_jugador1 = jugador1;
    	_jugador2 = jugador2;
        _ganador=null;
    }
    
    /**
	 * Retorna el jugador 1 
	 * 
	 * @return Retorna el jugador 1 
	 */    
    public Jugador getJugador1()
    {
        return _jugador1;
    }
    
    /**
	 * Retorna el jugador 2
	 * 
	 * @return Retorna el jugador 2
	 */
    public Jugador getJugador2()
    {
        return _jugador2;
    }
    
    /**
	 * Juega el partido y genera el ganador
	 * 
	 */
    public void jugar() 
    {
        //Inicio modificacion - ejercicio06() de la clase Apartado030202 -
        double player1 = _jugador1.getPuntosATP();
        double player2 = _jugador2.getPuntosATP();

        double resultado1=Math.random()*player1;
        double resultado2=Math.random()*player2;

        boolean ganadores = false;

        while (ganadores==false){
            
            if(resultado1>resultado2){
                _ganador=_jugador1;
                _jugador1.setPuntosATP(player1+1);
                ganadores=true;
            }else{
                if(resultado1<resultado2){
                    _ganador=_jugador2;
                    _jugador2.setPuntosATP(player2+1);
                    ganadores=true;

                }else{
                    resultado1=Math.random()*player1;
                    resultado2=Math.random()*player2;
                }
            }
        }

    	
    	//Fin modificacion - ejercicio06() de la clase Apartado030202 -
        
            
    }
    
    /**
	 * Retorna el ganador. Si retorna null el partido todavia no se ha jugado
	 * 
	 * @return Retorna el ganador del partido
	 */  
    public Jugador ganador()
    {
       
        return _ganador;
    }
    
  
    
}