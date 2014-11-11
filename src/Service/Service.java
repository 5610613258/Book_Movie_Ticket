/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Service {

    public static void main(String[] args) throws IOException {
        ArrayList<Movie> movie = new ArrayList<Movie>();
        ArrayList<Theatre> theatre = new ArrayList<Theatre>();
        Scanner scan = new Scanner(System.in);
        FileReader reader = new FileReader("test.txt");
        BufferedReader in = new BufferedReader(reader);
        String inputLine;
        // input movie
        while (true) {
            inputLine = in.readLine();
            if (inputLine == null) {
                break;
            }
            String[] data = inputLine.split(":");
            movie.add(new Movie(data[0],Integer.parseInt(data[1]),data[2]));
            System.out.print("Continue yes or no ? : ");
            String check = scan.next();
            if ("no".equals(check) || "No".equals(check)) {
                break;
            }
        }

        // input theatre
        while (true) {
            System.out.print("Enter theatre name : ");
            String name = scan.next();
            System.out.print("Enter column : ");
            int column = scan.nextInt();
            System.out.print("Enter row : ");
            int row = scan.nextInt();
            theatre.add(new Theatre(name, column, row));
            System.out.print("Continue yes or no ? : ");
            String check = scan.next();
            if ("no".equals(check) || "No".equals(check)) {
                break;
            }
        }

    }
}
