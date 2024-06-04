public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;


        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */

        //EXEMPLO UTILIZANDO ? : 

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
