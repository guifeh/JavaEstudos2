import java.util.Scanner;

public class sorveteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha o tipo do sorvete: ");
            System.out.println("1 - 1 bola casquinha: R$6,00");
            System.out.println("2 - 2 bolas casquinha: R$9,00");
            System.out.println("3 - 2 bolas cascão: R$12,00");

            int escolha = sc.nextInt();
            double precoSorvete =0;

            switch (escolha) {
                case 1:
                    precoSorvete += 6.00;
                    break;
                    case 2:
                        precoSorvete += 9.00;
                        break;
                        case 3:
                            precoSorvete += 12.00;
                            break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            System.out.println("Quantos sorvetes desse tipo você deseja: ");
            int quantidade = sc.nextInt();

            for (int i = 0; i < quantidade; i++) {
                System.out.println("Deseja adicionar cobertura? (1 - sim / 2 - não)");
                int adicionarCobertura = sc.nextInt();

                if (adicionarCobertura == 1) {
                    System.out.println("Escolha a cobertura: ");
                    System.out.println("1 - Chocolate - R$2,00");
                    System.out.println("2 - Morango - R$2,00");
                    System.out.println("3 - Avelã - R$3,00");

                    int escolhaCobertura = sc.nextInt();
                    double precoCobertura = 0;

                    switch (escolhaCobertura) {
                        case 1:
                            precoCobertura += 2.00;
                            break;
                            case 2:
                                precoCobertura += 2.00;
                                break;
                                case 3:
                                    precoCobertura += 3.00;
                                    break;
                        default:
                            System.out.println("Opção de cobertura inválida!");
                            continue;
                    }

                    precoSorvete += precoCobertura;
                }
            }

            total += precoSorvete * quantidade;

            System.out.println("Deseja pedir mais sorvete? (1 - sim/ 2 - não)");
            int maisSorvetes = sc.nextInt();
            if (maisSorvetes != 1) {
                continuar = false;
            }
        }
        System.out.println("Resumo do pedido: ");
        System.out.println("Valor total: " + total);

        sc.close();
    }
}
