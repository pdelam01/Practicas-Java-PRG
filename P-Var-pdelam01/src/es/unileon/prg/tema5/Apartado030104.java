package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a conversiones de tipo.
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030104 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Conversiones de tipo";
      }
   
   /**
    * Conversiones de tipo - Ejercicio1.
    *
    * </br>
    *
    * Comprobar cuales de las conversiones implicitas realizadas son correctas y comentar las incorrectas.
    */
       public void ejercicio01() {
         cabecera("01","");
      
         byte varByte = 6;
         short varShort = 6;
         int varInt = 666;
         long varLong = 666L;
         float varFloat = 6.75f;
         double varDouble = 6.75d;
         char varChar = 'a';
         boolean varBoolean = true;
          
         byte vaarByte = 50;
         short vaarShort = 1500 ;
         int vaarInt = 150000 ;
         long vaarLong = 65000000L ;
         float vaarFloat = 20.0E4f ;
         double vaarDouble = 0.123456789e9 ;
         char vaarChar = 'H' ;
         boolean vaarBoolean = true ;
      
         varInt    = varShort;
         varDouble = varFloat;  
         varFloat  = varLong;
         varLong   = varInt;
         varLong   = 9223372036854775807L;
         varFloat  = varLong;
         //No se pueden hacer la conversion byte-short (short es mayor que byte)
         varShort  = varByte;
         //No se puede hacer la conversion short-int (int es mayor que short)
         varInt  = varShort;
      
      }
   
   /**
    * Conversiones de tipo - Ejercicio2.
    *
    * </br>
    *
    * Asignar varLong al resto de variables realizando las conversiones explicitas necesarias
    * Imprime por pantalla el resultado de dichas conversiones
    */
       public void ejercicio02() {
         cabecera("02", "");
      
      // Inicio modificacion
         byte varByte;
         short varShort;
         int varInt;
         long varLong;
         varLong=35000L;

         System.out.println("Long to Byte: "+(byte)varLong);
         System.out.println("Long to Short: "+(short)varLong);
         System.out.println("Long to Int: "+(int)varLong);
         System.out.println("Long to Long: "+(long)varLong);

         
         
      // Fin modificacion
      }
   
   /**
    * Conversiones de tipo - Ejercicio3.
    *
    * </br>
    *
    * Asignar varFloat al resto de variables realizando las conversiones necesarias.
    * Imprime por pantalla el resultado de dichas conversiones
    */
       public void ejercicio03() {
         cabecera("03", "");
      
      // Inicio modificacion
         byte varByte;
         short varShort;
         int varInt;
         long varLong;
         float varFloat;
         double varDouble;
         varFloat= 123.1f;

         System.out.println("Float to Byte: "+(byte)varFloat);
         System.out.println("Float to Short: "+(short)varFloat);
         System.out.println("Float to Int: "+(int)varFloat);
         System.out.println("Float to Long: "+(long)varFloat);
         System.out.println("Float to Float: "+(float)varFloat);
         System.out.println("Float to Double: "+(double)varFloat); 
        // Fin modificacion
      }
   
   /**
    * Conversiones de tipo - Ejercicio4.
    *
    * </br>
    *
    * Arreglar los posibles errores de compilacion y explicar en el fichero LEEME.TXT los resultados    */
       public void ejercicio04() {
         cabecera("04", "");
      
         double dGigante, dNormal, dMinimo;
         float  fGigante, fNormal, fMinimo;
      
         dGigante = 1.766e289;
         dNormal  = 35.987654321;
         dMinimo  = 0.2E-256;
      
         fGigante = (float)dGigante;
         fNormal  = (float)dNormal;
         fMinimo  = (float)dMinimo;
      
         System.out.println("Gigante: " + fGigante);    
         System.out.println("Normal : " + fNormal);    
         System.out.println("Minimo : " + fMinimo);
      
         byte b = (byte)130;
         short s = (short)32770;
         int i = (int)2147483650l; 
      
         System.out.println("Byte  : " + b);    
         System.out.println("Short : " + s);    
         System.out.println("Int   : " + i);
      
         float f = 1.3e22f;   
         System.out.println("f: " + f);    
      }
   }
