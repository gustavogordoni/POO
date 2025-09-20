/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex07;

/**
 *
 * @author gustavo
 */
public class OrdenacaoDAO {

    public String ordenarDecrescente(OrdenacaoDTO ordenacaoDTO) {

        if (ordenacaoDTO.getN1() > ordenacaoDTO.getN4()) {
            return ordenacaoDTO.getN3() + " - " + ordenacaoDTO.getN2() + " - " + ordenacaoDTO.getN1() + " - " + ordenacaoDTO.getN4();
        } else if ((ordenacaoDTO.getN4() > ordenacaoDTO.getN1()) && (ordenacaoDTO.getN4() < ordenacaoDTO.getN2())) {
            return ordenacaoDTO.getN3() + " - " + ordenacaoDTO.getN2() + " - " + ordenacaoDTO.getN4() + " - " + ordenacaoDTO.getN1();
        } else if ((ordenacaoDTO.getN4() > ordenacaoDTO.getN2()) && (ordenacaoDTO.getN4() < ordenacaoDTO.getN3())) {
            return ordenacaoDTO.getN3() + " - " + ordenacaoDTO.getN4() + " - " + ordenacaoDTO.getN2() + " - " + ordenacaoDTO.getN1();
        } else {
            return ordenacaoDTO.getN4() + " - " + ordenacaoDTO.getN3() + " - " + ordenacaoDTO.getN2() + " - " + ordenacaoDTO.getN1();
        }
    }

}
