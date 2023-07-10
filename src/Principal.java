import com.parking.sistema.Carro;
import com.parking.sistema.Estacionamento;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento(5);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Estacionar carro");
            System.out.println("2. Remover carro");
            System.out.println("3. Exibir carros estacionados");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a placa do carro:");
                    String placa = scanner.next();
                    System.out.println("Digite o modelo do carro:");
                    String modelo = scanner.next();
                    Carro carro = new Carro(placa, modelo);
                    boolean estacionado = estacionamento.estacionarCarro(carro);
                    if (estacionado) {
                        System.out.println("Carro estacionado com sucesso.");
                    } else {
                        System.out.println("Estacionamento lotado. Não foi possível estacionar o carro.");
                    }
                    break;
                case 2:
                    System.out.println("Digite a placa do carro a ser removido:");
                    String placaRemover = scanner.next();
                    boolean removido = estacionamento.removerCarro(placaRemover);
                    if (removido) {
                        System.out.println("Carro removido com sucesso.");
                    } else {
                        System.out.println("Carro não encontrado no estacionamento.");
                    }
                    break;
                case 3:
                    estacionamento.exibirCarrosEstacionados();
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}

