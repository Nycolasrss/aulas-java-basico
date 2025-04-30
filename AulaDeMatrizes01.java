package introducao;
import java.security.SecureRandom;
public class AulaDeMatrizes01 {

    public static void main(String[] args) {

        final int linhas = 3;
        final int colunas = 5;
        int[][] matriz = new int[linhas][colunas];

        //for para impressão das linhas, acresentando até o tamanho determinado
        for (int l = 0; l < linhas; l++) {
            //for para impressão das colunas, mesmo esqeuma do anterior
            for (int c = 0; c < colunas; c++) {
                // comando para gerar numeros aleatórios até 100
                matriz[l][c] = new SecureRandom().nextInt(100);
                //imprime os valores dos arrays
                System.out.printf("|" + matriz[l][c] +"|");
            }
            //efetua a quebra de linha para formar uma tabela
           System.out.printf("%n");
        }



    }
}
