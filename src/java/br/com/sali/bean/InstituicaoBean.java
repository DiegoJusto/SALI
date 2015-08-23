package br.com.sali.bean;

import br.com.sali.entidade.Endereco;
import br.com.sali.entidade.Instituicao;
import javax.faces.bean.ManagedBean;

/**
 * Responsável por Ligar A Visão ao Modelo.
 *
 * @author SALI
 */
@ManagedBean(name = "beanInstituicao")
public class InstituicaoBean {
    
    private Instituicao instituicao;
    private Endereco endereco;
    private String novaSenha;
    private String senhaAtual;
    private String confirmacaoSenhaAtual;
    
    
    //--------------------------------------------------------------------------
    
    public InstituicaoBean(){
        endereco = new Endereco();
        endereco.setRua("Rua do Cruzeirinho");
        endereco.setNumero(763);
        endereco.setBairro("Alto Manoel Mariano");
        endereco.setCidade("Icó");
        endereco.setEstado("CE");
        
        instituicao = new Instituicao();
        
        instituicao.setNomeCompleto("Faculdade Vale do Salgado");
        instituicao.setEmail("fvs@edu.com.br");
        instituicao.setTelefone(35612760);
    
    }
    
    //--------------------------------------------------------------------------

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getSenhaAtual() {
        return senhaAtual;
    }

    public String getConfirmacaoSenhaAtual() {
        return confirmacaoSenhaAtual;
    }

    public String getNovaSenha() {
        return novaSenha;
    }
    
    
    //--------------------------------------------------------------------------

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setSenhaAtual(String senhaAtual) {
        this.senhaAtual = senhaAtual;
    }

    public void setConfirmacaoSenhaAtual(String confirmacaoSenhaAtual) {
        this.confirmacaoSenhaAtual = confirmacaoSenhaAtual;
    }

    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }
    
        
    //--------------------------------------------------------------------------
    
    public void salvarDados(){
        
    }
}
