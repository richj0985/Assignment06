
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question5 {
    
    // create a method that will output a random number of symbols based on how many lines the user requests
    public static void chaotic(int lines) {
        // while the number of lines requested is greater than 0 then output the number lines of random symbols
        while(lines > 0){
            
            // create variable to randomize the number of symbols on a line
            int numAsterisksToOutput = (int)(Math.random() * (5 - 1 + 1)) + 1;
            
            // output as many asterisks to match the random number generated
            while (numAsterisksToOutput > 0) {
                System.out.print("*");
            
                numAsterisksToOutput = numAsterisksToOutput - 1;
            }
            System.out.println("");
            
            // subtract the number of lines by one each time
            lines = lines - 1;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will output a random set of symbols for the number of lines requested using a method
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user how many lines they want and store this number in a variable
        System.out.print("To output a random set of symbols, enter the number of lines of pattern: ");
        int lines = input.nextInt();
        
        // display the outcome of the method
        chaotic(lines);
        
        // close the scanner
        input.close();
    }

}
