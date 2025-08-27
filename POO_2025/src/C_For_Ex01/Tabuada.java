/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_For_Ex01;

/**
 *
 * @author gustavo
 */
public class Tabuada {

    private int numero;
    private String imprimir = "";

    public String calcularTabuada(int numero) {
        this.numero = numero;

        for (int cont = 1; cont <= 10; cont++) {
            this.imprimir = this.imprimir + "\n"
            + cont + " X "
            + this.numero + " = " + cont * this.numero;
        }
        
        return this.imprimir;
    }
}
