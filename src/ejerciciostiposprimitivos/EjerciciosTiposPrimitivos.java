/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostiposprimitivos;

/**
 *
 * @author JESUS
 */
public class EjerciciosTiposPrimitivos {
    
    /**
     * Ejercicio de Tipos Primitivos
     */
        
    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables o constante y Entrada de datos
        //----------------------------------------------      
                
        //VARIABLE: La edad de un niño es 12.        
        //Variable tipo int declarada e inicializada en el mismo sitio.
        int edadNiño = 12;
         //----------------------------------------------
        //                 Procesamiento y Salida de Resultados
        //----------------------------------------------
        System.out.println("La edad del niño es: " + edadNiño + " años");
        

        //CONSTANTE: La velocidad de la luz es de 300000 (trescientos mil) kilómetros por segundo.
        //Constante tipo double inicializada en la misma línea.
        // El literal de entero (300000) promociona a double automáticamente.
        final double VELOCIDAD_LUZ = 300000;
        System.out.println("La velocidad de la luz es: " + VELOCIDAD_LUZ + " Km/s");

        //CONSTANTE: La edad mínima para apuntarse a actividades de tiro con arco es de 10 años.
        //Constante tipo int declarada e inicializada en distintas líneas.
        final int EDAD_MINIMA_TIRO_ARCO;
        EDAD_MINIMA_TIRO_ARCO = 10;
        System.out.println("La edad minima en tiro con arco es: " + EDAD_MINIMA_TIRO_ARCO + " años");
        
        //VARIABLE: el correo electrónico de una persona es vaya@mail.com
        //Variable tipo String declarada e inicializada en la misma línea.
        String mail="vaya@mail.com";        
        System.out.println("El mail es: " + mail);
               
        //VARIABLE: el peso de un atleta es de 40,44 kilogramos.        
        //Variable tipo double declada e inicializada en líneas diferentes.
        double pesoAtleta;
        pesoAtleta=40.44d; //d indica literal de double
        System.out.println("El peso del atleta es: " + pesoAtleta + " kg");
        
        //CONSTANTE: el número de meses del año es 12
        //Constante entera declarada e inicializadas en líneas diferentes.
        final int MESES_AÑO;
        MESES_AÑO=12;
        System.out.println("El año tiene: " + MESES_AÑO + " meses");
        
        //VARIABLE: la letra del dni de una persona es C
        //Variable tipo char declarada e inicializada en la misma línea.
        char letraDNI='C';
        System.out.println("La letra del DNI es: " + letraDNI);
        
        //VARIABLE: El número de teléfono es 887-44-42-12.
        //Variable tipo String declarada e inicializada en líneas diferentes.
        String telefono;
        telefono="887-44-42-12";
        System.out.println("El telefono es: " + telefono);
        
        //CONSTANTE: la distancia de la tierra al sol es de 147.100.000.000 metros 
        //Constante tipo long inicializada y declarada en la misma línea
        final long DISTANCIA_TIERRA_SOL=147_100_000_000L;
        System.out.println("La distancia de la Tierra al Sol es: " + DISTANCIA_TIERRA_SOL + " metros");
        
        //CONSTANTE: la distancia que recorre la luz en un año es de 9.460.740.478.580,8 kilómetros.
        //Constante tipo double inicializada y declarada en la misma línea.
        final double KM_RECORRIDOS_LUZ_AÑO=9_460_740_478_580.8d;
        System.out.println("Los kilometros recorridos en años luz son: " + KM_RECORRIDOS_LUZ_AÑO + " Km");
        
        //Decoración: interlineado simple, doble,marcos,síbolos decorativos, ... y Fin del Programa
        System.out.println ("XXXXXXXXXXXXXXXXX");
	System.out.println ("Fin del programa.");
    }
    
}
