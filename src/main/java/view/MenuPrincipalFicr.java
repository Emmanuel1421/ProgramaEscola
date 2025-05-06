package view;

import java.util.Scanner;

public class MenuPrincipalFicr {
    public int menuGeral() {
        Scanner scn = new Scanner(System.in);
        int op;

        System.out.println("Menu de Opções FICR");
        System.out.println("1. Cadastrar Pessoa");
        System.out.println("2. Listar Pessoa");
        System.out.println("3. Atualizar Pessoa");
        System.out.println("4. Deletar Pessoa");
        System.out.println("5. Calcular Salário");
        System.out.println("6. Sair");
        System.out.println("Digite uma opção: ");

        op = scn.nextInt();


        return 0;
    }

}
