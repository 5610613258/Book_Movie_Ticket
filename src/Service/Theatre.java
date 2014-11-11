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
    protected int column;
    protected int row;
    private String[][] seat;
    // constructor

    Theatre(int column, int row) {
        this.column = column;
        this.row = row;
        this.seat= new String[row][column];
        this.setSeat();
    }
    
    //method
    void setSeat(){
        char ch = 'A';
        for(int i = 0 ;i < row;i++){
            for(int j = 0; j < column; j++){
                seat[i][j] = (char)(ch + i) + Integer.toString(j+1);
            }
        }
    }
    
    int getAmountSeat(){
        return column * row;
    }
    
}
