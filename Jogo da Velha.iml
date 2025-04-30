import java.util.Scanner;

public class Campo {
    private char simbolo;
    public Campo(){
        this.simbolo=' ';
    }
    public char getSimbolo(){
        return this.simbolo;
    }
    public void setSimbolo(char simbolo){
        if(this.simbolo==' '){
            this.simbolo=simbolo;
        }else{
            System.out.print("Campo já foi utilizado");
        }
    }
    public class JogoDaVelha {
        public static void main(String[] args) {
            // criar o Array das linhas e colunas
            Campo[][] velha = new Campo[3][3];
            // cria a variavel do simbolo inicial do jogo
            char simboloAtual = 'x';
            String vitoria;
            Scanner scan = new Scanner(System.in);

            iniciarJogo(velha);
            // loop que mantém o jogo
            while (true) {
                desenhaJogo(velha);
                vitoria = verificaVitoria(velha);
                if (!vitoria.isEmpty()) {
                    System.out.printf("Jogador %s venceu%n", vitoria);
                    break;
                }
                try {
                    // verifica a jogoda atual,
                    if (verificarJogada(velha, jogar(scan, simboloAtual), simboloAtual)) {
                        if (simboloAtual == 'x') {
                            simboloAtual = 'o';
                        } else {
                            simboloAtual = 'x';
                        }
                    }

                } catch (Exception e) {
                    System.out.print("Erro");
                }
            }
            System.out.print("Fim do jogo");

        }

        // metodo para desenha o jogo no terminal, sem frescura
        public static void desenhaJogo(Campo[][] velha) {
            // indica os numeros das colunas
            System.out.println("   0       1        2 ");
            // formata a primeira linha
            System.out.printf("0  %c   | %c     | %c   %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
            // utilizado para separar as linhas
            System.out.println("-----------------------");
            // formata a segunda linha
            System.out.printf("1  %c   | %c     | %c   %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
            // utilizado para separar as linhas
            System.out.println("-----------------------");
            // foprmata a terceira linha
            System.out.printf("2  %c  " +
                    " | %c     | %c   %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());

        }


        public static int[] jogar(Scanner scan, char sa) {
            int p[] = new int[2];
            System.out.printf("%s %c%n", "Quem joga: ", sa);
            System.out.println("Informa a linha: ");
            p[0] = scan.nextInt();
            System.out.println("Informa a coluna: ");
            p[1] = scan.nextInt();
            return p;
        }

        public static boolean verificarJogada(Campo[][] velha, int t[], char simboloAtual) {
            // verifica na linha e coluna em questão estiver vazio irá receber o simbolo atual digitado
            if (velha[t[0]][t[1]].getSimbolo() == ' ') {
                velha[t[0]][t[1]].setSimbolo(simboloAtual);
                return true;
            } else {
                // se simbolo for diferente de vazio e tentar recber o simbolo atual ira dar false e terá de repetir a jogada
                return false;
            }

        }

        public static void iniciarJogo(Campo[][] velha) {
            for (int l = 0; l < 3; l++) {
                for (int c = 0; c < 3; c++) {
                    velha[l][c] = new Campo();
                }
            }
        }

        public static String verificaVitoria(Campo[][] velha) {
            // percorre todas as linhas
            for (int i = 0; i < 3; i++) {
                //verifica se o campo não é igual a um campo vazio
                if (velha[i][0].getSimbolo() != ' ' &&
                        // verifica se linha i da coluno o tem o mesmo simbolo da linha i e coluna 1 e..
                        velha[i][0].getSimbolo() == velha[i][1].getSimbolo() &&
                        // verifica se o simbolo da linha i coluna 1 e simbolo da linha i e coluna 2 são iguais;
                        velha[i][1].getSimbolo() == velha[i][2].getSimbolo()) {
                    // retorna o simbolo vencedor da linha em questão
                    return String.valueOf(velha[i][0].getSimbolo());
                }
            }


            // Contador que percorre as colunas
            for (int i = 0; i < 3; i++) {
                // verifica o campo em questão não esta vazio e continua a comparação
                if (velha[0][i].getSimbolo() != ' ' &&
                        // compara a igualdade do simbolo da mesma coluna e  das linhas o e 1
                        velha[0][i].getSimbolo() == velha[1][i].getSimbolo() &&
                        // compara os simbolos da mesma coluna e das linhas 1 e 2
                        velha[1][i].getSimbolo() == velha[2][i].getSimbolo()) {
                    // retorna o simbolo vencedor que aparece em todas as linhas e mesma coluna
                    return String.valueOf(velha[0][i].getSimbolo());
                }
            }

            // DIAGONAl START ESQUERDA
            // verificar se o campo não esta vazio
            if (velha[0][0].getSimbolo() != ' ' &&
                    // começa pela esquerda, verifica se o campo da linha e coluna 0 são iguais ao da linha e coluna 1
                    velha[0][0].getSimbolo() == velha[1][1].getSimbolo() &&
                    // verifica se o simbolo da linha e coluna 1 é igual ao simbolo da linha e coluna 2
                    velha[1][1].getSimbolo() == velha[2][2].getSimbolo()) {

                return String.valueOf(velha[0][0].getSimbolo());
            }
            // DIAGONAL START DIREITA
            // verifica se o campo incial da diagonal não esta vazio
            if (velha[0][2].getSimbolo() != ' ' &&
                    // verifica se o campo da linha 0 e cooluna 2 é igual ao simbolo da linha e coluna 1
                    velha[0][2].getSimbolo() == velha[1][1].getSimbolo() &&
                    // verifica se o simbolo da linha e coluna 1 é igual ao simbolo da linha 2 e coluna 0
                    velha[1][1].getSimbolo() == velha[2][0].getSimbolo()) {
                // retorna o simbolo vencedor que aparece em todos os campos em questão
                return String.valueOf(velha[0][2].getSimbolo());
            }

            return "";
        }



                    }
