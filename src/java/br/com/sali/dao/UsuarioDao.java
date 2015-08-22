package br.com.sali.dao;

import br.com.sali.entidade.Usuario;
import org.hibernate.criterion.Restrictions;

/**
 * Classe que possui operações relacionadas com banco de dados que sejam
 * genericas as suas as classes que são subclasse da classe "Usuario".
 *
 *
 * @author SALI
 */
public class UsuarioDao extends BancoDeDados {

    // EM ELABORAÇÃO
    
    
    /**
     * Este método retorna um único usuário (Instituição) do banco de dados,
     * pesquisando pelo seu email.
     *
     * @param email
     * @return
     */
    public Usuario buscaInstituicaoEmail(String email) {
        try {
            return (Usuario) super.getSessao().createCriteria(Usuario.class).add(Restrictions.ilike("email", email));

            /*
             aqui usamos o método add() para adicionar
             um critério de busca. Usamos como critério
             um objeto do tipo Restrictions e ele nos
             formece inumeros outros métodos.
             Como a consulta é por id, vamos usar o idEq(),
             seria um idEquals. Como vamos retornar apenas um
             resultado, devemos indicar com o método uniqueResult().
             */
        } finally {
            //Fechamos a sessão
            // minhaSessao.close();
        }
    }
    
        /**
         * Este método verifica no banco de dados do sistema se o usuário
         * informado possui cadastro no mesmo. Se possuir e sua senha estiver
         * correta é retornado o valor "TRUE", senão é retornado o valor
         * "FALSE".
         *
         * @return
         */
    public boolean isUsuario(Object object) {
        return true;

    }
}

