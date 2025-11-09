package br.ifsp.egsw;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginService auth = new LoginService();

        System.out.println("=== Demo GCS - IFSP ===");
        System.out.print("Usuário: ");
        String user = sc.nextLine();
        System.out.print("Senha (min 6): ");
        String pass = sc.nextLine();

        if (auth.login(user, pass)) {
            System.out.println("Login OK! Bem-vindo, " + user + ".");
            System.out.println("Menu:");
            System.out.println("1) Ver perfil");
            System.out.println("2) Sair");
            System.out.print("Escolha: ");
            String op = sc.nextLine();
            if ("1".equals(op)) {
                System.out.println("Perfil de " + user + ": conta demo.");
            } else {
                System.out.println("Encerrando...");
            }
        } else {
            System.out.println("Falha de autenticação. Tente novamente.");
        }

        sc.close();
    }
}
