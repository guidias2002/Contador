import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int paramUm = scan.nextInt();

        System.out.println("Digite outro número inteiro:");
        int paramDois = scan.nextInt();

        try {
            interandoNumero(paramUm, paramDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void interandoNumero(int paramUm, int paramDois) throws ParametrosInvalidosException{
        if (paramUm > paramDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int subtracao = paramDois - paramUm;

        for (int contador = 1; contador <= subtracao; contador++) {
            System.out.println("Imprindo o número " + contador);
        }
    }
}
