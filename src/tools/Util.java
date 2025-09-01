/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JComponent;
import javax.swing.JTextField;


/**
 *
 * @author u07855463160
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ...componentes){
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
            
        }
    }
    
    public static void limpar(JTextField ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
             componentes[i].setText("");
            
        }
    }
    
    
}
