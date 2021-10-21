import java.util.Scanner;
public class LuanaAssisSilva_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int garagem[] = new int[20];
        int posicao = 0, opcao = 0;
        while (opcao!=3) {
            System.out.println("1 – Cadastrar Veículo");
            System.out.println("2 – Consultar Veículo");
            System.out.println("3 - Sair");
            System.out.println("Informe a opção : ");
            opcao = teclado.nextInt();
            if (opcao == 1) {
                boolean igual = false;
                int posicaoAdicionada =0;
                if (posicaoAdicionada < 20) {
                    System.out.println("Informe o código: ");
                    int codigo = teclado.nextInt();
                    for (int veiculo : garagem) {
                        if (veiculo == codigo) {
                            igual = true;
                            break;
                        }
                    }
                    if (!igual) {
                        garagem[posicaoAdicionada] = codigo;
                        posicaoAdicionada++;
                    } else {
                        System.out.println("Código já existe");
                    }
                }
            } else if (opcao == 2) {
                boolean igual = false;
                posicao = 0;
                System.out.println("Informe o código: ");
                int codigo = teclado.nextInt();
                for (int i = 0; i < 20; i++) {
                    if (garagem[i] == codigo) {
                        igual = true;
                        posicao = i;
                        break;
                    }
                }
                if (!igual) {
                    System.out.println("Não existe. ");
                } else {
                    System.out.println("O veículo está na posição: " + (posicao + 1));
                }
            }else {
                break;
            }
        }
    }
}
