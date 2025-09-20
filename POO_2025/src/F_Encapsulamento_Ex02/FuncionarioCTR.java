/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex02;

/**
 *
 * @author gustavo
 */
public class FuncionarioCTR {
    
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String mostrarCodigoFuncionario(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.mostrarCodigoTelefone(funcionarioDTO);
    }
}
