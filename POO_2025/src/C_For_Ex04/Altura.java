/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_For_Ex04;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class Altura {

    private double altura = 0, media = 0, soma = 0;
    private int qnt, maisDoisMetros;

    public void somarAlturas(double altura, int qnt) {
        this.altura = altura;
        this.qnt = qnt;
        
        this.soma += this.altura;
        
        if(this.altura > 2.0)
            this.maisDoisMetros++;
    }

    private double calcularMedia() {
        this.media = this.soma / this.qnt;
        return this.media;
    }

    public String exibirInfo() {        
        return "A média das alturas é de: \n" + calcularMedia()
        + "\n\nA quantidade de pessoas com mais de 2 metros é: \n" + this.maisDoisMetros;
    }

}
