package br.com.sali.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Esta classe representa um endereço.
 * 
 * @author SALI
 */
@Entity
@Table(name = "enderecos")
public class Endereco implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "rua")
    private String rua;
    @Column(name = "numero")
    private int numero;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;
    
    //--------------------------------------------------------------------------
    
    public Endereco(){}
    
    //--------------------------------------------------------------------------
    
    public long getId(){
        return this.id;
    }
    
    public String getRua(){
        return this.rua;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    //--------------------------------------------------------------------------
    
    public void setId(long novoId){
        this.id = novoId;
    }
    
    public void setRua(String novaRua){
        this.rua = novaRua;
    }
    
    public void setNumero(int novoNumero){
        this.numero = novoNumero;
    }
    
    public void setBairro(String novoBairro){
        this.bairro = novoBairro;
    }
    
    public void setCidade(String novaCidade){
        this.cidade = novaCidade;
    }
    
    public void setEstado(String novoEstado){
        this.estado = novoEstado;
    }
}
