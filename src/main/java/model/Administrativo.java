package model;

public class Administrativo extends Pessoa{
    private double horasTrabalhadas;
    private int qtdalunosMatriculados;
    public final double BONUS = 200.00;

   public Administrativo(String nome, String cpf, int idade, double salario) {
       super(nome, cpf, idade, salario);
   }

//   public Administrativo(double salario) {
//      super(salario);
//   }

   public Administrativo (){
       super();
   }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getQtdalunosMatriculados() {
        return qtdalunosMatriculados;
    }

    public void setQtdalunosMatriculados(int qtdalunosMatriculados) {
        this.qtdalunosMatriculados = qtdalunosMatriculados;
    }

    public void baterPonto(String horaEntrada, String horaSaida, String justificativa){

    }

    @Override
    public void calcularSalario(double valor){

       if (getQtdalunosMatriculados() >= 200){
           setSalario(valor + BONUS);
       }
       else {
           setSalario(valor);
       }

    }

}
