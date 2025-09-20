/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SabadoLetivo;

/**
 *
 * @author gustavo
 */
public class AudienciaCTR {
    
    AudienciaDAO audienciaDAO = new AudienciaDAO();
    
    public void computarAudiencia(AudienciaDTO audienciaDTO) {
         audienciaDAO.computarAudiencia(audienciaDTO);
    }
    
    public String exibirInformacoes(AudienciaDTO audienciaDTO) {
        return audienciaDAO.exibirInformacoes(audienciaDTO);
    }    
}
