import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);
        

        System.out.println("Digite o primeiro valor a ser multiplicado: ");
        float valor1 = lerValor.nextFloat();
        System.out.println("Digite o segundo valor a ser multiplicado: ");
        float valor2 = lerValor.nextFloat();
        
        float multiply = valor1 * valor2;

        int resultadoTratado = (int) multiply;

        System.out.println(resultadoTratado);
        // mediaFinal = 8;
        // if (mediaFinal < 6)
        //     System.out.println("REPROVADO");
        // else if (mediaFinal == 6)
        //     System.out.println("PROVA MINERVA");
        // else
        //     System.out.println("APROVADO");
    }
}
