/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Heranca_Ex02;

/**
 *
 * @author gordoni
 */
public class JuridicoDAO extends ClienteDAO{
    private String dados;

    public String mostrarDadosJuri(JuridicoDTO juridicoDTO) {

        this.dados = "\nCNPJ: " + juridicoDTO.getCnpj();
        this.dados += "\nIE: " + juridicoDTO.getIe();

        return mostrarDadosCli(juridicoDTO) + this.dados;
    }
}
    