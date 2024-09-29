import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int [] arreglo = new int[20];
        double[] arreglo2 = new double[20];

        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Dame un numero para la posicion " + (i+1));
            arreglo[i] = read.nextInt();

            arreglo2[i] = Math.pow(arreglo[i],2);
        }

        for (int x = 0; x < arreglo.length; x++){
            System.out.println("El arreglo "+ (x+1) +" es "+ arreglo[x] + " y su cuadrado es " + arreglo2[x]);
        }
    }
}