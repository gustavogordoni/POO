/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Heranca_Ex03;

/**
 *
 * @author gordoni
 */
public class PessoaDAO {

    public String mostrarDados(PessoaDTO pessoaDTO) {
        return "Nome: " + pessoaDTO.getNome()
                + "\nIdade: " + pessoaDTO.getIdade()
                + "\nTelefone: " + pessoaDTO.getTelefone()
                + "\nEndereço: " + pessoaDTO.getEndereco();
    }
}
