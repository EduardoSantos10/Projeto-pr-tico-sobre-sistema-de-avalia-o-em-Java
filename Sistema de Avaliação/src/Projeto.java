
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Projeto {
    public static void main(String[] args) { // Método main vai executar o programa
        // imprimirSelecionados();
        String[] candidatos = { "EDUARDO", "MARTINEZ", "RYAN", "MATHEUS", "FELIX" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { // DO e WHILE, executa uma vez e verifica se as VAR (condicionais), verificar se
             // o programa sofreu alteração, para poder encerrar o programa.
             // elas precisarão sofrer alterações
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato Realizado com sucesso");
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
        else
            System.out.println(
                    "Não conseguimos contato com " + candidato + ", número máximo tentativas " + tentativasRealizadas
                            + " realizadas ");

    }

    // método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "EDUARDO", "MARTINEZ", "RYAN", "MATHEUS", "FELIX" };

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("Candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        // Criei um array de candidatos para ser avaliados durante o processo seletivo
        String[] candidatos = { "EDUARDO", "MARTINEZ", "RYAN", "MATHEUS", "FELIX", "IGOR", "YURI", "DEPAY",
                "GARRO", "MATHEUS" };

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
