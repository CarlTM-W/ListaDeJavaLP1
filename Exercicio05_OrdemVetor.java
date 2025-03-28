package ProjetoListaJava1;

/* 
Enunciado: 
Faça um programa que leia 11 valores inteiros e os armazene em um vetor. O programa deve exibir o vetor em ordem direta (do primeiro elemento até o último) e em ordem inversa (do último elemento até o primeiro).
Exemplo:
Vetor: [1,3,5,2,6,0]
Ordem direta: 1 3 5 2 6 0
Ordem inversa: 0 6 2 5 3 1

Dificuldade: 4/10
*/

import javax.swing.JOptionPane;
public class Exercicio05_OrdemVetor {
    public static void main(String[] args) {
        int[] vetor = new int[11];
        for (int i = 0; i < 11; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor " + (i+1) + ":"));
        }
        String direta = "";
        String inversa = "";
        for (int i = 0; i < 11; i++) {
            direta = direta + vetor[i] + " ";
        }
        for (int i = 10; i >= 0; i--) {
            inversa = inversa + vetor[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Ordem direta: " + direta + "\nOrdem inversa: " + inversa);
    }
}
