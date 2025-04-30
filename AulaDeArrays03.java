package introducao;
//importação do utilitário scanner
import java.util.Scanner;

public class AulaDeArrays03 {

    public static void main(String[] args) {
       //constante que determina um tamanho fixo
        final int tam= 6;

    char [] gabarito= {'A','B','C','D','E','F'};
    char [] respostas = new char[tam];
    int nota = 0;
    //DECLARAÇÃO DE OBJETO SCANNER E LHE DANDO A INSTÂNCIA DA SAÍDA DO TECLADO
    Scanner scan =new Scanner(System.in);

    //Loop para registrar as notssas dos alunos
    for(int i=0;i<tam;i++){
        System.out.printf("Digite a resposta : ",i);
        respostas[i]=scan.nextLine().charAt(0);
    }

    // loop para comparação das notas digitadas com o gabarito já determinado;
   //  determinação do contador ao tamanho do array respostas, para não ultrapassar do número de questões;
    for( int i=0; i<tam; i++){
        if(respostas[i]==gabarito[i]){
            //com a igualdade entre respostas e gabarito tem-se a aplicação do contador sobre as notas;
            nota++;
        }
    }
    // leitura do processo de comparação feito no loop anterior;
    System.out.printf("Nota do aluno: "+nota);







    }

}

