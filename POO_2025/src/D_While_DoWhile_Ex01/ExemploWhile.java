/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_While_DoWhile_Ex01;

/**
 *
 * @author gustavo
 */
public class ExemploWhile {

    private String letra;
    private int qtd;

    public void verificar(String letra) {
        this.letra = letra;
        if (this.letra.equalsIgnoreCase("x")) {
            this.qtd++;
        }
    }

    public int mostra() {
        return this.qtd;
    }
}
