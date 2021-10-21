import java.util.Random;
public class LuanaAssisSilva_3 {
    public static void main(String[] args) {
        int R [][] = new int[10][10];
        int G [][] = new int[10][10];
        int B [][]= new int[10][10];
        int imagem [][]= new int[10][10];
        int pixel_negativo[][] = new int[10][10];
        Random preenche = new Random();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                R[i][j] = preenche.nextInt(256);
                G[i][j] = preenche.nextInt(256);
                B[i][j] = preenche.nextInt(256);
            }
        }
        for (int l = 0; l < 10; l++){
            for (int k = 0; k < 10; k++){
                imagem[l][k] = (R[l][k]+G[l][k]+B[l][k])/3;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("|"+imagem[i][j]+"|");
            }
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                pixel_negativo[i][j]=(255-imagem[i][j]);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("|"+pixel_negativo[i][j]+"|");
            }
        }
    }
}
