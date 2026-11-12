import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el mes de la fecha: ");
        int mes = input.nextInt();
        System.out.println("Ahora indique el dia");
        int dia = input.nextInt();
        System.out.println(diasHastaNochevieja(dia,mes));
    }
    public static int diasHastaNochevieja(int dia, int mes){
        int[] duracion = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            dia = -dia;
            for (int i = mes - 1; i < duracion.length; i++) {
                dia = dia + duracion[i];
            }
        return dia;
    }
}