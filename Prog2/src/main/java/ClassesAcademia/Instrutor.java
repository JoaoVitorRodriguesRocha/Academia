/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAcademia;

import Interface.HorarioDAO;

/**
 *
 * @author João
 */
public class Instrutor extends Pessoa implements HorarioDAO {
    
    private boolean estudo;

    public Instrutor(boolean estudo, String CPF, String Nome, String Sexo, String Telefone) {
        super(CPF, Nome, Sexo, Telefone);
        this.estudo = estudo;
    }

    public boolean getEstudo() {
        return this.estudo;
    }
    public void horarioFrequentado(){
        
    }
    


}
