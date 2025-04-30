package introducao;

public class AulaDeArrays02 {

    public static void main(String[] args) {
        // Arrays Multidimencionais

        //declaração de um base com três endereço de espaços

        int [] [] arrayInt = new int[3][];

        // implementação do tamanho de cada subArray

        arrayInt [0] = new int[2];
        arrayInt [1] = new int[]{2,3,1,4};
        arrayInt [2] = new int[6];



       for(int [] arrayBase:arrayInt ){
           System.out.println();
           for(int num : arrayBase){
               System.out.print(num+ " ");
           }
       }
    }
}

