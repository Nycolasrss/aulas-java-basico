package introducao;

public class AulaDeArrays01 {
     // Arrays agrupam conjuntos com valores diversos, " textos" ou 23;
     // [] <- indica o tamanho do array,
    // variaveis que declaram arrays serão sempre refres
    // são objetos
    public static void main(String[] args) {
// declaração do tipo de array - segunda parte é declarada o tamanho do array;
        int [] idades = new int [7];
        idades[0] = 20;
        idades[1] = 27;
        idades[2] = 25;
        idades[3] = 23;
        idades[4] = 23;
        idades[5] = 29;
        idades[6] = 27;
           //contador para impressão consecutivas de nomes
          // length = comprimento do array
            for(int i=0; i<idades.length; i++)
                System.out.println(idades[i]);





    }
}
