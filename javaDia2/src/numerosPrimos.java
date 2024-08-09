import java.util.Scanner;

public class numerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero maior que 1: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("Numero invalido, digite um numero inteiro e positivo maior que 1");
        } else {
            boolean primo = true;

            for(int i = 2; i < numero; i++) {
                if(numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if(primo) {
                System.out.println("O número " + numero + " é um número primo!" );
            } else {
                System.out.println("O número " + numero + " não é um número primo");
            }
        }
        sc.close();
    }
}
