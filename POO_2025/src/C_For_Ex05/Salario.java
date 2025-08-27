/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_For_Ex05;

/**
 *
 * @author gustavo
 */
public class Salario {

    private int anoAtual = 0;
    private final int anoInicial = 2012;
    private double percentual = 0.015, salarioFinal = 1.015;

    public double calcular(int ano) {
        this.anoAtual = ano;

        for (int i = anoInicial; i <= anoAtual; i++) {
            this.percentual *= 2;
            this.salarioFinal += (this.salarioFinal * this.percentual);            
        }       
        
        return this.salarioFinal * 1000;
    }
}
