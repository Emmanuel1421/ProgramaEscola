package controller;

import interfaces.RepositorioPessoas;
import model.Administrativo;
import model.Pessoa;
import repository.RepositorioPessoasLista;

import java.util.Scanner;

public class GestaoPessoas {
    Scanner input = new Scanner(System.in);
    String nome, cpf;
    int idade;
    double salario;
    Pessoa pessoa = new Administrativo();

    public void criarRegistro(RepositorioPessoas lista){
        pessoa = new Administrativo();
        System.out.println("Digite o seu CPF: ");
        cpf = input.next();
        pessoa.setCpf(cpf);
        input.nextLine();
        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        pessoa.setNome(nome);
        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();
        pessoa.setIdade(idade);
        pessoa.calcularSalario(1200.00);

        lista.criar(pessoa);

    }
    public void listarTodos(RepositorioPessoas lista){
        System.out.println("Lista de Pessoas: " + ((RepositorioPessoasLista)lista).listarPessoas());
    }
}
