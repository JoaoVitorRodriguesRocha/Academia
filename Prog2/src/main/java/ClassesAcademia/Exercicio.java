/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAcademia;

/**
 *
 * @author João
 */
public class Exercicio {
    
    private int repeticao;
    private String exercicio;
    private String descricao;
    private int serie;
    
    public Exercicio(String exercicio,int repeticao, int serie,String descricao){
        this.repeticao = repeticao;
        this.exercicio = exercicio;
        this.descricao = descricao;
        this.serie = serie;
    }
    
    public int getRepeticao(){
        return this.repeticao;
    }
    
    public String getExercicio(){
        return this.exercicio;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public String toString(){
        return this.exercicio+" "+this.repeticao+"\n"+this.descricao;
    }
    
}
