/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex04;

/**
 *
 * @author gustavo
 */
public class MediaDAO {

    public double calcularMedia(MediaDTO mediaDTO) {
        mediaDTO.setMedia((mediaDTO.getNota01() + mediaDTO.getNota02()) / 2);
        return mediaDTO.getMedia();
    }

    public String determinarAprovacao(MediaDTO mediaDTO) {
        if (mediaDTO.getMedia() >= 7.0) {
            return "APROVADO!";
        } else if (mediaDTO.getMedia() >= 4.0) {
            return "RECUPERAÇÃO!";
        } else {
            return "REPROVADO!";
        }
    }
}
