/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_For_Ex05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class PrincipalSalario {

    public static void main(String[] args) {
        
        DecimalFormat decimalFormat = new DecimalFormat("##,###.00");
        Salario salario = new Salario();

        int ano;
        do {            
            ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
            if(ano < 2012) JOptionPane.showMessageDialog(null, "Informe um ano superior a 2011!");
        } while (ano < 2012);

        JOptionPane.showMessageDialog(null, "Salário final é de: R$ "+ decimalFormat.format(salario.calcular(ano)));
    }

}
