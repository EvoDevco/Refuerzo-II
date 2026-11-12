public class Ejercicio9 {
    public static void main(String[] args) {
        int dividendo = 6;
        int divisor = 5;
        System.out.println(dividirFactoriales(dividendo,divisor));
    }
    public static int dividirFactoriales(int dividendo, int divisor){
        int solucion = 1;
        for (int multipicador =dividendo;multipicador>divisor;multipicador--){
            solucion=solucion * multipicador;
        }
        return solucion;
    }
}