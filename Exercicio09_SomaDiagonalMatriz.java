package ProjetoListaJava1;

/* 
Enunciado: 
Ler uma matriz numérica quadrada qualquer e calcular a diferença entre a soma dos elementos acima da diagonal principal e a soma dos elementos abaixo da diagonal principal.

Dificuldade: 6/10
*/

import javax.swing.JOptionPane;
public class Exercicio09_SomaDiagonalMatriz {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a ordem da matriz quadrada:"));
        int[][] M = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento [" + i + "][" + j + "]:"));
            }
        }
        int somaAcima = 0, somaAbaixo = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) somaAcima = somaAcima + M[i][j];
                if (i > j) somaAbaixo = somaAbaixo + M[i][j];
            }
        }
        int diferenca = somaAcima - somaAbaixo;
        JOptionPane.showMessageDialog(null, "Diferença: " + diferenca);
    }
}
