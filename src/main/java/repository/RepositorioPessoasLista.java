package repository;

import interfaces.RepositorioPessoas;
import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoasLista implements RepositorioPessoas {
private List<Pessoa> pessoasList;

public RepositorioPessoasLista(){
    pessoasList = new ArrayList<Pessoa>();
}
    @Override
    public void criar(Pessoa pessoa) {
        pessoasList.add(pessoa);
    }

    @Override
    public Pessoa procurar(String cpf) {
        Pessoa pessoaProcurada = null;
        for (Pessoa p: pessoasList){
            if (p.getCpf().equals(cpf)){
                pessoaProcurada = p;
                break;
            }
        }
           return pessoaProcurada;
    }

    @Override
    public Pessoa atualizar(String cpf) {
        return null;
    }

    @Override
    public void remover(String cpf) {
        int posicao = -1;

        for (Pessoa p : pessoasList){
            if (p.getCpf().equals(cpf)){
                posicao = pessoasList.indexOf(p);
                break;

            }
        }
        if (posicao != -1)//se fosse pelo menos 0 teria elemento
            //é -1 pq indica que o indice nao tem objeto
            pessoasList.remove(posicao);

    }

    public List<Pessoa> listarPessoas(){
        return this.pessoasList;//mostra todos da lista
    }
}
