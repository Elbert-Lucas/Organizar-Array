
import java.util.Arrays;
import java.util.Scanner;

public class OrganizarArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero de posiçoes: ");

        int [] array = new int [teclado.nextInt()];

        System.out.println("Comece a digitar os valores: ");

        for (int p=0;p<array.length; p++) {
            array[p] = teclado.nextInt();

        }

        for (int p=0;p<array.length; p++){
            int reserva;

            for (int i=0;i<array.length; i++ ){

                if (array[i]>array[p]){
                    reserva = array[p];
                    array [p] = array [i];
                    array[i] = reserva;

                }

            }
        }

        for (int x : array){
            System.out.print(x+", ");
        }
    }


}
