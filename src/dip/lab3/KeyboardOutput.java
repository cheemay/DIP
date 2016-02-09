/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class KeyboardOutput implements Output{

    @Override
    public int outputNumber() {
        System.out.println();
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    
}
}
