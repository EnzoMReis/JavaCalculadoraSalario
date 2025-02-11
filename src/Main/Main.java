package Main;

import Entity.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "", telefone = "";
        double salarioBruto = 0.0, valeAlimentacao = 0.0, valeTransporte = 0.0;
        int option = 0;

        do {
            System.out.println();
            System.out.println("=====================================================");
            System.out.println("             Calculadora de Salário");
            System.out.println("=====================================================");
            System.out.println("   1 - Calcular 1/12 do Salário");
            System.out.println("   2 - Calcular FGTS");
            System.out.println("   3 - Calcular 1/3 do Salário de Férias");
            System.out.println("   4 - Calcular Vale Alimentação");
            System.out.println("   5 - Calcular Vale Transporte");
            System.out.println("   ...");
            System.out.println("   9 - Relatório");
            System.out.println("   0 - Sair");
            System.out.println("=====================================================");
            System.out.print("Digite uma Opção: ");
            option = scanner.nextInt();
            System.out.println();
            System.out.println("Digite as informações Abaixo");

            System.out.print("Nome do funcionário: ");
            nome = scanner.nextLine();
            nome = scanner.nextLine();

            System.out.print("Telefone do funcionário: ");
            telefone = scanner.nextLine();

            System.out.print("Salário Bruto do funcionário: ");
            salarioBruto = scanner.nextDouble();

            System.out.print("Vale Alimentação por dia do funcionário: ");
            valeAlimentacao = scanner.nextDouble();

            System.out.print("Vale Transporte por dia do funcionário: ");
            valeTransporte = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(nome, telefone, salarioBruto, valeAlimentacao, valeTransporte);

            System.out.println();

            switch (option) {
                case 1:
                    double umSobreDoze = funcionario.calcularUmSobreDoze();
                    System.out.printf(" O valor de 1/12 do Salário Bruto é: %.2f \n", umSobreDoze);
                    break;
                case 2:
                    double fgts = funcionario.calcularFGTS();
                    System.out.printf(" O valor do FGTS é: %.2f \n", fgts);
                    break;
                case 3:
                    double umTercoFerias = funcionario.calcularUmTercoFerias();
                    System.out.printf(" O valor de 1/3 do Salário de Férias é: %.2f \n", umTercoFerias);
                    break;
                case 4:
                    valeAlimentacao = funcionario.calcularValeAlimentacao();
                    System.out.printf(" O valor do Vale Alimentação é: %.2f \n", valeAlimentacao);
                    break;
                case 5:
                    valeTransporte = funcionario.calcularValeTransporte();
                    System.out.printf(" O valor do Vale Transporte é: %.2f \n", valeTransporte);
                    break;
                case 9:
                    String relatorio = funcionario.toString();
                    System.out.println(relatorio);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (option != 0);

        scanner.close();
    }
}
