package ProjetoListaJava1;

/* 
Enunciado: 
Numa vota��o destinada a selecionar um entre 10 candidatos, optou-se pela coleta e processamento dos votos por computador. 
Os votos s�o recebidos a partir do teclado, informando o n�mero do candidato que dever� ser um inteiro de dois d�gitos. 
O n�mero zero � usado para indicar voto em branco. 
N�meros inv�lidos (n�o associados a nenhum candidato) indicam votos nulos. 
O programa dever� exibir a classifica��o obtida na vota��o indicando o nome e n�mero do candidato e sua vota��o expressa em valor absoluto de votos e em porcentagem de votos v�lidos. 
Tamb�m dever� ser informado o total de votantes, o total de votos v�lidos, o total de votos brancos e o total de votos nulos. 
O programa dever� indicar se houve um vencedor ou se dever� haver um segundo turno. 
Para ser vitorioso o candidato precisa obter uma quantia superior a 50% dos votos v�lidos. 
Caso seja necess�rio um segundo turno, mostre quem s�o os candidatos que dever�o concorrer.

Dificuldade: 8/10
*/

import javax.swing.JOptionPane;

public class Exercicio06_VotacaoCandidatos {
    public static void main(String[] args) {
        int totalVotantes = Integer.parseInt(JOptionPane.showInputDialog("Mes�rio, informe o total de votantes:"));
        int[] votos = new int[10];
        int votosValidos = 0, votosBrancos = 0, votosNulos = 0;
        String[] candidatos = {"Lula", "Bolsonaro", "Sergio Moro", "Dilma", "Temer", "Boulos", "Marina Silva", "Ciro Gomes", "Jo�o Doria", "Fernando Haddad"};

        for (int i = 1; i <= totalVotantes; i++) {
            int voto = Integer.parseInt(JOptionPane.showInputDialog("Votante " + i + ": Digite o n�mero do candidato (10-19) ou 0 para voto branco:"));
            if (voto == 0) {
                votosBrancos++;
            } else if (voto >= 10 && voto <= 19) {
                votos[voto - 10]++;
                votosValidos++;
            } else {
                votosNulos++;
            }
        }

        String resultado = "Resultado da vota��o:\n";
        resultado += "Total de votantes: " + totalVotantes + "\n";
        resultado += "Votos v�lidos: " + votosValidos + "\n";
        resultado += "Votos brancos: " + votosBrancos + "\n";
        resultado += "Votos nulos: " + votosNulos + "\n\n";

        for (int i = 0; i < 10; i++) {
            int numCand = 10 + i;
            int qtd = votos[i];
            float perc = votosValidos > 0 ? (float) qtd * 100 / votosValidos : 0;
            resultado += candidatos[i] + " (" + numCand + "): " + qtd + " votos, " + perc + "% dos votos v�lidos\n";
        }

        int indiceVencedor = -1;
        for (int i = 0; i < 10; i++) {
            if (votosValidos > 0 && votos[i] * 100 > 50 * votosValidos) {
                indiceVencedor = i;
                break;
            }
        }

        if (indiceVencedor != -1) {
            resultado += "\nVencedor: " + candidatos[indiceVencedor] + " (" + (10 + indiceVencedor) + ") com " + votos[indiceVencedor] + " votos.";
        } else {
            int maior = -1, segundo = -1;
            int indMaior = -1, indSegundo = -1;
            for (int i = 0; i < 10; i++) {
                if (votos[i] > maior) {
                    segundo = maior;
                    indSegundo = indMaior;
                    maior = votos[i];
                    indMaior = i;
                } else if (votos[i] > segundo) {
                    segundo = votos[i];
                    indSegundo = i;
                }
            }
            resultado += "\nSegundo turno necess�rio. Candidatos:\n";
            resultado += candidatos[indMaior] + " (" + (10 + indMaior) + ") - " + maior + " votos\n";
            resultado += candidatos[indSegundo] + " (" + (10 + indSegundo) + ") - " + segundo + " votos";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
