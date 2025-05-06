package view;

import model.Administrativo;
import model.Empregado;
import model.Pessoa;
import model.Professor;

import java.util.Scanner;

import static java.lang.System.exit;

public class PrincipalFicr {
    public static void main(String[] args) {
       MenuPrincipalFicr menu = new MenuPrincipalFicr();
       Pessoa pessoaAdmin = new Administrativo();
       Pessoa pessoaProf = new Professor(30.00);
       Pessoa seguranca = new Empregado(null,null,0,1200.00);
       Scanner scn = new Scanner(System.in);
       String continuar;
       int op;

       pessoaProf.setNome("Lenin Abadié");
       pessoaProf.setCpf("123.123.123-45");
       pessoaProf.setIdade(23);
       ((Professor)pessoaProf).setHorasTrabalhadas(30);
       pessoaProf.calcularSalario(30.00);

        System.out.println("Professor: "+ pessoaProf.toString());

        pessoaAdmin.setNome("Pelé Abadié");
        ((Administrativo)pessoaAdmin).baterPonto("10:50","15:30","Cheguei Cedo");

        pessoaAdmin.calcularSalario(1200.00);
        System.out.println("Salario do Adm: "+ pessoaAdmin.getSalario());

        ((Professor)pessoaProf).setHorasTrabalhadas(30);
//  o construct com super(salario) me permite tirar      pessoaProf.calcularSalario(30.00);
        System.out.println("Salário do prof: "+pessoaProf.getSalario());

       do{
           op = menu.menuGeral();

           switch (op){

               case 1:
                   System.out.println("Cadastro de Pessoa (Professor, Adm ou Funcionario)");
                   System.out.println("Digite as informações do professor: ");
                   String nome = scn.nextLine();
                   pessoaProf.setNome(nome);
                   int idade = scn.nextInt();
                   pessoaProf.setIdade(idade);
                   String cpf = scn.next();
                   pessoaProf.setCpf(cpf);
                   int horasTrabalhadas = scn.nextInt();
                   ((Professor)pessoaProf).setHorasTrabalhadas(horasTrabalhadas);
                   pessoaProf.calcularSalario(30.00);
                   System.out.println("Informações cadastradas com sucesso!");
                break;
               case 2:
                   System.out.println("Informações do Professor");
                   System.out.println(pessoaProf.toString());
                   break;

               case 3:
                   break;

               case 4:
                   break;

               case 5:
                   break;

               case 6:
                   System.exit(0);
                   break;

           }

           System.out.println("Deseja continuar: ");
           continuar = scn.next();
       }while (continuar.equalsIgnoreCase("Sim"));

    }

}
