public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();

        String nome = leitor.lerString("Digite seu nome: ");
        String cpf = leitor.lerString("Digite seu CPF: ");
        String dataNascimento = leitor.lerString("Digite sua data de nascimento: ");
        String cidade = leitor.lerString("Digite sua cidade: ").trim(); // Remove espaços extras
        String numeroConta = ContaBancaria.gerarNumeroConta();
        String agencia = "";

        if (cidade.equalsIgnoreCase("São Paulo")) {
            agencia = leitor.lerString("Agência 0001 (Guaianases) [1] ou Agência 0002 (Moema) [2]: ").trim();
            if (agencia.equals("1")) {
                agencia = "0001";
            } else if (agencia.equals("2")) {
                agencia = "0002";
            } else {
                System.out.println("Opção inválida! Agência padrão 0001 será atribuída.");
                agencia = "0001";
            }
        } else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
            agencia = leitor.lerString("Agência 0003 (Centro) [1] ou Agência 0004 (Copacabana) [2]: ").trim();
            if (agencia.equals("1")) {
                agencia = "0003";
            } else if (agencia.equals("2")) {
                agencia = "0004";
            } else {
                System.out.println("Opção inválida! Agência padrão 0003 será atribuída.");
                agencia = "0003";
            }
        } else {
            System.out.println("Cidade não encontrada. Atribuindo agência padrão 9999.");
            agencia = "9999";
        }

        Integer saldo = leitor.lerInt("Deposite um valor para saldo inicial: ");

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %d já está disponível para saque.%n",
            nome, agencia, numeroConta, saldo
        );
    }
}
