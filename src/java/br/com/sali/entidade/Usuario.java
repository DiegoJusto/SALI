package br.com.sali.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa um usuário do sistema. Porém, é uma classe abstrata,
 * pois os usuários serão Instituição, Alunos ou Professores.
 *
 * @author SALI
 */
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    protected long id;
    @Column(name = "nome_completo")
    protected String nomeCompleto;
    @Column(name = "email")
    protected String email;
    @Column(name = "senha")
    protected String senha;

    //--------------------------------------------------------------------------
    public Usuario() {
    }

    //--------------------------------------------------------------------------
    public long getId() {
        return this.id;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    //--------------------------------------------------------------------------
    public void setId(long novoId) {
        this.id = novoId;
    }

    public void setNomeCompleto(String novoNomeCompleto) {
        this.nomeCompleto = novoNomeCompleto;
    }

    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }
}
