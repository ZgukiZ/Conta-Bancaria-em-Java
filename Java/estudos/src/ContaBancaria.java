import java.security.SecureRandom;
import java.util.Scanner;

public class ContaBancaria {
   public static String gerarNumeroConta(){
    SecureRandom random = new SecureRandom();
       long numeroConta = 10000000L + Math.abs(random.nextLong()) % 90000000L;
       return String.valueOf(numeroConta);

   }
}
