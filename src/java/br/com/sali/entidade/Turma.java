package br.com.sali.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe que representa uma turma no sistema.
 *
 * @author SALI
 */
@Entity
@Table(name = "turmas")
public class Turma implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "nome")
    private String nome;
    
    //--------------------------------------------------------------------------
    
    public Turma(){}
    
    //--------------------------------------------------------------------------
    
    public String getNome(){
        return  this.nome;
    }
    
    //--------------------------------------------------------------------------
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

}
