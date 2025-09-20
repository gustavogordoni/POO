/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class MotoristaVIEW {

  public static void main(String[] args) {
    MotoristaDTO motoristaDTO = new MotoristaDTO();
    MotoristaCTR motoristaCTR = new MotoristaCTR();

    try {
      motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do motorista: ")));
      JOptionPane.showMessageDialog(null, motoristaCTR.verificarIdade(motoristaDTO));
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Informe um valor de idade válido!");
    }
  }
}
