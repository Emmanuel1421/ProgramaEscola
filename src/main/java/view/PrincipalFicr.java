package view;

import controller.GestaoPessoas;
import interfaces.RepositorioPessoas;
import repository.RepositorioPessoasLista;
import java.util.Scanner;

public class PrincipalFicr {
    public static void main(String[] args) {
       MenuPrincipalFicr menu = new MenuPrincipalFicr();
       RepositorioPessoas pessoas = new RepositorioPessoasLista();
       GestaoPessoas gestaoPessoas = new GestaoPessoas();
       Scanner input = new Scanner(System.in);
       String continuar;
        int op;
//
//       pessoaProf.setNome("Lenin Abadié");
//       pessoaProf.setCpf("123.123.123-45");
//       pessoaProf.setIdade(23);
//       ((Professor)pessoaProf).setHorasTrabalhadas(30);
//       pessoaProf.calcularSalario(30.00);
//
//        System.out.println("Professor: "+ pessoaProf.toString());
//
//        pessoaAdmin.setNome("Pelé Abadié");
//        ((Administrativo)pessoaAdmin).baterPonto("10:50","15:30","Cheguei Cedo");
//
//   cuDLeo     pessoaAdmin.calcularSalario(1200.00);
//        System.out.println("Salario do Adm: "+ pessoaAdmin.getSalario());
//
//        ((Professor)pessoaProf).setHorasTrabalhadas(30);
//// o construct com super(salario) me permite tirar      pessoaProf.calcularSalario(30.00);
//        System.out.println("Salário do prof: "+pessoaProf.getSalario());

       do{
            op = menu.menuGeral();
           switch (op){

               case 1:
                   gestaoPessoas.criarRegistro(pessoas);
                   System.out.println("Informações cadastradas com sucesso!");
                break;
               case 2:
                   System.out.println("Informações do Registros");
                   gestaoPessoas.listarTodos(pessoas);
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
           continuar = input.next();
       }while (continuar.equalsIgnoreCase("Sim"));

    }

}
