/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_For_Ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class PrincipalTabuada {

    public static void main(String[] args) {

        Tabuada tabuada = new Tabuada();

        JOptionPane.showMessageDialog(null,
                tabuada.calcularTabuada(
                        Integer.parseInt(JOptionPane.showInputDialog("Informe o número para calcular a tabuada: "))
                )
        );
    }
}
