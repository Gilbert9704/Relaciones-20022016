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
public class Rental {
    
    private int daysRented;
    private Movie movie;
    
    public Rental(int daysRented, Movie movie){
        this.daysRented = daysRented;
        this.movie = movie;
    }
         
    
    public Movie getMovie(){
        return this.movie;
    }
    
    public double charge(){
        return this.daysRented*100;
    }
}
