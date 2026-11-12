public class Ejercicio7 {
    public static void main(String[] args) {
        int desde = 5;
        int hasta = 63;
        System.out.println(canales(desde, hasta));
    }
    public static int canales(int desde, int hasta){
        int saltos = 0;
        int saltos_normales = hasta-desde;
        if (saltos_normales<0){
            saltos_normales=saltos_normales*-1;
        }
        int saltos_0 = desde+(99-hasta);
        int saltos_99 = (99-desde)+hasta;
        if (saltos_normales<saltos_0 && saltos_normales<saltos_99 ){
            saltos=saltos_normales;
        }else if (saltos_0<saltos_normales && saltos_0<saltos_99 ){
            saltos=saltos_0;
        }else if (saltos_99<saltos_normales && saltos_99<saltos_0 ) {
            saltos = saltos_99;
        }
        return saltos;
    }
}
