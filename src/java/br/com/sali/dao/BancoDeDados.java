package br.com.sali.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Esta classe foi desenvolvida exclusivamente para disponibilizar 'sessões' e
 * 'transações' com o banco de dados sempre que outras classes necessitem.
 *
 * @author SALI
 */
public class BancoDeDados {

    private final Session SESSAO = HibernateUtil.getSessionFactory().openSession();
    private final Transaction TRANSACAO = SESSAO.beginTransaction();

    //-----------------------------------------------------------------------------
    public BancoDeDados() {
    }

    //-----------------------------------------------------------------------------
    
    /**
     * Método que retorna a sessão. Do tipo Session
     *
     * @return
     */
    public Session getSessao() {
        return this.SESSAO;
    }

    /**
     * Método que retorna a transação. Do tipo Transaction
     *
     * @return
     */
    public Transaction getTransacao() {
        return this.TRANSACAO;
    }
}
