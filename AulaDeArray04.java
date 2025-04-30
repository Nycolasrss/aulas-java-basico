package introducao;

import java.util.Arrays;

public class AulaDeArray04 {

    public static void main(String[] args) {

        int [] num= {3,5,2,45,7,23,76,87};
        int [] numeros= new int[num.length];

        // método para ordenação de um array
        Arrays.sort(num);
        //Arrays.fill(numeros,7);
        // System.arraycopy(num,0,numeros,0,tam); - serve para copiar um array para outro;
       // System.out.printf("Arrays são iguais: %s",Arrays.equals(num,numeros)? "sim" : "nao");
        for(int i=0;i<num.length;i++){
           System.out.println(num[i]);
        }


    }
}
