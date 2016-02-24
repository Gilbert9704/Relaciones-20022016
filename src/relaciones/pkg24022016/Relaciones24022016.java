/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.pkg24022016;

/**
 *
 * @author Estudiante
 */
public class Relaciones24022016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Movie pelicula = new Movie("Guerra de las galaxias");
        Rental prestamo = new Rental(1,pelicula);
        
    }
    
}
