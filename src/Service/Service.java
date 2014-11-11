/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Service {
    public static void main(String[] args){
        ArrayList<Movie> movie = new ArrayList<Movie>();
        Scanner scan = new Scanner(System.in);
        // input movie
        while(true){
            System.out.print("Enter movie name : ");
            String name = scan.next();
            System.out.print("Enter length : ");
            double time = scan.nextDouble();
            System.out.print("Enter language : ");
            String language = scan.next();
            movie.add(new Movie(name, time, language));
            System.out.print("Continue yes or no ? : ");
            String check = scan.next();
            if("no".equals(check) || "No".equals(check)){
                break;
            }
        }
        
        // input theatre
        System.out.print("Enter column : ");
        int column = scan.nextInt();
        System.out.print("Enter row : ");
        int row = scan.nextInt();
        Theatre theatre = new Theatre(column,row);
    }
}
