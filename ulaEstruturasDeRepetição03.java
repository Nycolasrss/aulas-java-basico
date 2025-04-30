package introducao;

public class ulaEstruturasDeRepetição03 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra quantas vezes pode ser parcelado
       // valor da parcela precisa ser >= 1000
       double valorTotal= 38000;
        // iniciando o número de parcelas em 1;
        // conte enquanto as parcelas forem menores ou iguais ao valor total;
        // incrementando de uma a uma;
        for(int parcelas = 1; parcelas <=valorTotal; parcelas++){
           // atribuição de valor a variável valorParcela, utilizando p valor total dividido pelo numero de parcelas;
            double valorParcela = valorTotal/parcelas;
           // Delimitação para o valor mínimo de cada parcela, nesse caso R$1.000,00
            if(valorParcela<1000) {
                break;
            }
            System.out.println("Parcelas " +parcelas+ " R$ " +valorParcela);

        }



    }
}
