import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el numero del que desea la suma de sus digitos: ");
        String digitos = input.nextLine();
        System.out.println(sumaDigitos(digitos));
    }
    public static String sumaDigitos(String digitos){
        String[] numeros = digitos.split("");
        int suma =0;
        String resultado =String.join("",numeros[0]);
        for (String numero:numeros){
                   suma+= Integer.parseInt(numero); }
        for (int i = 1;i<numeros.length;i++){
            resultado = String.join(" + " , resultado , numeros[i]);
        }
        return resultado + " = " +suma;
    }
}
