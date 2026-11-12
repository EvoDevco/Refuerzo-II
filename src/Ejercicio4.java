import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 5, 5, 3, 2, 1, 3, 3, 5, 5};
        System.out.println(moda(numeros));
    }
    public static int moda(int[] numeros){
        int contador1=0;
        int contador2=0;
        Arrays.sort(numeros);
        int numero_moda = numeros[0];
        int previo =numeros[0];
        for (int numero:numeros){
            if (numero==previo){
                contador1++;
            }else{
                previo=numero;
                if (contador1>contador2){
                    numero_moda=numero;
                    contador2=contador1;
                }
                contador1=0;
            }
        }
        return numero_moda;
    }
}