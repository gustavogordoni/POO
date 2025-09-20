/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex08;

/**
 *
 * @author gustavo
 */
public class CrescenteDAO {

    public String mostrarResposta(CrescenteDTO crescenteDTO) {

        if ((crescenteDTO.getN1() < crescenteDTO.getN2()) && (crescenteDTO.getN2() < crescenteDTO.getN3())) {
            return crescenteDTO.getN1() + " — " + crescenteDTO.getN2() + " — " + crescenteDTO.getN3();

        } else if ((crescenteDTO.getN1() < crescenteDTO.getN3()) && (crescenteDTO.getN3() < crescenteDTO.getN2())) {
            return crescenteDTO.getN1() + " — " + crescenteDTO.getN3() + " — " + crescenteDTO.getN2();

        } else if ((crescenteDTO.getN2() < crescenteDTO.getN1()) && (crescenteDTO.getN1() < crescenteDTO.getN3())) {
            return crescenteDTO.getN2() + " — " + crescenteDTO.getN1() + " — " + crescenteDTO.getN3();

        } else if ((crescenteDTO.getN2() < crescenteDTO.getN3()) && (crescenteDTO.getN3() < crescenteDTO.getN1())) {
            return crescenteDTO.getN2() + " — " + crescenteDTO.getN3() + " — " + crescenteDTO.getN1();

        } else if ((crescenteDTO.getN3() < crescenteDTO.getN1()) && (crescenteDTO.getN1() < crescenteDTO.getN2())) {
            return crescenteDTO.getN3() + " — " + crescenteDTO.getN1() + " — " + crescenteDTO.getN2();

        } else if ((crescenteDTO.getN3() < crescenteDTO.getN2()) && (crescenteDTO.getN2() < crescenteDTO.getN1())) {
            return crescenteDTO.getN3() + " — " + crescenteDTO.getN2() + " — " + crescenteDTO.getN1();

        } else if ((crescenteDTO.getN1() == crescenteDTO.getN2()) && (crescenteDTO.getN1() < crescenteDTO.getN3())) {
            return crescenteDTO.getN1() + " — " + crescenteDTO.getN2() + " — " + crescenteDTO.getN3();

        } else if ((crescenteDTO.getN1() == crescenteDTO.getN2()) && (crescenteDTO.getN1() > crescenteDTO.getN3())) {
            return crescenteDTO.getN3() + " — " + crescenteDTO.getN1() + " — " + crescenteDTO.getN2();

        } else if ((crescenteDTO.getN2() == crescenteDTO.getN3()) && (crescenteDTO.getN2() < crescenteDTO.getN1())) {
            return crescenteDTO.getN2() + " — " + crescenteDTO.getN3() + " — " + crescenteDTO.getN1();

        } else if ((crescenteDTO.getN2() == crescenteDTO.getN3()) && (crescenteDTO.getN2() > crescenteDTO.getN1())) {
            return crescenteDTO.getN1() + " — " + crescenteDTO.getN3() + " — " + crescenteDTO.getN2();

        } else if ((crescenteDTO.getN1() == crescenteDTO.getN3()) && (crescenteDTO.getN1() < crescenteDTO.getN2())) {
            return crescenteDTO.getN1() + " — " + crescenteDTO.getN3() + " — " + crescenteDTO.getN2();

        } else if ((crescenteDTO.getN1() == crescenteDTO.getN3()) && (crescenteDTO.getN1() > crescenteDTO.getN2())) {
            return crescenteDTO.getN2() + " — " + crescenteDTO.getN3() + " — " + crescenteDTO.getN1();

        } else {
            return crescenteDTO.getN1() + " — " + crescenteDTO.getN2() + " — " + crescenteDTO.getN3();
        }
    }
}
