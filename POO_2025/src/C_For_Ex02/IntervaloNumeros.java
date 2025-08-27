/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_For_Ex02;

/**
 *
 * @author gustavo
 */
public class IntervaloNumeros {

    private int n1, n2;
    private String response="";

    public String definirIntervalo(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;        

        if(this.n1 <= this.n2) {
            for (int i = this.n1; i <= this.n2; i++) {
                this.response += i + " \t ";
            }
        } else {
            for (int i = this.n2; i <= this.n1; i++) {
                this.response += i + " \t ";                
            }
        }
        
        return this.response;       
    }
}
