import java.util.Arrays;
public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {5, 7, 4, 3, 1, 6};
        System.out.println(mediana(numeros));
    }
    public static double mediana(int numeros[]){
        Arrays.sort(numeros);
        float media = 0;
        if (numeros.length%2==0){
            media = (float)(numeros[numeros.length/2]+numeros[(numeros.length/2)-1])/2;
        }else{
            media = numeros[numeros.length/2];

        }
    return media;
    }
}