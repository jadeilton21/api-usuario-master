package api.usuario.segunda.repository;

import api.usuario.segunda.doMain.Pessoa;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PessoaRepository {

    public void save(Pessoa pessoa) {
        System.out.println("Salvo - Pessoa salva no Banco de Dados!");
        System.out.println(pessoa);
    }

    public void update(Pessoa pessoa) {
        System.out.println("Atualizado - Usúario é atualizado na camada de Repository(banco de dados)");
        System.out.println(pessoa);

    }

    public void remove(Integer id) {
        System.out.println(String.format("DELETAR/ID - Deletando o id: %d e excluido o usuario", id));
        System.out.println(id);

    }

    public List<Pessoa> listar() {
        System.out.println("LIST - Listando os usários do sistema");
        List<Pessoa> usuarios = new ArrayList<>();
        usuarios.add(new Pessoa("jadeilton","password"));
        usuarios.add(new Pessoa("jade","masterpass"));
        return usuarios;

    }
}
