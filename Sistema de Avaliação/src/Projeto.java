
import java.util.concurrent.ThreadLocalRandom;

public class Projeto {
    public static void main(String[] args) { // Método main vai executar o programa

    }

    static void selecaoCandidatos() {
        // Criei um array de candidatos para ser avaliados durante o processo seletivo
        String[] candidatos = { "EDUARDO", "MARTINEZ", "RYAN", "MATHEUS F", "FELIX T", "IGOR C", "YURI A", "DEPAY",
                "GARRO", "MATHEUS B" };

        int candidatosSelecionados = 0; // Quantos candidatos foram selecionados.
        int candidatoAtual = 0; // Quem é o candidato atual
        double salarioBase = 2000.0; // Trouxe a variável de salário para dentro do métdod
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) { // Enquantos oc candidatos for menor
                                                                                   // que 5, ele vai buscar mais
                                                                                   // candidatos
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido(); // variavél auxiliar para o sistema sugerir o salário, ele
                                                          // está selecionando o método

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga"); // imprimindo a
                                                                                                 // mensagem que o
                                                                                                 // candidato "Matheus
                                                                                                 // F" foi selecionado
                candidatosSelecionados++; // para selecionar os candidatos
            }
            candidatoAtual++; // ele vai verificar outros candidatos.
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) { // esse método não vai retornar nada
        // Paraâmetro salário pretendido

        double salarioBase = 2000.0; // Salário para se encaixar na vaga
        if (salarioBase > salarioPretendido) { // Condições do IF
            System.out.println("Ligar para candidato"); // Condições par avaliar os candidatos
        } else if (salarioBase == salarioPretendido) // ELSE IF -> se não
            System.out.println("Ligar para candidato e fazer contra proposta"); // Condições par avaliar os candidatos
        else {
            System.out.println("Ligar para outro candidato"); // Condições par avaliar os candidatos
        }

    } // Criação de método, antes de usar o algorítimo.
}
