package br.com.sali.entidade;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Esta classe representa Um professor no sistema.
 * 
 * @author SALI
 */
@Table(name = "professores")
public class Professor extends Usuario{
    
    @Column(name = "matricula_escolar")
    private int matriculaEscolar;   
    
    //--------------------------------------------------------------------------
    
    public Professor(){}
    
    //--------------------------------------------------------------------------
    
    public int getMatriculaEscolar(){
        return this.matriculaEscolar;
    }
    
    //--------------------------------------------------------------------------
    
    public void setMatriculaEscolar(int novaMatricula){
        this.matriculaEscolar = novaMatricula;
    }
    
}
