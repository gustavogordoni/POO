/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Introducao_Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class PrincipalSalario {

    public static void main(String[] args) {
        Salario salario = new Salario();

        JOptionPane.showMessageDialog(null, "O valor do salário final é de: R$" + 
            salario.calcSalario(
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do salário: ")),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a porcentagem de aumento: "))
            )
        );

    }
}
