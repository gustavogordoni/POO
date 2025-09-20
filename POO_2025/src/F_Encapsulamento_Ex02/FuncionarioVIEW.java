/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class FuncionarioVIEW {

    public static void main(String[] args) {
        FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();

        try {
            funcionarioDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do usuário: ")));
            funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Informe o telefone do usuário: "));
            JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarCodigoFuncionario(funcionarioDTO));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Informe um código (número inteiro) e telefone válidos!");
        }        
    }
}
