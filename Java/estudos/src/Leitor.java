import java.util.Scanner;

public class Leitor {
    private Scanner scanner;
    public Leitor() {
        this.scanner = new Scanner(System.in);
    }
    public String lerString(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }
    public Integer lerInt(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextInt();
    }
    public void fechar() {
        scanner.close();
    }
}
