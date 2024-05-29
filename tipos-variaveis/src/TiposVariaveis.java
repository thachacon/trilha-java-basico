public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        String meuNome = "Thalita Chacon"; //sempre escrito entre aspas
        
        double salarioMinimo = 2500; //essa é forma para declarar números acima de mil

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //menos comum

        int numero = 5; // int é usado para representar numeros inteiros e double para numeros fracionados
        
        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;

        System.out.print(VALOR_DE_PI);
    }
}
