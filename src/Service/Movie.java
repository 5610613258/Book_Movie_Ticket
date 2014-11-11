/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service;

/**
 *
 * @author Administrator
 */
public class Movie {
    // field
    protected String movie;
    protected Double time;
    protected String language;
    
    // constructor

    Movie(String movie, double time, String language) {
       this.movie = movie;
       this.time = time;
       this.language = language;
    }
    
}
