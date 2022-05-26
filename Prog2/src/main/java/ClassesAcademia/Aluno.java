/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAcademia;

import Interface.HorarioDAO;
import java.util.ArrayList;

/**
 *
 * @author João
 */
//public class Aluno extends Pessoa{
//    
//    private ArrayList<Treino> treino;
//    private String objetivo;
//    
//}
public class Aluno extends Pessoa implements HorarioDAO{
    
    private double peso;
    private double altura;
    private String objetivo;
    private Treino treino;
    
    public Aluno(String CPF, String Nome, double peso, double altura, String objetivo, String Sexo, String Telefone, Treino treino) {
        super(CPF, Nome, Sexo, Telefone);
        this.peso = peso;
        this.altura = altura;
        this.objetivo = objetivo;
        this.treino = treino;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
       
    public String getObjetivo(){
        return this.objetivo;
    }
            
    public void horarioFrequentado(){
        
    }
    
    public String toString(){
        return this.nome+": ";
    }
            
    
}
