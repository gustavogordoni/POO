/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex05;

/**
 *
 * @author gustavo
 */
public class SoloDAO {

    public String classificarSolo(SoloDTO soloDTO) {
        if (soloDTO.getAmostra() <= 10) {
            return "Rochosa";
        } else if (soloDTO.getAmostra() > 10 && soloDTO.getAmostra() <= 40) {
            return "Firme";
        } else if (soloDTO.getAmostra() > 40 && soloDTO.getAmostra() <= 80) {
            return "Pantanosa";
        } else {
            return "Quantidade de água inválida";
        }
    }
}
