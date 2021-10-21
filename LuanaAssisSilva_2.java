import java.util.Scanner;
public class LuanaAssisSilva_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acertos = 0;
        int numero[] = new int[15];
        int sorteado[] = new int[15];
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o " + (i + 1) + " número apostado ");
            int n = teclado.nextInt();
            boolean valido = true;
            for (int j = 0; j < 15; j++) {
                if (numero[i] == n) {
                    valido= false;
                }
            }
            while (n < 1 || n > 99 || !valido) {
                System.out.println("Digite o " + (i + 1) + " número apostado ");
                n = teclado.nextInt();
                for (int j = 0; j < 15; j++) {
                    if (numero[i] == n) {
                        valido= false;
                    }
                }
            }
            numero[i] = n;
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o " + (i + 1) + " número sorteado");
            int n = teclado.nextInt();
            boolean valido = true;
            for (int j = 0; j < 15; j++) {
                if (sorteado[i] == n) {
                    valido= false;
                }
            }
            while (n < 1 || n > 99 || !valido) {
                System.out.println("Digite o " + (i + 1) + " número sorteado");
                n = teclado.nextInt();
                for (int j = 0; j < 15; j++) {
                    if (sorteado[i] == n) {
                        valido= false;
                    }
                }
            }
            sorteado[i] = n;
        }
        for (int l = 0; l < 15; l++) {
            for (int k = 0; k < 15; k++) {
                if (numero[l] == sorteado[k]) {
                    acertos++;
                }
            }
        }
        if (acertos == 13) {
            System.out.println(" azarento ");
        } else if (acertos == 14) {
            System.out.println(" quaseNada ");
        } else if (acertos == 15) {
            System.out.println(" quaseTudo ");
        } else if (acertos == 0) {
            System.out.println(" Nada ");
        } else {
            System.out.println(" Não ganhou nenhum prêmio. ");
        }
    }
}
