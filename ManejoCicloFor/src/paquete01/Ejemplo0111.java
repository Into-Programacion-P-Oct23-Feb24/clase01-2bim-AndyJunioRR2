/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo0111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        En este caso usamos acumuladores para poder guardas los valores de los 
        ciclos repetitivos y condicionales en donde se preseten los valores 
        finales
        */
        int acumulador= 0;
        for (int i = 1; i <= 10; i++) {
            
            acumulador = acumulador + i;
        }
        
        for (int i = 1; i < 11; i++) {
            
           acumulador = acumulador + i; 
        }
        System.out.printf("%s\n",acumulador);
    }

}
