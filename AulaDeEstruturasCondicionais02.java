package introducao;



public class AulaDeEstruturasCondicionais02 {
   public static void main(String[] args) {
       double salario = 5000;
       String mensagemDoar = "Efetuarei a doação";
       String mensagemNaoDoar = "Sem dinheiro para doar";
       // comparação de valor de variavel já preenchida com um limite destinado
       /* resultado da comparação determinará o resultado da variavel trazendo
       um valor booleano já pré estabelecido para essa situação
       caso seja verdadeiro "?" ou caso seja falso ":" */
       String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;

   System.out.println(resultado);
}}

