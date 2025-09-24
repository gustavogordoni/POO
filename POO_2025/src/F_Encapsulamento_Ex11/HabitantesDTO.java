/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex11;

/**
 *
 * @author gustavo
 */
public class HabitantesDTO {

    private String sexo;
    private int contador, numMulheres, numMulheresSal, numHomens, entradaDados;
    private float salario, somaSalario, mediaSalario;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getNumMulheres() {
        return numMulheres;
    }

    public void setNumMulheres(int numMulheres) {
        this.numMulheres = numMulheres;
    }

    public int getNumMulheresSal() {
        return numMulheresSal;
    }

    public void setNumMulheresSal(int numMulheresSal) {
        this.numMulheresSal = numMulheresSal;
    }

    public int getNumHomens() {
        return numHomens;
    }

    public void setNumHomens(int numHomens) {
        this.numHomens = numHomens;
    }

    public int getEntradaDados() {
        return entradaDados;
    }

    public void setEntradaDados(int entradaDados) {
        this.entradaDados = entradaDados;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSomaSalario() {
        return somaSalario;
    }

    public void setSomaSalario(float somaSalario) {
        this.somaSalario = somaSalario;
    }

    public float getMediaSalario() {
        return mediaSalario;
    }

    public void setMediaSalario(float mediaSalario) {
        this.mediaSalario = mediaSalario;
    }
}
