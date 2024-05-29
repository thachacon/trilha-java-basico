public class OperadoresDeAtribuicao {
    public static void main(String[] args) {

        // o simbolo = é usado para atribuir um valor na variavel
        String nome = "Thalita"; //string sempre utiliza aspas duplas
        int idade = 30; //int para numeros inteiros
        double peso = 90.5; //double para numeros fracionados. pode-se utilizar float tbm
        char sexo = 'F'; //char usado para UM CARACTERE e deve-se colocar entre aspas simples
        boolean doadorOrgao = false; //boolean sempre true ou falso
        //Date dataNascimento = new Date (); // classe que precisa anteceder com NEW

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
        
    }
}
