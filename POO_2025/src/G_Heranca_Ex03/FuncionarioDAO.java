/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Heranca_Ex03;

/**
 *
 * @author gordoni
 */
public class FuncionarioDAO extends PessoaDAO {

    public String mostrarDadosFuncionario(FuncionarioDTO funcionarioDTO) {
        return mostrarDados(funcionarioDTO)
                + "\nFunção: " + funcionarioDTO.getFuncao()
                + "\nSiape: " + funcionarioDTO.getSiape()
                + calcularAposentadoria(funcionarioDTO);
    }

    private String calcularAposentadoria(FuncionarioDTO funcionarioDTO) {
        if (funcionarioDTO.getIdade() < 60) {
            return "\nResta " + (60 - funcionarioDTO.getIdade()) + "ano(s) para aposentar." ;
        } else {
            return "\nVocê já possui idade para se aposentar.";
        }
    }
}
