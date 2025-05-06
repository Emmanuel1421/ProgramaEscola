package interfaces;

import model.Pessoa;

public interface RepositorioPessoas {//CRUD
    void criar(Pessoa pessoa);
    Pessoa procurar(String cpf);
    Pessoa atualizar(String cpf);
    void remover(String cpf);
}
