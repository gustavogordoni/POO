/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Introducao_Ex03;

/**
 *
 * @author gustavo
 */
public class Salario {
    
    private double salario, porcentagem, salFinal;
    
    public double calcSalario(double salario, double porcentagem){
        this.porcentagem = porcentagem;
        this.salario = salario;
        
        this.salFinal = this.salario + (this.salario * (this.porcentagem / 100));       
     
        return this.salFinal;
    }    
}

