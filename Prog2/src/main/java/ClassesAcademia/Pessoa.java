/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAcademia;

/**
 *
 * @author João
 */
public abstract class Pessoa {
    
    protected String CPF;
    protected String nome;
    protected String sexo;
    protected String telefone;

    public Pessoa(String CPF, String nome, String sexo, String telefone) {
        this.CPF = CPF;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
    }
    
    
}
