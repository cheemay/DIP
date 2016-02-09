/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class GuiInput implements Input{
    private int result;

    @Override
    public int inputnumber(int number1, int number2) {
        JOptionPane.showMessageDialog(null,result);
        return result;
    }
}    