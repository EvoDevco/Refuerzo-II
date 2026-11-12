public class Ejercicio6 {
    public static void main(String[] args) {
        int num = 2048;
        System.out.println(esHyperpar(num));
    }
    public static boolean esHyperpar(int num){
        boolean par= true;
        String numero_s = String.valueOf(num);
        String[] digitos = numero_s.split("");
        for ( String digito:digitos){
            if (Integer.parseInt(digito)%2!=0){
                par = false;
            }
        }
        return par;
    }
}