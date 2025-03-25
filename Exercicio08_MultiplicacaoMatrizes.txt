package ProjetoListaJava1;

/* 
Enunciado: 
Faça um programa que leia duas matrizes A e B, ambas de tamanho 3x3, calcule e exiba a matriz C resultante da multiplicação de A por B. Calcule e exiba também uma matriz D resultante da multiplicação de B por A.

Dificuldade: 7/10
*/

import javax.swing.JOptionPane;
public class Exercicio08_MultiplicacaoMatrizes {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite A[" + i + "][" + j + "]:"));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite B[" + i + "][" + j + "]:"));
            }
        }
        int[][] C = new int[3][3];
        int[][] D = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                D[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    D[i][j] = D[i][j] + B[i][k] * A[k][j];
                }
            }
        }
        String saidaC = "Matriz C (A * B):\n";
        String saidaD = "Matriz D (B * A):\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                saidaC = saidaC + C[i][j] + " ";
                saidaD = saidaD + D[i][j] + " ";
            }
            saidaC = saidaC + "\n";
            saidaD = saidaD + "\n";
        }
        JOptionPane.showMessageDialog(null, saidaC + "\n" + saidaD);
    }
}
