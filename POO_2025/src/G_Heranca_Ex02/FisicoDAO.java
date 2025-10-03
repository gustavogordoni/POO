/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Heranca_Ex02;

/**
 *
 * @author gordoni
 */
public class FisicoDAO extends ClienteDAO {

    private String dados = "";

    public String mostrarDadosFisi(FisicoDTO fisicoDTO) {

        this.dados = "\nCPF: " + fisicoDTO.getCpf();
        this.dados += "\nRG: " + fisicoDTO.getRg();

        return mostrarDadosCli(fisicoDTO) + this.dados;
    }
}
