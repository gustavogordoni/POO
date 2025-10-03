/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Heranca_Ex02;

/**
 *
 * @author gordoni
 */
public class ClienteDAO {
    
    private String dados  = "";
    
    public String mostrarDadosCli(ClienteDTO clienteDTO){
        this.dados += "Nome: " + clienteDTO.getNome();
        this.dados += "\nCidade: " + clienteDTO.getCidade();
        this.dados += "\nEstado: " + clienteDTO.getEstado();
        this.dados += "\nEndereço: " + clienteDTO.getEndereco();        
        return this.dados;
    }    
}
