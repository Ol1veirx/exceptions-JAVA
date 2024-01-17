package application;

import model.Exception.DomainException;
import model.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Entre com os dados da conta: ");
            System.out.print("Numero da conta: ");
            int number = sc.nextInt();
            System.out.print("Titular: ");
            String holder = sc.next();
            System.out.print("Valor inicial: ");
            double balance = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double withdrawLimit = sc.nextDouble();
            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Entre com o valor do saque: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);

            System.out.print(account);
        }
        catch (DomainException e){
            System.out.print(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Erro inesperado!");
        }

    }
}
