import java.security.SecureRandom;

public class GeradorDeSenha {

    // Definir os caracteres permitidos na senha
    private static final String LETRAS_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITOS = "0123456789";
    private static final String SIMBOLOS_ESPECIAIS = "!@#$%^&*()-_+=<>?";

    // Combinar todos os caracteres em uma única string
    private static final String TODOS_OS_CARACTERES = LETRAS_MAIUSCULAS + LETRAS_MINUSCULAS + DIGITOS + SIMBOLOS_ESPECIAIS;

    // Método para gerar senha aleatória
    public static String gerarSenha(int comprimento) {
        SecureRandom random = new SecureRandom(); // Gerador de números aleatórios seguro
        StringBuilder senha = new StringBuilder(comprimento);

        for (int i = 0; i < comprimento; i++) {
            // Escolher um caractere aleatório da string de caracteres permitidos
            int indiceAleatorio = random.nextInt(TODOS_OS_CARACTERES.length());
            senha.append(TODOS_OS_CARACTERES.charAt(indiceAleatorio));
        }

        return senha.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Solicitar ao usuário o comprimento da senha
        System.out.print("Digite o comprimento da senha desejada: ");
        int comprimento = scanner.nextInt();

        // Gerar a senha
        String senhaGerada = gerarSenha(comprimento);

        // Exibir a senha gerada
        System.out.println("Sua senha gerada é: " + senhaGerada);

        scanner.close();
    }
}

