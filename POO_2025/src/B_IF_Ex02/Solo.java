/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_IF_Ex02;

/**
 *
 * @author gustavo
 */
public class Solo {
  
    private double amostra;
    
    public String classificarSolo(double amostra){
        this.amostra = amostra;
        
        if(this.amostra <= 10){
            return "Rochosa";
        }else if(this.amostra > 10 && this.amostra <=40){
            return "Firme";
        }else if(this.amostra > 40 && this.amostra <=80){
            return "Pantanosa";
        }else{
            return "Quantidade de água inválida";
        }        
    }
}
