package introducao;

public class AulaEstruturasDeRepetição04 {
    // dado o valor de um carro, descubra quantas vezes pode ser parcelado
    // valor da parcela precisa ser de >= 1000

    public static void main(String[] args) {
        double valorTotal = 58000;
        for(int parcelas = (int) valorTotal; parcelas >=1; parcelas--) {
            // iniciar com o numero de 58000 parcelas recebendo o valor de 1;
            //forçado a entrada em modo int atráves de um cast (int);
            // diminui o numero de parcelas até chegar a condição de apenas uma parcela;
            double valorParcela = valorTotal/parcelas;
            // atribuição de valor a variavel valorParcela;

            if(valorParcela <1000){
                // delimita o valor minimo a ser pago por parcela, R$1000;
                // indica também o parametro para que continue a repetir o laço;
                continue;
                //continua a ação anterior até o ponto delimitado,
                // indo para linha seguinte somente quando encerrar o laço;
                //enquanto o valor da minha parcela for menor que R$ 1000 continue,
                /* Então somente a partir do momento em que o valor da minha parcela se igualar
                a R$ 1000 é que o comando da linha 29 (sout) irá ser executado
                 */

            }

            System.out.println("Número de Parcelas "+parcelas+ " : "+ " R$ " +valorParcela);
            /*Impressão de tudo que sera feito no programa, mas com o uso do "continue",
            só ira ser reproduzido quando a condição for atingida; */

        }






    }
}
