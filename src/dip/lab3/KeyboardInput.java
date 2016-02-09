/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import java.util.Scanner;
/**
 *
 * @author Yasir
 */
public class KeyboardInput implements Input {
    private int result;
    

    Scanner scanner = new Scanner(System.in);

    @Override
    public int inputnumber(int number1, int number2) {
        System.out.println("Here is the number you enter,");
        System.out.println(number1 + number2);
        return result;
        
        
    }
   
    
}
