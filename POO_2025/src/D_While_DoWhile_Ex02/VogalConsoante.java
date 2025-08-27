/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_While_DoWhile_Ex02;

/**
 *
 * @author gustavo
 */
public class VogalConsoante {

    private int qntVogal = 0, qntConsoante = 0;
    private String letra = "";

    public void verificarCaractere(String letra) {
        this.letra = letra;

        if (this.letra.equalsIgnoreCase("a")
        || this.letra.equalsIgnoreCase("e")
        || this.letra.equalsIgnoreCase("i")
        || this.letra.equalsIgnoreCase("o")
        || this.letra.equalsIgnoreCase("u")) {
            this.qntVogal++;
        }else{
            this.qntConsoante++;
        }
    }

    public int getQntVogal() {
        return qntVogal;
    }

    public int getQntConsoante() {
        return qntConsoante;
    }    
}
