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

    private int vogalA, vogalE, vogalI, vogalO, vogalU, qntConsoante = 0;
    private String letra = "";

    public void verificarCaractere(String letra) {
        this.letra = letra;

        if (this.letra.equalsIgnoreCase("a")){
					this.vogalA++;
				}else if(this.letra.equalsIgnoreCase("e")){
					this.vogalE++;
				}
				else if(this.letra.equalsIgnoreCase("i")){
					this.vogalI++;
				}
				else if(this.letra.equalsIgnoreCase("o")){
					this.vogalO++;
				}else if(this.letra.equalsIgnoreCase("u")){
					this.vogalU++;				
				}else if(!letra.equals("0")){
            this.qntConsoante++;
        }
    }

		public String exibirInfo(){
            return "Vogais A: " + this.vogalA +
            "\nVogal E: " + this.vogalE +
            "\nVogal I: " + this.vogalI +
            "\nVogal O: " + this.vogalO +
            "\nVogal U: " + this.vogalU +
            "\nConsoantes: " + this.qntConsoante;
		}
}
