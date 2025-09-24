/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex11;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class HabitantesVIEW {

    public static void main(String[] args) {

        HabitantesCTR habitantesCTR = new HabitantesCTR();
        HabitantesDTO habitantesDTO = new HabitantesDTO();

        do {
            do {
                habitantesDTO.setSexo(JOptionPane.showInputDialog("Digite o sexo do habitante: (Masculino / Feminino)"));
                if (!habitantesCTR.computarDados(habitantesDTO)) {
                    JOptionPane.showMessageDialog(null, "Sexo informado está inválido para o sistema.");
                }
            } while (!habitantesCTR.computarDados(habitantesDTO));

            do {
                if (habitantesDTO.getSalario() < 0) {
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                }
                habitantesDTO.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do habitante: ")));
            } while (habitantesDTO.getSalario() < 0);

            do {
                habitantesDTO.setEntradaDados(Integer.parseInt(
                        JOptionPane.showInputDialog("Entra com os dados de outro habitante? \n 1-Sim | 0-Não")));
                if (habitantesDTO.getEntradaDados() != 1 && habitantesDTO.getEntradaDados() != 0) {
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            } while (habitantesDTO.getEntradaDados() != 1 && habitantesDTO.getEntradaDados() != 0);

        } while (habitantesDTO.getEntradaDados() != 0);

        JOptionPane.showMessageDialog(null, habitantesCTR.imprimirDados(habitantesDTO));
    }
}
