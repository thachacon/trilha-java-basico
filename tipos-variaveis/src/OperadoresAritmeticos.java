public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //OPERADORES ARITMETICOS:

            double soma = 10.5 + 15.7;
            int subtracao = 113 - 25;
            int multiplicacao = 20 * 7;
            int divisao = 15 / 3;
            int modulo = 18 % 3; 
            double resultado = (10 * 7) + (20 / 4); 

        // O operador de adição (+), quando 
        //utilizado em variáveis do tipo texto, realizará a “concatenação de textos”. Ex:

            String nomeCompleto = "LINGUAGEM" + "JAVA";
            System.out.print(nomeCompleto); //RESULTADO: LINGUAGEMJAVA

        //qual o resultado das expressoes abaixo?

            String concatenacao ="?"; 

            concatenacao = 1+1+1+"1";
                System.out.println(concatenacao);

            concatenacao = 1+"1"+1+1;
                System.out.println(concatenacao);

            concatenacao = 1+"1"+1+"1";
                System.out.println(concatenacao);

            concatenacao = "1"+1+1+1;
                System.out.println(concatenacao);

            concatenacao = "1"+(1+1+1);
                System.out.println(concatenacao); //nesta operação, o programa realizou a operação matemática primeiro, entre aspas, e depois concatenou com o valor "1"
                //resultado: 13 
                // "1" + a soma que dá 3
    }
}
