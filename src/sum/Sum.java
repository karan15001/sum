/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

/**
 *
 * @author karan
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
     int numberOfRows;
    int columns;
    void addNC(){
        numberOfRows=10;
        columns=20;
        System.out.println("output is: "+(numberOfRows+columns));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Sum obj=new Sum();
        obj.addNC();
    }
    }
    
