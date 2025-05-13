package view;

import java.util.Scanner;

public class MenuPrincipalFicr {

        Scanner input = new Scanner(System.in);
        int op;
    public int menuGeral() {
        System.out.println("Menu de Opções FICR");
        System.out.println("1. Cadastrar Pessoa");
        System.out.println("2. Listar Pessoas");
        System.out.println("3. Atualizar Pessoa");
        System.out.println("4. Deletar Pessoa");
        System.out.println("5. Calcular Salário");
        System.out.println("6. Sair");
        System.out.println("Digite uma opção: ");
        op = input.nextInt();


        return 0;
    }

}
