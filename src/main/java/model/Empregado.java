package model;

public class Empregado extends Pessoa{

    public Empregado(String nome, String cpf, int idade, double salario) {
        super(nome, cpf, idade, salario);
}
    //super serve para construir objetos com dados inicializados
public Empregado(double salario){
        super(salario);
}

    @Override
    public void calcularSalario(double valor) {

    }

    public Empregado(){
        super();
}

//@Override
}
