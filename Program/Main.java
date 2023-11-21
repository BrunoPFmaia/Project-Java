package Program;

import Entities.LegalPerson;
import Entities.Person;
import Entities.PhysicalPerson;
import com.sun.management.UnixOperatingSystemMXBean;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Person p = new Person();
        LegalPerson l = new LegalPerson();
        PhysicalPerson i = new PhysicalPerson();

        boolean isMenuActive = true;


        System.out.println("-------------------------------------------------");
        System.out.println("             Bem vindo ao Banco Azul             ");
        System.out.println("-------------------------------------------------");
        System.out.println("Para ter acesso aos serviços, cadastre sua conta!");
        System.out.println("-------------------------------------------------");
        System.out.println("Voce é: \n" +
                "Pessoa Física → Digite 1\n" +
                "Pessoa Jurídica → Digite 2"
        );

        int personOfType = sc.nextInt();


        switch (personOfType) {
            case 1:
                System.out.println("Digite seu CPF (apenas números):");
                long cpf = sc.nextLong();

                System.out.println("Qual seu nome? ");
                String name = sc2.nextLine();

                System.out.println("Qual sua idade?");
                int age = sc.nextInt();

                if (age < 18){
                    System.out.println("Idade não permitida");
                    break;
                }
                // validar maioridade - Nayara

                System.out.print("Saldo inicial: ");
                double balance = sc.nextDouble();
                p.setBalance(balance);

                System.out.print("Limite de saque: ");
                double withdrawLimit = sc.nextDouble();
                System.out.println("-------------------------------------------------");

                System.out.println("O que você deseja fazer?");

                while (isMenuActive) {
                    System.out.println("[1] Depositar\n" +
                            "[2] Sacar\n" +
                            "[3] Consultar saldo\n" +
                            "[4] Consultar dados de usuário\n" +
                            "[0] Encerrar");
                    System.out.println("--------------------------------------");

                    int choice = sc.nextInt();
                    System.out.println("--------------------------------------");

                    switch (choice) {
                        case 0:
                            isMenuActive = false;
                            break;
                        case 1:
                            System.out.print("Informe o valor que deseja depositar: ");
                            double deposito = sc.nextDouble();
                            p.setDeposito(deposito);
                            p.depositar();
                            break;
                        case 2:
                            // Lógica para sacar -
                            break;
                        case 3:
                            System.out.printf(" O atual saldo da conta é: %.2f %n", p.getBalance());
                            // Lógica para consultar saldo - Nayara
                            break;
                        case 4:
                            System.out.println("Nome:" + p.getName());
                            System.out.println("CPF:" + i.getCpf());
                            System.out.println("Idade:" + i.getIdade());
                            // Lógica para consultar dados de usuário - Junior
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            System.out.println("--------------------------------------");
                            break;
                    }
                }
                break;

            case 2:
                System.out.println("Digite seu CNPJ (apenas números):");
                long cnpj = sc.nextLong();

                System.out.println("Qual a razão social da empresa? ");
                String corporateReason = sc2.nextLine();

                System.out.println("Qual nome do responsável pela conta da empresa?");
                name = sc2.nextLine();

                System.out.print("Saldo inicial que você deseja inserir: ");
                double balance2 = sc.nextDouble();
                p.setBalance(balance2);

                System.out.print("Limite de saque: ");
                double withdrawLimit2 = sc.nextDouble();

                while (isMenuActive) {
                    System.out.println("[1] Depositar\n" +
                            "[2] Sacar\n" +
                            "[3] Consultar saldo\n" +
                            "[4] Consultar dados de usuário\n" +
                            "[0] Encerrar");
                    System.out.println("--------------------------------------");

                    int choice = sc.nextInt();
                    System.out.println("--------------------------------------");

                    switch (choice) {
                        case 0:
                            isMenuActive = false;
                            break;
                        case 1:
                            System.out.print("Informe o valor que deseja depositar: ");
                            double deposito = sc.nextDouble();
                            p.setDeposito(deposito);
                            p.depositar();
                            break;
                        case 2:
                            // Lógica para sacar
                            break;
                        case 3:
                            System.out.printf(" O atual saldo da conta é: %.2f %n", p.getBalance());
                            // Lógica para consultar saldo - Nayara
                            break;
                        case 4:
                            System.out.println("CNPJ:" + l.getCnpj());
                            System.out.println("Razão Social:" + l.getCorporateReason());
                            System.out.println("Nome do responsável legal:" + p.getName());
                            // Lógica para consultar dados de usuário - Junior
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            System.out.println("--------------------------------------");
                            break;
                    }
                }
                break;
        }

        sc.close();
        sc2.close();
    }
}
