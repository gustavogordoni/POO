/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex04;

/**
 *
 * @author gustavo
 */
public class MediaCTR {
    
    MediaDAO mediaDAO = new MediaDAO();
    
    public double calcularMedia(MediaDTO mediaDTO) {        
        return mediaDAO.calcularMedia(mediaDTO);
    }    
    
    public String determinarAprovacao(MediaDTO mediaDTO) {        
        return mediaDAO.determinarAprovacao(mediaDTO);
    }    
}
