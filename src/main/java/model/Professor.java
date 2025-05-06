package model;

public class Professor extends Pessoa{
    private double horasTrabalhadas;
    public Professor(String nome, String cpf, int idade, double salario) {
        super(nome, cpf, idade, salario);

    }
    public Professor(double salario){
        super(salario);
    }
//    public Professor(){
//        super();
//    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calcularSalario(double valor){
        double salarioFinal;

        salarioFinal = valor * getHorasTrabalhadas();
        setSalario(salarioFinal);
    }

}
