/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_For_Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class PrincipalSomaInteiros {

    public static void main(String[] args) {
        SomaInteiros somaInteiros = new SomaInteiros();
        int LIMIT = 10;

        for (int i = 0; i < LIMIT; i++) {
            somaInteiros.calcularSoma(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o " + (i+1) + "° número inteiro: ")));
        }

        JOptionPane.showMessageDialog(null, "O resultado da soma dos números é: \n"
                + somaInteiros.retornarResultado());
    }

}
