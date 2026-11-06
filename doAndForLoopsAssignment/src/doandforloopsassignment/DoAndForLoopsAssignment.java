/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doandforloopsassignment;

/**
 *
 * @author acena2028
 */
public class DoAndForLoopsAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // create max rows constant
        final int MAX_ROWS = 10;
        
        // PART A
        System.out.println("a.");
        // for each row
        for (int row = 1; row <= MAX_ROWS; row++) {
            // print out correct number of stars
            for (int star = MAX_ROWS; star >= row; star--) {
                System.out.print("*");
            }
            // after each row, add a new line
            System.out.println();
        }
        
        // PART B
        System.out.println("b.");
        // for each row
        for (int row = 1; row <= MAX_ROWS; row++) {
            // print out correct number of spaces
            for (int space = (MAX_ROWS - row); space > 0; space--) {
                System.out.print(" ");
            }
            // print out correct number of stars on the same line
            for (int star = row; star > 0; star--) {
                System.out.print("*");
            }
            // seperate each line
            System.out.println();
        }
        
        // PART C
        System.out.println("c.");
        // for each row
        for (int row = 1; row <= MAX_ROWS; row++) {
            // print out the correct number of spaces
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            // print out correct number of stars on the same line
            for (int star = MAX_ROWS; star >= row; star--) {
                System.out.print("*");
            }
            // seperate each line
            System.out.println();
        }
        
        // PART D
        System.out.println("d");
        // for each row
        for (int row = 1; row <= MAX_ROWS; row++) {
            // print out the correct number of spaces
            for (int space = 0; space <= ((MAX_ROWS / 2) - row); space++) {
                System.out.print(" ");
            }
            // print out the correct number of stars on the same line
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
