/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String posicion;
        double estatura;
        int edad;
        int contador = 0;
        
        String cadena1 = "Listado de jugadores\n";
        
        
        System.out.println("Ingrese la cantidad de jugadores que va a ingresar: ");
        int limite = entrada.nextInt();
        entrada.nextLine();    
        for (int i = 0; i < limite; i++) {
            System.out.println("Ingrese el nombre de Jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo que ocupa: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            contador = contador + 1;
             cadena1 = String.format("%s%d. %s -%s-, edad %d, estatura "
                    + "%.2f\n",
                    cadena1,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            
        }
        System.out.printf(cadena1); 
    }
}
