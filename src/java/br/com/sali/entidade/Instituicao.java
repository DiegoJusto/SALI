package br.com.sali.entidade;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Esta classe representa a Instituição onde o software está instalado.
 * A mesma é quem administra o sistema.
 * 
 * @author SALI
 */
@Table(name = "instituicao")
public class Instituicao extends Usuario{
    
    @Column(name = "telefone")
    private int telefone;
    
    //--------------------------------------------------------------------------
    
    public Instituicao(){}
    
    //--------------------------------------------------------------------------
    
    public int getTelefone(){
        return this.telefone;
    }
    
    //--------------------------------------------------------------------------
    
    public void setTelefone(int novoTelefone){
        this.telefone = novoTelefone;
    }
}
