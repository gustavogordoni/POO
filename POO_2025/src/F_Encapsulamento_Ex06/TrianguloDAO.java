/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex06;

/**
 *
 * @author gustavo
 */
public class TrianguloDAO {

    public String verificarTriangulo(TrianguloDTO trianguloDTO) {
        if ((trianguloDTO.getLado01() + trianguloDTO.getLado02() > trianguloDTO.getLado03())
                && (trianguloDTO.getLado02() + trianguloDTO.getLado03() > trianguloDTO.getLado01())
                && (trianguloDTO.getLado01() + trianguloDTO.getLado03() > trianguloDTO.getLado02())) {

            return "Triângulo válido!\n" + classificarTriangulo(trianguloDTO);
        } else {
            return "Isso não é um triângulo";
        }
    }

    private String classificarTriangulo(TrianguloDTO trianguloDTO) {

        if ((trianguloDTO.getLado01() == trianguloDTO.getLado02())
                && (trianguloDTO.getLado02() == trianguloDTO.getLado03())) {
            return "O triângulo é equilátero";

        } else {
            if ((trianguloDTO.getLado01() == trianguloDTO.getLado02())
                    || (trianguloDTO.getLado02() == trianguloDTO.getLado03())
                    || (trianguloDTO.getLado01() == trianguloDTO.getLado03())) {

                return "O triângulo é isósceles";

            } else {
                return "O triângulo é escaleno";
            }
        }
    }
}
