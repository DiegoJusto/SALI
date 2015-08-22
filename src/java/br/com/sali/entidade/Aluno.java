package br.com.sali.entidade;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Esta classe representa uma aluno no sistema.
 * 
 * @author José
 */
@Table(name = "alunos")
public class Aluno extends Usuario {
    
    @Column(name = "matricula_escolar")
    private int matriculaEscolar;
    
    //--------------------------------------------------------------------------
    
    public Aluno(){}
    
    //--------------------------------------------------------------------------
    
    public int getMatriculaEscolar(){
        return this.matriculaEscolar;
    }
    
    //--------------------------------------------------------------------------
    
    public void setMatriculaEscolar(int novaMatricula){
        this.matriculaEscolar = novaMatricula;
    }
}
