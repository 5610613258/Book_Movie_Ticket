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
public class Theatre {

    //field
    protected String name;
    protected int column;
    protected int row;
    private String[][] seat;
    // constructor

    Theatre(String name, int column, int row) {
        this.name = name;
        this.column = column;
        this.row = row;
        this.seat = new String[row][column];
        this.setSeat();
    }

    //method
    // service use
    void setSeat() {
        char ch = 'A';
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                seat[i][j] = (char) (ch + i) + Integer.toString(j + 1);
            }
        }
    }

    // Customer use
    int getAmountSeat() {
        return column * row;
    }

    void showSeat() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(seat[i][j]);
                if(j < column - 1 ){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
