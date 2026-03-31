import java.util.Scanner;

public class While {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao = 0;
        int totalDeNotas = 0;

        while(nota != -1) {
            System.out.println("Diga sua avaliação para o filme oi -1 pra encerrar: ");
            nota = leitura.nextDouble();
           if (nota != -1) {
               mediaAvaliacao += nota;
               totalDeNotas++;
           }
        }

        System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas);
    }
}
