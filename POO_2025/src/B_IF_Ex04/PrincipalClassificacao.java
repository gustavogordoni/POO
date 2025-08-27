/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_IF_Ex04;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class PrincipalClassificacao {

    public static void main(String[] args) {        
        Classificacao classificacao = new Classificacao();

        JOptionPane.showMessageDialog(null,
            classificacao.calcular(
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura da pessoa: ")),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso da pessoa: "))
            )
        );
    }
}
    