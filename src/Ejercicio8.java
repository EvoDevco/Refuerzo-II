import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {4, 5, 2, 1};
        System.out.println(cualFalta(numeros));
    }
    public static int cualFalta(int[] numeros){
        int faltante = -1;
        Arrays.sort(numeros);
        int Numero_mayor = numeros[numeros.length-1];
        int Numero_menor = numeros[0];
        ArrayList<Integer> miArrayList = Arrays.stream(numeros).boxed().collect(Collectors.toCollection(ArrayList::new));
        for (int comprobante = Numero_mayor;comprobante>Numero_menor;comprobante--){
            if (!(miArrayList.contains(comprobante))){
                faltante=comprobante;
            }
        }
        return faltante;
    }
}
