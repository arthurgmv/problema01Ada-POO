import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] funcionario = new String[3];


        while (true){
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar Funcionário");
            System.out.println("3 - Calcular Salário Total");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Nome: ");
                    funcionario[0] = scanner.next();
                    System.out.println("Cargo: ");
                    funcionario[1] = scanner.next();
                    System.out.println("Salário: ");
                    funcionario[2] = String.valueOf(scanner.nextDouble());
                    System.out.println("Funcionário adicionado com sucesso!");
                    break;

                case 2:
                    if(funcionario[0] == null){
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        System.out.println("Nome: " + funcionario[0] + ", Cargo: " + funcionario[1] + ", Salário: R$ " + funcionario[2]);
                    }
                    break;
                    case 3:
                        if(funcionario[0] == null){
                            System.out.println("Nenhum funcionáiro cadastrado.");
                        } else {
                            double salarioTotal = Double.parseDouble(funcionario[2]);
                            System.out.println("Salário Total: R$ " + salarioTotal);
                        }
                        break;
                        case 4:
                            System.out.println("Sair");
                            scanner.close();
                            return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

    }
}