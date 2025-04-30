package introducao;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /*
    + = soma
    - = subtração
    / = divisão
    * = multiplicação
    % = resto da divisão
     */
        String name = "Nycolas";
        String subname = "Rodrigues";
        int num1 = 10;
        int num2 = 20;
        int resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
            System.out.println(name + " " + subname);

            // &&= os dois precisam ser verdadeiros(and) ||= requer apenas uma volta verdadeira (or) ! (not)

        int age = 25;
        double money = 3900f;
        boolean isDentroDaLeiMenorQueTrinta = age <= 30 && money >= 3888;
        boolean maiorQTrinta = age > 30 && money >= 4925;
        System.out.println("Idade menor que trinta "+ isDentroDaLeiMenorQueTrinta);
        System.out.println("Idade maior que trinta "+ maiorQTrinta);

        double valorPlaystation = 3000;
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 5000;
        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println("compro ou nao?" + isPlaystation5Compravel);

        // = + += -= *= /= %=
        double bonus = 1700;
        bonus += 1000;
        bonus -= 1000;
        bonus %= 2;
        bonus += 1000;
        System.out.println("Bonus: "  + bonus);









    }
}
