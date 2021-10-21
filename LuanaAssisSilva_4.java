import java.util.Scanner;
public class LuanaAssisSilva_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double matriz[][] = new double[30][15];
        String nome[] = new String[30];
        double somaAluno [] = new double[30];
        double somaDisciplina [] = new double[15];
        int auxMaior=0, auxMenor =0, auxMaiorD=0, auxMenorD =0;
        double maiorNota=0, menorNota=999999999, maiorDisciplina=0, menorDisciplina=999999999;
        for (int i = 0; i < 30; i++) {
            System.out.println("Informe o nome do aluno: ");
            nome[i] = teclado.nextLine();
            for (int j = 0; j < 15; j++) {
                System.out.println("Informe a nota do aluno "+nome[i]+" na disciplina " + (j+1)+" : ");
                matriz[i][j] = teclado.nextDouble();
                somaAluno[i]+=matriz[i][j];
                somaDisciplina[j]+= matriz[i][j];
            }
            teclado.nextLine();
        }
        for (int i = 0; i < 30; i++) {
            if(somaAluno[i]>maiorNota){
                maiorNota = somaAluno[i];
                auxMaior = i;
            }
            if (somaAluno[i]<menorNota){
                menorNota =  somaAluno[i];
                auxMenor = i;
            }
        }
        System.out.println("O aluno que obteve a maior soma de notas foi " + nome[auxMaior]+ ", com "+maiorNota);
        System.out.println("O aluno que obteve a menor soma de notas foi " + nome[auxMenor]+ ", com "+menorNota);
        for (int i = 0; i < 30; i++) {
            somaAluno[i] = (somaAluno[i]/15);
            System.out.println("A média do aluno "+ nome[i]+ " é de " + somaAluno[i]);
        }
        for (int j = 0; j < 15; j++) {
            somaDisciplina[j] = (somaDisciplina[j]/30);
            if(somaDisciplina[j]>maiorDisciplina){
                maiorDisciplina = somaDisciplina[j];
                auxMaiorD = j;
            }
            if (somaAluno[j]<menorDisciplina){
                menorDisciplina = somaDisciplina[j];
                auxMenorD = j;
            }
        }
        System.out.println("A disciplina que obteve a maior média de notas foi a " +(auxMaiorD+1)+ ", com "+maiorDisciplina);
        System.out.println("A disciplina que obteve a maior média de notas foi a " +(auxMenorD+1)+ ", com "+menorDisciplina);
    }
}
