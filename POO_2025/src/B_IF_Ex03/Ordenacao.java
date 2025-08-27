/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_IF_Ex03;

/**
 *
 * @author gustavo
 */
public class Ordenacao {

    private int n1, n2, n3, n4;
    private String order;

    public String ordenarDecrescente(int n1, int n2, int n3, int n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;

        if (this.n1 > this.n4) {
            this.order = this.n3 + " - " + this.n2 + " - " + this.n1 + " - " + this.n4;
        } else if ((this.n4 > this.n1) && (this.n4 < this.n2)) {
            this.order = this.n3 + " - " + this.n2 + " - " + this.n4 + " - " + this.n1;
        } else if ((this.n4 > this.n2) && (this.n4 < this.n3)) {
            this.order = this.n3 + " - " + this.n4 + " - " + this.n2 + " - " + this.n1;
        } else {
            this.order = this.n4 + " - " + this.n3 + " - " + this.n2 + " - " + this.n1;
        }

        return this.order;
    }
}
